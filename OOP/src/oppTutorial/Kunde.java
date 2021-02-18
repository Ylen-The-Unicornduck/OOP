package oppTutorial;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Kunde extends Person{

	private int kundenummer; 
	private int mobil; 
	private Mitarbeiter betreuer; 
	private ArrayList<String> anmerkung; 
	private String email; 
	
	public Kunde() {}
	
	public Kunde(String name, String stadt, int alter, char geschlecht, String geburtstag, Person partner,
			LinkedList<Person> kinder) {
		super(name, stadt, alter, geschlecht, geburtstag, partner, kinder);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Kundennummer:" + this.kundenummer + super.toString();
	}

	public int getKundenummer() {
		return kundenummer;
	}

	public void setKundenummer(int kundenummer) {
		this.kundenummer = kundenummer;
	}

	public int getMobil() {
		return mobil;
	}

	public void setMobil(int mobil) {
		this.mobil = mobil;
	}

	public Mitarbeiter getBetreuer() {
		return betreuer;
	}

	public void setBetreuer(Mitarbeiter betreuer) {
		this.betreuer = betreuer;
	}

	public ArrayList<String> getAnmerkung() {
		return anmerkung;
	}

	public void setAnmerkung(ArrayList<String> anmerkung) {
		this.anmerkung = anmerkung;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
