package valute;

public class Valuta {
	private String naziv;
	private String skraceniNaziv;
	private String datum;
	private double kurs;
	
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
		if(naziv == null) 
			throw new RuntimeException("Skraceni naziv ne sme biti null");
		this.skraceniNaziv = skraceniNaziv;
	}
	public String getDatum() {
		return datum;
	}
	public void setDatum(String datum) {
		if(naziv == null) 
			throw new RuntimeException("Datum ne sme biti null");
		this.datum = datum;
	}
	public double getKurs() {
		return kurs;
	}
	public void setKurs(double kurs) {
		if(naziv == null) 
			throw new RuntimeException("kurs ne sme biti null");
		this.kurs = kurs;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Danasnja valuta:"+ skraceniNaziv+": "+kurs;
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
