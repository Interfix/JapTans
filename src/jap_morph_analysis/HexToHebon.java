package jap_morph_analysis;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class HexToHebon extends HexToLatin {

//Klassenvariablen--------------------------------------------------------------------------------
	private boolean tuFlag = false;
	
//Klassenmethoden---------------------------------------------------------------------------------
	
	public void getAttribFromNodes(NodeList kanaNodesList, String[] hxCode)
	{
		for (int i = 0; i < hxCode.length; i++)
		{
			String kanaHxCode = hxCode[i];
			//kanaHxCode = kanaHx.replace("\uFEFF", "");					//optional, entfernt BOMs aus dem String
			
			for (int j = 0; j < kanaNodesList.getLength(); j++)
			{
				Element kanaElement = (Element)kanaNodesList.item(j);
				String kanaElementCode = kanaElement.getAttribute("hex");
				//kanaHex = kanaHex.replace("\uFEFF", "");					//optional, entfernt BOMs aus dem String
				
				if (String.valueOf(kanaHxCode).equals(String.valueOf(kanaElementCode)))
				{
					if (String.valueOf(kanaHxCode).equals("3083") || 
						String.valueOf(kanaHxCode).equals("3085") ||
						String.valueOf(kanaHxCode).equals("3087"))
					{
						transcription.trimToSize();
						transcription.deleteCharAt(transcription.length()-1);
					}
					
					if (tuFlag == true)
					{
						transcription.trimToSize();
						transcription.deleteCharAt(transcription.length()-1);
						tuFlag = false;
					}
					
					if (String.valueOf(kanaHxCode).equals("3063"))
					{
						tuFlag = true;
					}
					
					transcription.append(kanaElement.getElementsByTagName("Hepburn").item(0).getFirstChild().getTextContent());
															
					break;
				}
				
			}
		}
		System.out.println("\nTranskription in " + Hauptmenue.transSys + ": " + transcription);
	}
	
		
//Konstruktoren-----------------------------------------------------------------------------------
	
	public HexToHebon()
	{
		
	}

	public HexToHebon(String[] hxCode)
	{
		super(hxCode);		
		
	}	
}
