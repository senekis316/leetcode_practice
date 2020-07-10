package practice.poi;

import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class XWPFDocumentExtend {

    private XWPFDocument xwpfDocument;

    public XWPFDocumentExtend(XWPFDocument xwpfDocument) {
        this.xwpfDocument = xwpfDocument;
    }

    public XWPFDocument getXWPFDocument() {
        return xwpfDocument;
    }

    public String getAllParagraphText() {
        return getAllParagraphs().stream()
            .map(XWPFParagraph::getParagraphText).collect(Collectors.joining());
    }

    public List<XWPFParagraph> getAllParagraphs() {
        List<XWPFParagraph> paragraphs = new ArrayList<>();
        paragraphs.addAll(this.getTableParagraphs());
        paragraphs.addAll(xwpfDocument.getParagraphs());
        return paragraphs;
    }

    private List<XWPFParagraph> getTableParagraphs() {
        return xwpfDocument.getTables().stream()
            .map(XWPFTable::getRows).flatMap(Collection::stream)
            .map(XWPFTableRow::getTableCells).flatMap(Collection::stream)
            .map(XWPFTableCell::getParagraphs).flatMap(Collection::stream).collect(Collectors.toList());
    }

    public void writePropertyValues(Collection<WritablePropertyValueDefinition> propertyValueDefinitions)
        throws ParseException {
        WXPFDocumentExtendWriter.writePropertyValues(this, propertyValueDefinitions);
    }

    public void write(OutputStream outputStream) throws IOException {
        xwpfDocument.write(outputStream);
    }

}
