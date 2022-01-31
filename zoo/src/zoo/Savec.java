package zoo;

import java.time.LocalDate;
import java.util.List;

public class Savec extends Zvire {
	/*
	 * Konstruktor
	 */
	public Savec(LocalDate datumNarozeni, List<Integer> hodinyKrmeni, int pocetKrmeniZaDen, String jmeno, boolean zijuVCesku, double telesnaTeplota) {
		super(datumNarozeni, hodinyKrmeni, pocetKrmeniZaDen, jmeno, zijuVCesku);
		this.telesnaTeplota = telesnaTeplota;
	}
	/*
	 * Atributy tøídy
	 */
	public final boolean teplokrevnost = true;
	public double telesnaTeplota;
	public void vydejZvuk(String citoslovce) {
		System.out.println(citoslovce);
	}
}
