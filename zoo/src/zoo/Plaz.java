package zoo;

import java.time.LocalDate;
import java.util.List;

public class Plaz extends Zvire {
	public final boolean teplokrevnost = false;
	public Plaz(LocalDate datumNarozeni, List<Integer> hodinyKrmeni, int pocetKrmeniZaDen, String jmeno, boolean zijuVCesku, double telesnaTeplota) {
		super(datumNarozeni, hodinyKrmeni, pocetKrmeniZaDen, jmeno, zijuVCesku);
	}
	void vypisInformace() {
		System.out.println("Plaz není teplokrevný, narodil se " + datumNarozeni + ", krmí se v " + vypisCasyKrmeni() + "");
	}
}
