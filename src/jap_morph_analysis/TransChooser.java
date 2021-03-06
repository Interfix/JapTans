package jap_morph_analysis;

import java.util.Scanner;

public class TransChooser {

	//Klassenvariablen
	private static final String kunrei = "Kuñrei";
	private static final String hebon = "Hepburn";
	private static final String sys = "kein gültiges System";

	static Scanner userInput = new Scanner(System.in);
	
	//Konstruktoren
	
	//Klassenmethoden
	public static String getSystem() {
		
		System.out.println("Transkription in folgende Systeme ist verfügbar: (K)uñrei / (H)epburn: ");
		String eingabe = new String("-1");

		while (!eingabe.equals("k") || !eingabe.equals("h"))
		{
			eingabe = userInput.next().toLowerCase().toString();
			eingabe = eingabe.replace("\uFEFF", "");
			if (eingabe.equals("k")) 
			{
				System.out.println("\nSie haben " + kunrei + " als Transkriptionssystem gewählt.");
				return kunrei;
			}
			else if (eingabe.equals("h"))
			{
				System.out.println("\nSie haben " + hebon + " als Transkriptionssystem gewählt.");
				return hebon;
			}
			else
			{
				System.out.println("\nSie haben " + sys + " gewählt.");
			}
		
		}
		return null;
	}
}
		