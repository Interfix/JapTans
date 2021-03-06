package jap_morph_analysis;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;



public interface XMLReader {

//Klassenvariablen--------------------------------------------------------------------------------

	String fileLoc = "./res/Kanatabelle.xml";									 //hier ist die XML-Kanatabelle gespeichert
	
	
//Klassenmethoden---------------------------------------------------------------------------------
	
	Document callDoc(String fileLoc);										//holt das XML-Dokument
	NodeList listKanaNodes(Document kanaFile);								//speichert die Kana-Nodes in einer Liste
	void getAttribFromNodes(NodeList kanaNodesList, String[] hxCode); 		//liest den Wert des Attributs "Hex" aus der XML-Datei und speichert diesen als String
	
	
//Konstruktoren-----------------------------------------------------------------------------------
	

}
