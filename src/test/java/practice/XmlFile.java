package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlFile {

    public void readXml(String fileName) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory documentBuilderFactory= DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(fileName);
        document.normalizeDocument();

        NodeList nodeList = document.getElementsByTagName("httpSample");

        for (int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);

            if (node.getNodeType()==Node.ELEMENT_NODE){
                Element element = (Element)node;
                System.out.println("API : "+element.getAttribute("lb"));
            }
        }
    }

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        new XmlFile().readXml("C:\\Users\\maskepri\\Desktop\\result.xml");
    }



    public boolean  isPageReady(WebDriver driver){
       boolean readyStateComplete = false;
        while (!readyStateComplete){
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            readyStateComplete = executor.executeScript("return document.readyState") == "complete";
        }
        return  readyStateComplete;
    }




}
