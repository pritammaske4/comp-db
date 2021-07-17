package pyramid;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KeywordInsertion {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {

        XPath xPath =  XPathFactory.newInstance().newXPath();

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document document = db.parse("C:/gitprojects/Hawk-Demo/Pyramid_Template.jmx");
        document.normalizeDocument();
        NodeList nodeList = document.getElementsByTagName("TransactionController");

        List<Node> keywordList =new ArrayList();
        for(int i=0;i<nodeList.getLength();i++){
            if(nodeList.item(i).getNodeType()==Node.ELEMENT_NODE  && ((Element)nodeList.item(i)).getAttribute("testname").contains("key_") ){
               keywordList.add(nodeList.item(i));
            }
        }

        for (int i=0;i<keywordList.size();i++){

        }

    }
}
