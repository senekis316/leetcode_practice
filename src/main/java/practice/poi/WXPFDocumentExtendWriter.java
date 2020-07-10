package practice.poi;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class WXPFDocumentExtendWriter {

    private static final String REGEX = "\\$\\{(?:(?<groupName>[\\u4e00-\\u9fa5]+)(?::))?"
        + "(?<chineseName>[\\u4e00-\\u9fa5]+):(?<fieldName>[a-zA-Z]+)"
        + "(:(?<fieldType>[a-zA-Z_]*)((?::)(?<options>.*?))?)?\\}";

//    private static final String REGEX = "\\$\\{(?:(?<groupName>\\s*[\\u4e00-\\u9fa5]+\\s*)(?::))?"
//        + "(?<chineseName>\\s*[\\u4e00-\\u9fa5]+\\s*):(?<fieldName>\\s*[a-zA-Z]+\\s*)"
//        + "(:(?<fieldType>\\s*[a-zA-Z_]*\\s*)((?::)(?<options>.*?))?)?\\}";




    private static final Pattern PATTERN = Pattern.compile(REGEX);

    private static Collection<WritablePropertyValueDefinition> getPreValues() {
        //${车辆信息:车架号:vin}
        //${车辆信息:型号:model}
        //${车辆信息:品牌:brand}
        //${车辆信息:车身颜色:bodyColor}
        //${车辆信息:内饰颜色:innerColor}
        //${车辆信息:发动机号:engineNumber}
        //${车辆信息:销售合同开票价:salesContractPrice}
        String groupName = "车辆信息";
        Set<WritablePropertyValueDefinition> prePropertyValueDefinitions = new LinkedHashSet<>();
        prePropertyValueDefinitions.add(new WritablePropertyValueDefinition(groupName, "车架号", "vin", "WP1AA2953HLB01750"));
        prePropertyValueDefinitions.add(new WritablePropertyValueDefinition(groupName, "车型", "model", "Macan"));
        prePropertyValueDefinitions.add(new WritablePropertyValueDefinition(groupName, "车身颜色", "bodyColor", "桃红木金属漆"));
        prePropertyValueDefinitions.add(new WritablePropertyValueDefinition(groupName, "内饰颜色", "innerColor", "黑色金属漆"));
        prePropertyValueDefinitions.add(new WritablePropertyValueDefinition(groupName, "发动机号", "engineNumber", "EN19298475"));
        prePropertyValueDefinitions.add(new WritablePropertyValueDefinition(groupName, "品牌", "brand", "Porsche"));
        prePropertyValueDefinitions.add(new WritablePropertyValueDefinition(groupName, "销售合同开票价", "salesContractPrice", "100000.00"));
        //prePropertyValueDefinitions.add(new WritablePropertyValueDefinition("支付信息", "支付方式", "paymentType", "是"));
        return prePropertyValueDefinitions;
    }


    public static void writePropertyValues(
        XWPFDocumentExtend xwpfDocumentExtend,
        Collection<WritablePropertyValueDefinition> propertyValueDefinitions) {
        propertyValueDefinitions.addAll(getPreValues());

        Set<String> fieldNames = new HashSet<>();
        for (WritablePropertyValueDefinition writablePropertyValueDefinition : propertyValueDefinitions) {
            if (fieldNames.contains(writablePropertyValueDefinition.getFieldName())) {
                System.out.println(writablePropertyValueDefinition.getFieldName());
            }
            fieldNames.add(writablePropertyValueDefinition.getFieldName());
        }

        Map<String, WritablePropertyValueDefinition> propertyValueDefinitionMap = propertyValueDefinitions.stream()
            .collect(Collectors.toConcurrentMap(p -> p.getFieldName(), p -> p));
        writePropertyValues(xwpfDocumentExtend, propertyValueDefinitionMap);

    }

    private static void writePropertyValues(
        XWPFDocumentExtend xwpfDocumentExtend,
        Map<String, WritablePropertyValueDefinition> propertyValueDefinitionMap) {
        List<XWPFParagraph> paragraphs = xwpfDocumentExtend.getAllParagraphs();
        for (XWPFParagraph paragraph : paragraphs) {
            if (StringUtils.isNotBlank(paragraph.getParagraphText())) {
                writePropertyValue(paragraph, propertyValueDefinitionMap);
            }
        }
    }

    private static void writePropertyValue(
        XWPFParagraph paragraph,
        Map<String, WritablePropertyValueDefinition> propertyValueDefinitionMap) {
        Matcher matcher = PATTERN.matcher(paragraph.getParagraphText());
        while (matcher.find()) {
            WritablePropertyValueDefinition writablePropertyValueDefinition =
                propertyValueDefinitionMap.get(matcher.group("fieldName"));
            String newParagraphText = getNewParagraphText(matcher, paragraph, writablePropertyValueDefinition);
            writeParagraphText(paragraph, newParagraphText, writablePropertyValueDefinition);
        }
    }

    private static void writeParagraphText(
        XWPFParagraph paragraph,
        String newParagraphText,
        WritablePropertyValueDefinition writablePropertyValueDefinition) {
        int deleteIndex = 1;
        List<XWPFRun> xwpfRuns = paragraph.getRuns();
        if (writablePropertyValueDefinition != null
            && StringUtils.isNotEmpty(writablePropertyValueDefinition.getFieldValue())
            && writablePropertyValueDefinition.getFieldType() == PropertyFieldTypeEnum.OPTION) {
            int index = newParagraphText.indexOf(writablePropertyValueDefinition.getFieldValue());
            paragraph.insertNewRun(0);
            paragraph.insertNewRun(0);
            paragraph.insertNewRun(0);
            xwpfRuns.get(0).setText(newParagraphText.substring(0, index - 1), 0);
            xwpfRuns.get(0).setFontFamily("宋体");
            xwpfRuns.get(1).setText("R");
            xwpfRuns.get(1).setFontFamily("Wingdings 2");
            xwpfRuns.get(2).setText(newParagraphText.substring(index), 0);
            xwpfRuns.get(2).setFontFamily("宋体");
            deleteIndex += 2;
        } else {
            xwpfRuns.get(0).setText(newParagraphText, 0);
            xwpfRuns.get(0).setFontFamily("宋体");
        }
        for (int i = deleteIndex; i < paragraph.getRuns().size(); i++) {
            xwpfRuns.get(i).setText("", 0);
        }
    }

    //交付地点: ${交付:乙方交付:delieryPartyA:OPTION:乙方}
    //${交付:乙方交付:delieryPartyA:OPTION:乙方}

    private static String getNewParagraphText(
        Matcher matcher,
        XWPFParagraph paragraph,
        WritablePropertyValueDefinition writablePropertyValueDefinition) {
        if (writablePropertyValueDefinition != null) {
            if (writablePropertyValueDefinition.getFieldType() == PropertyFieldTypeEnum.OPTION) {
                String option = writablePropertyValueDefinition.getOptions().stream()
                    .map(s -> "□" + s).collect(Collectors.joining("    "));
                return StringUtils.replace(paragraph.getParagraphText(), matcher.group(0), option);
            }
            return StringUtils.replace(paragraph.getParagraphText(), matcher.group(0),
                writablePropertyValueDefinition.getFieldValue());
        }
        return "";
    }

}
