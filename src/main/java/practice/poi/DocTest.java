package practice.poi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;


public class DocTest {

    public static void main(String[] args) throws IOException, InvalidFormatException {
        char a = 9633;
        char b = '\uF052';

        String choose = "□摇号";
        //□摇号R
        System.out.println(choose);

        Map<String, String> maps = new HashMap<>();
        maps.put("${contractCode}", choose);
        maps.put("${brand}", "Porsche");

        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.lock();

        writer("/Users/yufangxing/Programme/github/java/leetCode/practice/src/main/resources/汽车订制购买合同2023.docx",
            "/Users/yufangxing/Programme/github/java/leetCode/practice/src/main/resources/汽车订制购买合同1.docx",
            maps);
    }

    private static void writer(String inputSrc, String outputSrc, Map<String,String> map)
        throws IOException, InvalidFormatException {
        try(InputStream input = new FileInputStream(inputSrc);
            OutputStream output = new FileOutputStream(outputSrc);
            XWPFDocument document = new XWPFDocument(OPCPackage.open(input))) {
            replacePlaceholder(document, map);
            document.write(output);
        }
    }

    private static void replacePlaceholder(XWPFDocument document, Map<String,String> map) {
        List<XWPFParagraph> paragraphs = getParagraphs(document);
        for (XWPFParagraph paragraph: paragraphs) {
            String paragraphText = paragraph.getParagraphText();
            if (StringUtils.isNotBlank(paragraphText)) {
                for (String key: map.keySet()) {
                    if (paragraphText.contains(key)) {
                        String replacedText = StringUtils.replace(paragraphText, key, map.get(key));
                        removeAllRuns(paragraph);
                        insertReplacementRuns(paragraph, replacedText);
                    }
                }
            }
        }
    }

    private static List<XWPFParagraph> getParagraphs(XWPFDocument document) {
        List<XWPFParagraph> paragraphs = new ArrayList<>();
        for(XWPFParagraph paragraph : document.getParagraphs()) {
            paragraphs.add(paragraph);
        }
        for(XWPFTable tab : document.getTables()){
            for(XWPFTableRow row : tab.getRows()){
                for(XWPFTableCell cell : row.getTableCells()){
                    for(XWPFParagraph paragraph : cell.getParagraphs()) {
                        paragraphs.add(paragraph);
                    }
                }
            }
        }
        return paragraphs;
    }

    private static void removeAllRuns(XWPFParagraph paragraph) {
        int size =  paragraph.getIRuns().size();
        for (int i = size - 1; i >= 0; i--) {
            paragraph.removeRun(i);
        }
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
        }
    }


}
