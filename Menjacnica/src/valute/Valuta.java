package valute;

import java.util.LinkedList;

import bibliotekaKlasa.Kurs;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	private LinkedList<Kurs> kurs;
	
    public Valuta() {
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null) 
			throw new RuntimeException("Naziv ne sme biti null");
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv == null) 
			throw new RuntimeException("Skraceni naziv ne sme biti null");
		this.skraceniNaziv = skraceniNaziv;
	}

	public LinkedList<Kurs> getKurs() {
		return kurs;
	}
	public void setKurs(LinkedList<Kurs> kurs) {
		if(kurs == null) 
			throw new RuntimeException("kurs ne sme biti null");
		this.kurs = kurs;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Danasnja valuta:"+ skraceniNaziv+": "+kurs.getFirst(); // treba neki indeks ili datum
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
