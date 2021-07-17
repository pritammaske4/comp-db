package com.herokuapp.automation.utils;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.HashMap;
import java.util.Map;

public class XmlFile {
    public static final Logger logger = Logger.getLogger(XmlFile.class);

    public Map<String, String> getElementRepoMap(String fileName) {

        Map<String, String> elementMap = null;
        try {
            elementMap = new HashMap<>();
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse("src/main/resources/elementRepo/" + fileName + ".xml");
            NodeList nodeList = document.getElementsByTagName("UIElement");
            for (int counter = 0; counter < nodeList.getLength(); counter++) {
                Node node = nodeList.item(counter);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    elementMap.put(element.getAttribute("name"), element.getAttribute("locatorType") + "_TBD_" + element.getAttribute("locatorValue"));
                }
            }
        } catch (Exception ex) {
            logger.trace(ex);
        }
        return elementMap;
    }
}
