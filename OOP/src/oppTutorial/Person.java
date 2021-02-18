package oppTutorial;

import java.util.LinkedList;

public class Person extends Mensch{

	private String name;
	private String stadt; 

	private int alter; 
	private char geschlecht;
	
	private String geburtstag;
	private Person partner; 
	private LinkedList<Person> kinder;
	
	public Person() {}
	public Person(String name, String stadt, int alter, char geschlecht, String geburtstag, Person partner,
			LinkedList<Person> kinder) {
		super();
		this.name = name;
		this.stadt = stadt;
		this.alter = alter;
		this.geschlecht = geschlecht;
		this.geburtstag = geburtstag;
		this.partner = partner;
		this.kinder = kinder;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public char getGeschlecht() {
		return geschlecht;
	}

	public void setGeschlecht(char geschlecht) {
		this.geschlecht = geschlecht;
	}

	public String getGeburtstag() {
		return geburtstag;
	}

	public void setGeburtstag(String geburtstag) {
		this.geburtstag = geburtstag;
	}

	public Person getPartner() {
		return partner;
	}

	public void setPartner(Person partner) {
		this.partner = partner;
	}

	public LinkedList<Person> getKinder() {
		return kinder;
	}

	public void setKinder(LinkedList<Person> kinder) {
		this.kinder = kinder;
	}
	
	public void addKind(Person kind) {
		if(this.kinder == null) {
			kinder = new LinkedList<Person>();
		}else {
			kinder.add(kind);
		}
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", stadt=" + stadt + ", alter=" + alter + ", geschlecht=" + geschlecht
				+ ", geburtstag=" + geburtstag + ", partner=" + partner + ", kinder=" + kinder.toString() + ", fressart="
				+ fressart + ", population=" + population + ", schlafen()=" + schlafen() + ", gerauesch()="
				+ gerauesch() + ", lebensdauer()=" + lebensdauer() + "]";
	}
	 
	
	
}
