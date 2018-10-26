package model;

import io.Ausgabealternativ;
import io.Eingabe;

public class Geldwechselautomat {

	public static final int[] muenze = { 200, 100, 50, 20, 10, 5, 2, 1 };
	public static final int[] muenzenAnzahlGewechselt = new int[8];
	static boolean tf = true;

	public static void ablaufGeldwechseler() {
		
		Geldwechselautomat.umrechnung();

		Ausgabealternativ.AusgabeWeiterWechseln();

		Eingabe.weiterWechseln();

	}

	public static int[] umrechnung() {

		int ausgangswert = Eingabe.liesBetragEin();

		if (ausgangswert >= 388) {
			muenzenAnzahlGewechselt[0] = 1;
			muenzenAnzahlGewechselt[1] = 1;
			muenzenAnzahlGewechselt[2] = 1;
			muenzenAnzahlGewechselt[3] = 1;
			muenzenAnzahlGewechselt[4] = 1;
			muenzenAnzahlGewechselt[5] = 1;
			muenzenAnzahlGewechselt[6] = 1;
			muenzenAnzahlGewechselt[7] = 1;

			int ausgangswertAbzug = ausgangswert - 388;

			for (int i = 0; i < muenze.length; i++) {
				muenzenAnzahlGewechselt[i] = (int) (ausgangswertAbzug / muenze[i]);
				muenzenAnzahlGewechselt[i] = muenzenAnzahlGewechselt[i] + 1;
				ausgangswertAbzug = ausgangswertAbzug % muenze[i];
			}
			Ausgabealternativ.ausgabeErgebnis(ausgangswert);
			return muenzenAnzahlGewechselt;

		} else {

			for (int i = 0; i < muenze.length; i++) {
				muenzenAnzahlGewechselt[i] = ausgangswert / muenze[i];
				ausgangswert = ausgangswert % muenze[i];
			}
			Ausgabealternativ.ausgabeErgebnis(ausgangswert);
			return muenzenAnzahlGewechselt;

		}
	}

}
