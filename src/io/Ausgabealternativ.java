package io;

import model.Geldwechselautomat;

public class Ausgabealternativ {

	public static void AnfangGeldwechseler() {

		System.out.println("Welchen Betrag soll der Automat für Sie wechseln?");
		System.out.println("Möchten Sie Ihre Angabe in Cent machen? J/N");
	}

	public static void AngabeCentbetrag() {

		System.out.println("Welchen Centbetrag möchten Sie in Münzen gewechselt haben?");

	}

	public static void AngabeEurobetrag() {

		System.out.println("Welchen Eurobetrag möchten Sie in Münzen gewechselt haben? Bitte geben Sie Komma als Punkt an.");
	}

	public static void FehlerhafteEingabe() {

		System.out.println("Ungültige Eingabe. Bitte machen Sie eine gültige Angabe");

	}

	public static void AusgabeWeiterWechseln() {

		System.out.println("Möchten Sie einen weiteren Betrag wechseln?J /N");
	}

	public static void ausgabeErgebnis(int centwertbeginn) {

		String[] ausgabeMuenzen = { "2", "1", "0,50", "0,20", "0,10", "0,5", "0,02", "0,01" };

		double ausgabewert = (double) centwertbeginn / 100;
		System.out.println("Sie wollten den Betrag " + ausgabewert + "€ in Münzen gewechselt bekommen.");

		for (int i = 0; i < ausgabeMuenzen.length; i++) {
			System.out.println("Anzahl der " + ausgabeMuenzen[i] + "€: " + Geldwechselautomat.muenzenAnzahlGewechselt[i]);
		}
	}

	public static void endeAusgabe() {

		System.out.println("Vielen Dank. Geldwechselautomat wurde beendet");

	}

}
