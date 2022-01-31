package zoo;

import java.time.LocalDate;
import java.util.List;

public class Zvire {
	/*
	 * Atributy tøídy
	 */
	LocalDate datumNarozeni;
	List<Integer> hodinyKrmeni;
	int pocetKrmeniZaDen;
	String jmeno;
	boolean zijuVCesku;
	/*
	 * Metoda pro výpis atributù tøídy
	 */
	void vypisInformace() {
		System.out.println("Zvíøe se narodilo v " + datumNarozeni + ", krmí se v " + vypisCasyKrmeni() + " ");
	}
	/*
	 * Konstruktor
	 */
	public Zvire(LocalDate datumNarozeni, List<Integer> hodinyKrmeni, int pocetKrmeniZaDen, String jmeno, boolean zijuVCesku) {
		this.datumNarozeni = datumNarozeni;
		this.hodinyKrmeni = hodinyKrmeni;
		this.pocetKrmeniZaDen = pocetKrmeniZaDen;
		this.jmeno = jmeno;
		this.zijuVCesku = zijuVCesku;
	}
	/*
	 * Metoda pro navrácení èasù krmení jako jeden String pro jednodušší výpis
	 */
	public String vypisCasyKrmeni() {
		String vypis = "";
		for(Integer s : hodinyKrmeni) {
			vypis  = (vypis + ", ");
			vypis  = (vypis + s);
		}
		return vypis;
	}
}
