package practice;


import com.fasterxml.jackson.databind.ObjectMapper;
//import javaBean.vehicle.GetOrderResponseType;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import practice.leecode.Stack_CalPoints_682;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathExpressionException;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilderFactory;

import static org.junit.Assert.assertEquals;


public class Stack_CalPoints_682Test {

    @Test
    public void calPoints() {
        Stack_CalPoints_682 stack_CalPoints_682 = new Stack_CalPoints_682();
        assertEquals(30, stack_CalPoints_682.calPoints(new String[]{"5","2","C","D","+"}));
    }

    @Test
    public void convertXmlToJavaBean() throws SAXException, ParserConfigurationException, SOAPException, XPathExpressionException, TransformerException, IOException, JAXBException {
        try(InputStream input = new FileInputStream("src/main/resources/vehicle.xml")) {
            //GetOrderResponseType getOrderResponseType = convertXmlToJavaBean(GetOrderResponseType.class, input);
            //System.out.println(new ObjectMapper().writeValueAsString(getOrderResponseType));

            //GetOrderResponseType getOrderResponseType = convertXmlToJavaBean(GetOrderResponseType.class, input);
            //System.out.println(new ObjectMapper().writeValueAsString(getOrderResponseType));
        }
    }

    public static DocumentBuilderFactory newDocumentBuilderFactory() {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        return dbf;
    }

    public <T> T convertXmlToJavaBean(Class<T> clazz, InputStream input)
            throws IOException, JAXBException, SOAPException, ParserConfigurationException, SAXException, XPathExpressionException, TransformerException {
        JAXBContext context = JAXBContext.newInstance(clazz);
        Document document = convertXmlToDocument(input);
        return context.createUnmarshaller().unmarshal(document, clazz).getValue();
    }

    public Document convertXmlToDocument(InputStream input) throws SOAPException, IOException, TransformerException, XPathExpressionException, ParserConfigurationException, SAXException {
        SOAPMessage soapMessage = MessageFactory.newInstance().createMessage(null, input);
        Document document = soapMessage.getSOAPBody().extractContentAsDocument();
        InputSource inputSouce = new InputSource(new StringReader(formatXml(document)));
        return newDocumentBuilderFactory().newDocumentBuilder().parse(inputSouce);
    }

    private String formatXml(Document document) throws TransformerException {
        String xmlString = convertDocumentToString(document);
        return deleteXmlnsInfo(xmlString);
    }

    @Test
    public void convertXmlToJavaBean2() throws SAXException, ParserConfigurationException, SOAPException, XPathExpressionException, TransformerException, IOException, JAXBException {
        try(InputStream input = new FileInputStream("src/main/resources/vehicle.xml")) {
            String xmlStr = IOUtils.toString(input, "utf-8");
            xmlStr = deleteXmlnsInfo(xmlStr);
            System.out.println(xmlStr);
            //GetOrderResponseType getOrderResponseType = convertXmlToJavaBean(GetOrderResponseType.class, input);
            //System.out.println(new ObjectMapper().writeValueAsString(getOrderResponseType));

            //GetOrderResponseType getOrderResponseType = convertXmlToJavaBean(GetOrderResponseType.class, input);
            //System.out.println(new ObjectMapper().writeValueAsString(getOrderResponseType));
        }
    }

    private String deleteXmlnsInfo(String xmlStr) {
        xmlStr = deleteXmlnsInfo(xmlStr, "<", Pattern.compile("<n[0-9]:"));
        xmlStr = deleteXmlnsInfo(xmlStr, "</", Pattern.compile("</n[0-9]{1}:{1}"));
        xmlStr = deleteXmlnsInfo(xmlStr, "", Pattern.compile("\\sxmlns:n[0-9]{1}=\".*\""));
        return xmlStr;
    }

    private String deleteXmlnsInfo(String xmlStr, String replaceStr, Pattern pattern) {
        Matcher matcher = pattern.matcher(xmlStr);
        return matcher.replaceAll(replaceStr);
    }

    private static String convertDocumentToString(Document doc) throws TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        StringWriter writer = new StringWriter();
        transformer.transform(new DOMSource(doc), new StreamResult(writer));
        return writer.getBuffer().toString();
    }

}