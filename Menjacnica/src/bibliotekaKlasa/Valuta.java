package bibliotekaKlasa;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	private Kurs kurs;
	
    public Valuta() {
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		this.skraceniNaziv = skraceniNaziv;
	}
	
	public Kurs getKurs() {
		return kurs;
	}

	public void setKurs(Kurs kurs) {
		this.kurs = kurs;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Danasnja valuta:"+ skraceniNaziv+": "+kurs.getKurs();
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
