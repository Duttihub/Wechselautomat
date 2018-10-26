package io;

import java.util.Scanner;
import model.Geldwechselautomat;

public class Eingabe {

	public static int liesBetragEin() {

		boolean tf = true;
		int wechselbetragCent = 0;
		double wechselbetragEuro = 0;
		do {
			Ausgabealternativ.AnfangGeldwechseler();
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			if (str.equalsIgnoreCase("J")) {
				Ausgabealternativ.AngabeCentbetrag();
				wechselbetragCent = liesIntEin();
				tf = false;
			} else if (str.equalsIgnoreCase("N")) {
				Ausgabealternativ.AngabeEurobetrag();
				wechselbetragEuro = liesDoubleEin();
				
				double wechselbetragEuroinCent = wechselbetragEuro * 100;
				wechselbetragCent= (int) wechselbetragEuroinCent;
				//wechselbetragCent = (int) (wechselbetragEuro * 100);
				tf = false;
			
			} else {
			Ausgabealternativ.FehlerhafteEingabe();
			}
		}while(tf);
		

		return wechselbetragCent;

	}

	public static int liesIntEin() {
		boolean tf = true;
		int eingabeInt = 0;
		do {
			Scanner scan = new Scanner(System.in);
			String eingabe = scan.nextLine();
			try {
				eingabeInt = Integer.parseInt(eingabe);
				tf = false;
			} catch (NumberFormatException e) {
				Ausgabealternativ.FehlerhafteEingabe();
				Geldwechselautomat.ablaufGeldwechseler();
			}
		} while (tf);
		return eingabeInt;

	}

	public static double liesDoubleEin() {
		boolean tf = true;

		double eingabeDouble = 0;
		do {
			Scanner scan = new Scanner(System.in);
			String eingabe = scan.nextLine();
			try {
				eingabeDouble = Double.parseDouble(eingabe);
				tf = false;
			} catch (NumberFormatException e) {
			Ausgabealternativ.FehlerhafteEingabe();
				Geldwechselautomat.ablaufGeldwechseler();
			}

		} while (tf);
		return eingabeDouble;
	}

	public static boolean weiterWechseln() {
		boolean tf = true;
		Scanner scan = new Scanner(System.in);
		String eingabe = scan.nextLine();

		if (eingabe.equalsIgnoreCase("J")) {
			tf= true;
			Geldwechselautomat.ablaufGeldwechseler();
			
		}else {
			tf = false;
			Ausgabealternativ.endeAusgabe();
		}

		return tf;

	}

}