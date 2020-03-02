package bibliotekaKlasa;

import java.util.Date;
import java.util.LinkedList;

import operacije.IOperacijeZaKurs;

public class ServisMenjacnice implements IOperacijeZaKurs{

	LinkedList<Kurs> kList = new LinkedList<Kurs>();

	@Override
	public void dodajKurs(Date datum, double kurs) {
		Kurs k = new Kurs(datum, kurs); 
		kList.add(k);
	}

	@Override
	public void izbrisiKurs(Date datum) {
		for(Kurs k : kList)
			if(k.getDatum().equals(datum)) 
				kList.remove(k);
	}

	@Override
	public Kurs vratiKurs(Date datum) {
		for(Kurs k : kList)
			if(k.getDatum().equals(datum)) 
				return k;
		throw new RuntimeException("Nije pronadjen taj kurs.");
	}

}
