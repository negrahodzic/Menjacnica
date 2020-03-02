package bibliotekaKlasa;

import java.util.Date;

public class Kurs {
	private Date datum;
	private double kurs;
	
	public Kurs(Date datum, double kurs) {
		this.datum = datum;
		this.kurs = kurs;
	}
	
	public Date getDatum() {
		return datum;
	}
	public void setDatum(Date datum) {
		this.datum = datum;
	}
	public double getKurs() {
		return kurs;
	}
	public void setKurs(double kurs) {
		this.kurs = kurs;
	}
	
	
	
}
