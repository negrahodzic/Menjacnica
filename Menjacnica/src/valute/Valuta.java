package valute;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	private String datum;
	private String kurs;
	
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
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		this.datum = datum;
	}
	public String getKurs() {
		return kurs;
	}
	public void setKurs(String kurs) {
		this.kurs = kurs;
	}
	
	
}
