package practice.poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.Set;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

/*
    获取填写字段名称
 */

public class GetDocFillFields {

    public static void main(Set<PropertyGroupResource> propertyGroupResources)
        throws IOException, InvalidFormatException, ParseException {
        String inPath = "/Users/yufangxing/Programme/github/java/leetCode/practice/src/main/resources/汽车订制购买合同2027.docx";
        String outPath = "/Users/yufangxing/Programme/github/java/leetCode/practice/src/main/resources/汽车订制购买合同1.docx";
        try (InputStream input = new FileInputStream(inPath);
            OutputStream output = new FileOutputStream(outPath);
            XWPFDocument xwpfDocument = new XWPFDocument(OPCPackage.open(input))) {
            XWPFDocumentExtend xwpfDocumentExtend = new XWPFDocumentExtend(xwpfDocument);
            Set<WritablePropertyValueDefinition> writablePropertyValueDefinitions =
                PropertyGroupAssembler.toPropertyValues(propertyGroupResources);
            xwpfDocumentExtend.writePropertyValues(writablePropertyValueDefinitions);
            xwpfDocumentExtend.write(output);
        }

        /**
         *     Map<String, String> propertyMap = new HashMap<>();
         *     propertyMap.put("personName", "Annie");
         *     propertyMap.put("deliveryPlace", "Shanghai");
         *     propertyMap.put("otherEngagements", "其他约定");
         *
         *     String inPath = "src/test/resources/word/汽车订制购买合同_V5.docx";
         *     String outPath = "src/test/resources/word/汽车订制购买合同_V5_result.docx";
         *     try (InputStream input = new FileInputStream(inPath);
         *         OutputStream output = new FileOutputStream(outPath)) {
         *       XWPFDocument xwpfDocument = new XWPFDocument(input);
         *       XWPFDocumentExtend xwpfDocumentExtend = new XWPFDocumentExtend(xwpfDocument);
         *       xwpfDocumentExtend.writePropertyValues(propertyMap);
         *       xwpfDocumentExtend.write(output);
         *     }
         */
    }

//    public static Collection<String> readProperties() throws IOException, InvalidFormatException {
//        String inPath = "/Users/yufangxing/Programme/github/java/leetCode/practice/src/main/resources/汽车订制购买合同30.docx";
//        try (InputStream input = new FileInputStream(inPath);
//            XWPFDocument xwpfDocument = new XWPFDocument(OPCPackage.open(input))) {
//            XWPFDocumentExtend xwpfDocumentExtend = new XWPFDocumentExtend(xwpfDocument);
//            return xwpfDocumentExtend.writablePropertyDefinitions();
//        }
//    }

    /*public static Collection<WritablePropertyDefinition> readProperties() throws IOException, InvalidFormatException {
        String inPath = "/Users/yufangxing/Programme/github/java/leetCode/practice/src/main/resources/汽车订制购买合同2026.docx";
        try (InputStream input = new FileInputStream(inPath);
            XWPFDocument xwpfDocument = new XWPFDocument(OPCPackage.open(input))) {
            XWPFDocumentExtend xwpfDocumentExtend = new XWPFDocumentExtend(xwpfDocument);
            return xwpfDocumentExtend.writablePropertyDefinitions();
        }
    }*/

    /*public static void main(String[] args) throws IOException, InvalidFormatException {
        String inPath = "/Users/yufangxing/Programme/github/java/leetCode/practice/src/main/resources/汽车订制购买合同.docx";
        String outPath = "/Users/yufangxing/Programme/github/java/leetCode/practice/src/main/resources/汽车订制购买合同1.docx";
        try (InputStream input = new FileInputStream(inPath);
            OutputStream output = new FileOutputStream(outPath);
            XWPFDocument xwpfDocument = new XWPFDocument(OPCPackage.open(input))) {
            XWPFDocumentExtend xwpfDocumentExtend = new XWPFDocumentExtend(xwpfDocument);
            Collection<WritablePropertyDefinition> writablePropertyDefinitions =
                xwpfDocumentExtend.writablePropertyDefinitions();
            Collection<WritablePropertyValueDefinition> writablePropertyValueDefinitions = new ArrayList<>();
            for (WritablePropertyDefinition writablePropertyDefinition : writablePropertyDefinitions) {
                if (StringUtils.equals(writablePropertyDefinition.getFieldName(), "contractCode")) {
                    WritablePropertyValueDefinition writablePropertyValueDefinition = new WritablePropertyValueDefinition(
                        writablePropertyDefinition, "HT20475847364");
                    writablePropertyValueDefinitions.add(writablePropertyValueDefinition);
                }
                if (StringUtils
                    .equals(writablePropertyDefinition.getFieldName(), "credentialType")) {
                    WritablePropertyValueDefinition writablePropertyValueDefinition = new WritablePropertyValueDefinition(
                        writablePropertyDefinition, "身份证");
                    writablePropertyValueDefinitions.add(writablePropertyValueDefinition);
                }
                if (StringUtils.contains(writablePropertyDefinition.getGroupName(), "交付")) {
                    System.out.println(JacksonUtils.toJson(writablePropertyDefinition));
                }
            }
            xwpfDocumentExtend.writePropertyValues(writablePropertyValueDefinitions);
            xwpfDocumentExtend.write(output);
        }
    }*/

//
//    public static void main(String[] args) throws IOException, InvalidFormatException {
//
//        List<PropertyGroup> propertyGroups =
//            reader(
//                "/Users/yufangxing/Programme/github/java/leetCode/practice/src/main/resources/汽车订制购买合同.docx");
//
//        Map<String, PropertyDescript> propertyDescriptMap = getPropertyDescriptMap(propertyGroups);
//        propertyDescriptMap.get("contractCode").setFieldValue("HT2020198048576");
//        propertyDescriptMap.get("credentialType").setFieldValue("身份证");
//
//        writer(
//            "/Users/yufangxing/Programme/github/java/leetCode/practice/src/main/resources/汽车订制购买合同.docx",
//            "/Users/yufangxing/Programme/github/java/leetCode/practice/src/main/resources/汽车订制购买合同1.docx",
//            propertyDescriptMap);
//    }

//    public static List<PropertyGroup> reader(String inputSrc)
//        throws IOException, InvalidFormatException {
//        try (InputStream input = new FileInputStream(inputSrc);
//            XWPFDocument doc = new XWPFDocument(OPCPackage.open(input))) {
//            String documentFullText = getAllParagraphText(doc);
//            return getPropertyGroups(documentFullText);
//        }
//    }
//
//    public static Matcher getMatcher(String text) {
//        String regex = "\\$\\{(?:(?<groupName>[\\u4e00-\\u9fa5]+)(?::))?"
//            + "(?<chineseName>[\\u4e00-\\u9fa5]+):(?<fieldName>[a-zA-Z]+)"
//            + "(:(?<fieldType>[a-zA-Z]*)((?::)(?<options>.*?))?)?\\}";
//        Pattern pattern = Pattern.compile(regex);
//        return pattern.matcher(text);
//    }
//
//    public static List<PropertyGroup> getPropertyGroups(String documentFullText) {
//        Map<String, Set<PropertyDescript>> propertyGroupMap = new HashMap<>();
//        Matcher matcher = getMatcher(documentFullText);
//        while (matcher.find()) {
//            String groupName = matcher.group("groupName");
//            String fieldName = matcher.group("fieldName");
//            String chineseName = matcher.group("chineseName");
//            PropertyFieldTypeEnum fieldType = PropertyFieldTypeEnum
//                .fromValue(matcher.group("fieldType"));
//            Collection<String> options = null;
//            if (matcher.group("options") != null) {
//                options = Arrays.stream(matcher.group("options").split(","))
//                    .collect(Collectors.toList());
//            }
//            Set<PropertyDescript> propertyDescripts = propertyGroupMap
//                .getOrDefault(groupName, new HashSet<>());
//            propertyDescripts.add(new PropertyDescript(fieldName, chineseName, fieldType, options));
//            propertyGroupMap.put(groupName, propertyDescripts);
//        }
//        List<PropertyGroup> propertyGroups = new ArrayList<>();
//        for (Entry<String, Set<PropertyDescript>> entry : propertyGroupMap.entrySet()) {
//            propertyGroups.add(new PropertyGroup(entry.getKey(), entry.getValue()));
//        }
//        System.out.println(JacksonUtils.toJson(propertyGroups));
//        return propertyGroups;
//    }
//
//    public static String getAllParagraphText(XWPFDocument doc) {
//        List<XWPFParagraph> paragraphs = getAllParagraphs(doc);
//        StringBuilder sb = new StringBuilder();
//        for (XWPFParagraph paragraph : paragraphs) {
//            sb.append(paragraph.getParagraphText());
//        }
//        return sb.toString();
//    }
//
//    public static List<XWPFParagraph> getAllParagraphs(XWPFDocument doc) {
//        List<XWPFParagraph> paragraphs = new ArrayList<>();
//        paragraphs.addAll(doc.getParagraphs());
//        for (XWPFTable tab : doc.getTables()) {
//            for (XWPFTableRow row : tab.getRows()) {
//                for (XWPFTableCell cell : row.getTableCells()) {
//                    paragraphs.addAll(cell.getParagraphs());
//                }
//            }
//        }
//        return paragraphs;
//    }
//
//    public static Map<String, PropertyDescript> getPropertyDescriptMap(
//        List<PropertyGroup> propertyGroups) {
//        return propertyGroups.stream()
//            .map(PropertyGroup::getPropertyDescripts)
//            .flatMap(Collection::stream)
//            .collect(Collectors.toConcurrentMap(PropertyDescript::getFieldName, p -> p));
//    }
//
//    public static void writer(String inputSrc, String outputSrc,
//        Map<String, PropertyDescript> propertyDescriptMap)
//        throws IOException, InvalidFormatException {
//        try (InputStream input = new FileInputStream(inputSrc);
//            OutputStream output = new FileOutputStream(outputSrc);
//            XWPFDocument docx = new XWPFDocument(OPCPackage.open(input))) {
//            writeDocumentContent(docx, propertyDescriptMap)
//            docx.write(output);
//        }
//    }
//
//    private static void writeDocumentContent(XWPFDocument docx, Map<String, PropertyDescript> propertyDescriptMap) {
//        List<XWPFParagraph> paragraphs = getAllParagraphs(docx);
//        for (XWPFParagraph paragraph : paragraphs) {
//            replacePlaceholder(paragraph, propertyDescriptMap);
//        }
//    }
//
//    private static void replacePlaceholder(XWPFParagraph paragraph,
//        Map<String, PropertyDescript> propertyDescriptMap) {
//        String paragraphText = paragraph.getParagraphText();
//        if (StringUtils.isNotBlank(paragraphText)) {
//            Matcher matcher = getMatcher(paragraphText);
//            while (matcher.find()) {
//                PropertyDescript propertyDescript = propertyDescriptMap
//                    .get(matcher.group("fieldName"));
//                if (propertyDescript != null) {
//                    String replaceText;
//                    if (propertyDescript.getFieldType() == PropertyFieldTypeEnum.TEXT) {
//                        replaceText = StringUtils.replace(paragraphText, matcher.group(0),
//                            propertyDescript.getFieldValue());
//                    } else {
//                        String option = propertyDescript.getOptions().stream().map(s -> "□" + s)
//                            .collect(Collectors.joining("    "));
//                        replaceText = StringUtils.replace(paragraphText, matcher.group(0), option);
//                    }
//                    replaceParagraphText(paragraph, replaceText);
//                }
//            }
//        }
//    }
//
//    public static void replaceParagraphText(XWPFParagraph paragraph, String replaceText) {
//        List<XWPFRun> xwpfRuns = paragraph.getRuns();
//        for (int i = 0; i < xwpfRuns.size(); i++) {
//            if (i == 0) {
//                xwpfRuns.get(i).setText(replaceText, 0);
//            } else {
//                xwpfRuns.get(i).setText("", 0);
//            }
//        }
//
//    }
}
