package practice.poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;


public class DocTest2 {

    public static void main(String[] args) throws IOException, InvalidFormatException {
        char a = 9633;
        char b = '\uF052';

        String choose = "□摇号";
        //□摇号R
        System.out.println(choose);

        Map<String, String> maps = new HashMap<>();
        maps.put("${contractCode}", choose);
        maps.put("${brand}", "Porsche");

        writer("/Users/yufangxing/Programme/github/java/leetCode/practice/src/main/resources/汽车订制购买合同.docx",
            "/Users/yufangxing/Programme/github/java/leetCode/practice/src/main/resources/汽车订制购买合同1.docx",
            maps);
    }

    public static void writer(String inputSrc, String outputSrc, Map<String,String> map)
        throws IOException, InvalidFormatException {

        try(InputStream input = new FileInputStream(inputSrc);
            OutputStream output = new FileOutputStream(outputSrc);
            XWPFDocument doc = new XWPFDocument(OPCPackage.open(input))) {
            /**
             * 替换段落中指定的文本
             */
            for(XWPFParagraph paragraph : doc.getParagraphs()) {
                replacePlaceholder(paragraph, map);
            }

            /**
             * 替换表格中指定的文字
             */
            for(XWPFTable tab : doc.getTables()){
                for(XWPFTableRow row : tab.getRows()){
                    for(XWPFTableCell cell : row.getTableCells()){
                        //注意，getParagraphs一定不能漏掉
                        //因为一个表格里面可能会有多个需要替换的文字
                        //如果没有这个步骤那么文字会替换不了
                        for(XWPFParagraph paragraph : cell.getParagraphs()) {
                            replacePlaceholder(paragraph, map);
                        }
                    }
                }
            }

            doc.write(output);

        }
    }

    private static void replacePlaceholder(XWPFParagraph paragraph, Map<String,String> map) {
        String paragraphText = paragraph.getParagraphText();
        if (StringUtils.isNotBlank(paragraphText)) {
            for (String key : map.keySet()) {
                if (paragraphText.contains(key)) {
                    String replacedText = StringUtils.replace(paragraphText, key, map.get(key));
                    removeAllRuns(paragraph);
                    insertReplacementRuns(paragraph, replacedText);
                }
            }
        }
    }

    private static void removeAllRuns(XWPFParagraph paragraph) {
        System.out.println("oldParagraph:" + paragraph.getParagraphText());
        int size =  paragraph.getIRuns().size();
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(paragraph.removeRun(i));
        }
        System.out.println("deleteParagraph:" + paragraph.getParagraphText());
    }


    private static void insertReplacementRuns(XWPFParagraph paragraph, String replacedText) {

        String[] replacementTextSplitOnCarriageReturn;

        if (StringUtils.contains(replacedText, "□") ) {
            replacementTextSplitOnCarriageReturn = replacedText.split("");
        } else {
            replacementTextSplitOnCarriageReturn = StringUtils.split(replacedText, "\n");
        }

        for (int j = 0; j < replacementTextSplitOnCarriageReturn.length; j++) {

            String part = replacementTextSplitOnCarriageReturn[j];

            XWPFRun newRun = paragraph.insertNewRun(j);
            if (StringUtils.contains(part, "□")) {
                newRun.setText("R");
                newRun.setFontFamily("Wingdings 2");
            } else {
                newRun.setText(part);
            }

            /*if (j + 1 < replacementTextSplitOnCarriageReturn.length) {
                newRun.addCarriageReturn();
            }*/
        }

        System.out.println("newParagraph:" + paragraph.getParagraphText());
    }


}
