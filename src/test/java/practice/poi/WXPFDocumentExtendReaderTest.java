package practice.poi;

import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.junit.Test;

public class WXPFDocumentExtendReaderTest {

    @Test
    public void readPropertyNames() throws IOException, InvalidFormatException {
        String inPath = "/Users/yufangxing/Programme/github/java/leetCode/practice/src/main/resources/汽车订制购买合同30.docx";
        try (InputStream input = new FileInputStream(inPath);
            XWPFDocument xwpfDocument = new XWPFDocument(OPCPackage.open(input))) {
            XWPFDocumentExtend xwpfDocumentExtend = new XWPFDocumentExtend(xwpfDocument);
            Collection<String> propertyNames = WXPFDocumentExtendReader.readPropertyNames(xwpfDocumentExtend);
            assertTrue(propertyNames.contains("unitTel"));
        }
    }

}