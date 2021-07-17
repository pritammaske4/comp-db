package com.herokuapp.automation;

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

public class TestJava {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("C:\\test_projects_New\\src\\main\\resources\\elementRepo\\ComputersPage.xml"));

        NodeList nodeList= document.getElementsByTagName("UIElement");

        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if (node.getNodeType()==Node.ELEMENT_NODE){
                Element element= (Element)node;
                element.getAttribute("name");
                System.out.println(element.getAttribute("name"));
            }
        }



    }
}
