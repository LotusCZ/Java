package zoo;

import java.time.LocalDate;
import java.util.List;

public class Zvire {
	/*
	 * Atributy t��dy
	 */
	LocalDate datumNarozeni;
	List<Integer> hodinyKrmeni;
	int pocetKrmeniZaDen;
	String jmeno;
	boolean zijuVCesku;
	/*
	 * Metoda pro v�pis atribut� t��dy
	 */
	void vypisInformace() {
		System.out.println("Zv��e se narodilo v " + datumNarozeni + ", krm� se v " + vypisCasyKrmeni() + " ");
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
	 * Metoda pro navr�cen� �as� krmen� jako jeden String pro jednodu��� v�pis
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
