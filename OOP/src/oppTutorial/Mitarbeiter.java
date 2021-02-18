package oppTutorial;

import java.util.Date;
import java.util.LinkedList;

public class Mitarbeiter extends Person{

	private int mitarbeiternummer;
	private String abteilung;
	
	public Mitarbeiter() {}
	
	public Mitarbeiter(String name, String stadt, int alter, char geschlecht, String geburtstag, Person partner,
			LinkedList<Person> kinder) {
		super(name, stadt, alter, geschlecht, geburtstag, partner, kinder);
		
	}

	public Mitarbeiter(String name, String stadt, int alter, char geschlecht, String geburtstag, Person partner,
			LinkedList<Person> kinder, int mitarbeiternummer, String abteilung) {
		super(name, stadt, alter, geschlecht, geburtstag, partner, kinder);
		this.mitarbeiternummer = mitarbeiternummer;
		this.abteilung = abteilung;
	}

	public int getMitarbeiternummer() {
		return mitarbeiternummer;
	}

	public void setMitarbeiternummer(int mitarbeiternummer) {
		this.mitarbeiternummer = mitarbeiternummer;
	}

	public String getAbteilung() {
		return abteilung;
	}

	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}

}
