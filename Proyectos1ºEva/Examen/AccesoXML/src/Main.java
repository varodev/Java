import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Main {

	public static void main(String[] args) {
		//Refencoa deñ fichero xml:
		File file1 = new File("xmlData.xml");
		//DocumentBuilderFactory y DocumenteBuilder generaran un documento xml vacio en memoria
		DocumentBuilderFactory dbf1 = DocumentBuilderFactory.newNSInstance();
		DocumentBuilder db1 = dbf1.newDocumentBuilder();
		//Se vuelca el contenido del fichero xml al objeto document1 (parse)
		Document document1 = db1.parse(file1);
		//Se trasformará el texto unicode del contenido xml (normalize)
		document1.getDocumentElement().normalize();
		//Se extrae el nombre del nodo (getNodoName)
		System.out.println("Elemento raiz:" +  document1.getDocumentElement());
		//Se vuelcan los nodos contenidos en el nodo indicado a traves de su nombre de etiqueta
		NodeList nodesList1 = document1.getElementById("hotel");
		//Se recorren la lisa de nodos extraidos
		for(int i =0;i <nodesList1;i++) {
			//se extrae el nodo actual
			Node node1 = nodesList1.item(i);
			//getNodeType devuelve un numero indicando el tipo de nodo que es (si es un elemento)
			//Node.ELEMENT_NODE devuelve1, expresando el valor el nodo cuando es un elmento
			//Node.DOCUMENT_NODE devuelve 9, expresando el valor del nodo cuand es un doucmento
			if(node1.getNodeType()==Node.ELEMENT_NODE) {
				//se realiza una referencia de elemeno nodo hijo de la lista de elementos nodeList1
				Element element1 = (Element)node1;
				//se extrea el vlaor del atributo del elemento a traves de su nombre
				System.out.println("id" + element1.getAttribute("id"));
				//
			}
		}


	}

}
