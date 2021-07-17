package interviewpreparation;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class XMLExample {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));

        System.out.println("Enter Your Name ");
        String name = br.readLine();
        System.out.println(" Your Name : "+name);
        DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(new File("C:\\test_projects_New\\src\\main\\resources\\elementRepo\\ComputersPage.xml"));

        NodeList nodeList = doc.getElementsByTagName("UIElement");

        for(int i=0;i<nodeList.getLength();i++){

            Node node = nodeList.item(i);
            if(node.getNodeType()==Node.ELEMENT_NODE){
                Element element = (Element) node;
                System.out.println(element.getAttribute("name"));

            }
        }
    }
}
