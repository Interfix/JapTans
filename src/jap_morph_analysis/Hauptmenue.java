package jap_morph_analysis;

import java.sql.SQLException;

public class Hauptmenue {

//Klassenvariablen--------------------------------------------------------------------------------
	
	public static StringBuilder sbInpWort;
	public static String[] hxCode;
	public static String transSys = new String();

//Klassenmethoden---------------------------------------------------------------------------------
	
	
//Konstruktoren-----------------------------------------------------------------------------------

	
	public static void main(String[] args)
	{
		
		sbInpWort = Eingabe.chkEingabe();
		
		hxCode = KanaToHex.getHexCode(sbInpWort);
		
		transSys = TransChooser.getSystem();	
			if (transSys.equals("Kuñrei"))
			{
				new HexToKunrei(hxCode);
			}
			else if (transSys.equals("Hepburn"))
			{
				new HexToHebon(hxCode);
			}
			
		System.out.println("Wir haben eine Transkription:" + HexToKunrei.trans);
		
			
		
		try {
			DBConnect db = new DBConnect();
			db.registerDriver();
			db.connectDB();
		} catch (ClassNotFoundException e) {
			System.out.println("Es konnte kein Datenbanktreiber gefunden werden.");
		} catch (SQLException e) {
			System.out.println("Es konnte keine Datenbankverbindung hergestellt werden.");
		}
		
	}

}
