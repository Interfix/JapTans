package jap_morph_analysis;
//import org.xml.sax.*;	// read-only XML access; good for large amount of nodes
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;	// read XML directly into memory as objects; write back into file
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

//import java.io.IOException;

//import javax.xml.parsers.*;	// store XML elements as DOM objects


public abstract class HexToLatin implements XMLReader {

//Klassenvariablen--------------------------------------------------------------------------------
	
	public Document kanaFile;
	public NodeList kanaNodesList;
	public StringBuilder transcription = new StringBuilder();

	
//Klassenmethoden---------------------------------------------------------------------------------
	
	public Document callDoc(String fileLoc)
	{
		try
		{
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = builderFactory.newDocumentBuilder();
			return dBuilder.parse(new InputSource(fileLoc));
		} 
			catch (ParserConfigurationException e) {e.printStackTrace();}
			catch (SAXException e) {e.printStackTrace();}
			catch (IOException e) {e.printStackTrace();}
		
		return null;
	}
	
//------------------------------------------------------------------------------------------------	
	
	public NodeList listKanaNodes(Document kanaFile)
	{
		return kanaFile.getElementsByTagName("Kana");
	}
	
//------------------------------------------------------------------------------------------------
	
	public abstract void getAttribFromNodes(NodeList kanaNodesList, String[] hxCode);


//Konstruktoren-----------------------------------------------------------------------------------
	

	public HexToLatin()
	{
		
	}
	
	public HexToLatin(String[] hxCode)
	{
		kanaFile = callDoc(XMLReader.fileLoc);
		kanaNodesList = listKanaNodes(kanaFile);
		getAttribFromNodes(kanaNodesList, hxCode);
	}
}
	
