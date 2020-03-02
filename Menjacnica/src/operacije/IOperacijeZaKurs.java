package operacije;

import java.util.Date;

public interface IOperacijeZaKurs {
	void dodajKurs(Date datum);
	void izbrisiKurs(Date datum);
	double vratiKurs(Date datum);
}
