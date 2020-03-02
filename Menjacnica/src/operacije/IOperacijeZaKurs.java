package operacije;

import java.util.Date;

import bibliotekaKlasa.Kurs;

public interface IOperacijeZaKurs {
	void dodajKurs(Date datum, double kurs);
	void izbrisiKurs(Date datum);
	Kurs vratiKurs(Date datum);
}
