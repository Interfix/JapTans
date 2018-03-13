package jap_morph_analysis;

public class KanaToHex {
	
		//Klassenvariablen
		private static String[] hexCode;

		//Konstruktoren (keine)

	
		//Klassenmethoden
		public static String[] getHexCode(StringBuilder sbInpWort) {
		
			char[] sInpWort = sbInpWort.toString().toCharArray();
			hexCode = new String[sbInpWort.length()];
			
			for (int i = 0; i < sInpWort.length; i++) 
			{
				hexCode[i] = Integer.toHexString(sInpWort[i]);
			}
			
			return hexCode;
		}

}