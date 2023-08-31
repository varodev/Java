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

public class Main {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{	
		// Referencia del fichero xml
        File file1 = new File("xmlData1.xml");
        // DocumentBuilderFactory y DocumentBuilder generan un documento xml vacío en memoria
        DocumentBuilderFactory dbf1 = DocumentBuilderFactory.newInstance();
        DocumentBuilder db1 = dbf1.newDocumentBuilder();
        // Se vuelca el contenido del fichero xml al objeto document1 (parse)
        Document document1 = db1.parse(file1);
        // Se transforma el texto Unicode del contenido xml (normalize)
        document1.getDocumentElement().normalize();
        // Se extrae el nombre del nodo (getNodeName)
        System.out.println("Elemento raiz: " + document1.getDocumentElement().getNodeName());
        // Se vuelcan los nodos contenidos en el nodo indicado a través de su nombre de etiqueta (getElementsByTagName)
        NodeList nodesList1 = document1.getElementsByTagName("hotel");
        // Se recorren la lista de nodos extraída
        for (int i = 0; i < nodesList1.getLength(); i++){
            // Se extrae el nodo actual
         Node node1 = nodesList1.item(i);
        	// Se obtiene el nombre del nodo actual (getNodeName)
         System.out.println("\nElemento actual: " + node1.getNodeName());
            // getNodeType devuelve un número indicando el tipo de nodo que es (si es un elemento devuelve 1)
            // Node.ELEMENT_NODE devuelve 1, expresando el valor del nodo cuando es un elemento
            // Node.DOCUMENT_NODE devuelve 9, expresando el valor del nodo cuando es un documento
            if (node1.getNodeType() == Node.ELEMENT_NODE){
                // Se realiza una referencia de elemento nodo hijo de la lista de elementos node1
            	Element element1 = (Element) node1;
            	// Se extrae el valor del atributo del elemento a través de su nombre
                System.out.println("Id: " + element1.getAttribute("id"));
                // Se extrae el valor del elemento del elemento a través de su nombre
                System.out.println("Hotel: " + element1.getElementsByTagName("nombre").item(0).getTextContent());
                System.out.println("Categoría: " + element1.getElementsByTagName("categoria").item(0).getTextContent());
                System.out.println("PVP: " + element1.getElementsByTagName("pvp").item(0).getTextContent());
            }
        }
	}
}
