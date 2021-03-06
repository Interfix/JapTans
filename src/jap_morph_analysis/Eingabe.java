package jap_morph_analysis;
import java.util.Scanner;


public class Eingabe {
		
		//Klassenvariablen
		private static final String H = "HIRAGANA"; //für Unicodeblockvergleich
		private static StringBuilder retWort; // Variable für Rückgabewert
		static Scanner userInput = new Scanner(System.in);
		
		//Konstruktoren (keine)
		
		//Klassenmethoden
		public static StringBuilder chkEingabe() {
									
			boolean chkVal = false;
			
			while (chkVal != true)
				{
				System.out.println("Kana plx: ");
				StringBuilder sbChkWort = Eingabe.getEingabe();
				for (int i = sbChkWort.length(); i > 0 ;i--) 
					{
					if (sbChkWort.length() > 0 && Character.isLetter(sbChkWort.charAt(sbChkWort.length()-i)) == true && H == Character.UnicodeBlock.of(sbChkWort.charAt(sbChkWort.length()-i)).toString())
						{
						retWort = sbChkWort;
						chkVal = true;
						}
					else
						{
						chkVal = false;
						break;
						}
					}
			}
			
			return retWort; 
		
		}
		
		private static StringBuilder getEingabe () {
			
			String chkWort = new String(userInput.next());
			chkWort = chkWort.replace("\uFEFF", "");
			StringBuilder sbChkWort = new StringBuilder(chkWort);
			
			return sbChkWort;
		}
}
