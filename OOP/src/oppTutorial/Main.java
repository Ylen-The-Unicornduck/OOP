package oppTutorial;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//Möglichkeit 1 einer Implementation von der Person Maria
		Lebewesen maria1 = new Person("Maria", null, 20, 'w', null, null, null);

		//Möglichkeit 2:
		Mensch maria2 = new Person("Maria", null, 20,'w', null, null, null);
		
		Date date = new Date();
		//Möglichkeit 3:
		Person maria3 = new Person();
		maria3.setName("Maria");
		maria3.setAlter(20);
		maria3.setPartner(null);
		maria3.setKinder(null);
		maria3.setGeburtstag("12.03.1995");
		
		Person hanz = new Person("Hanz Walter", null, 20,'m',null, null, null);
		
		Knoten k = new Knoten(maria3);
		k.setNext(new Knoten(hanz));
		
		// Oder: 
		// Knoten k1 = new Knoten(maria3);
		// Knoten k2 = new Knoten (hanz);
		// k1.setNext(hanz);
		
		System.out.println(k.getNext().getPerson().getName());   //Ausgabe : Hanz Walter
		System.out.println(k.getNext().getPrev().getPerson().getName()); //Ausgabe : Maria, denn ich verweise erst auf den nächsten knoten und dann zurück auf den davor 
		
		
	}

}
