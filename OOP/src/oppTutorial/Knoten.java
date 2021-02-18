package oppTutorial;

public class Knoten {
	//Verkettung
	private Knoten next; 
	private Knoten prev; 
	
	//Inhalt - Kann auch mit <T> Typen gemacht werden 
	private Person person; 
	
	public Knoten(Person person) {
		this.person = person; 
		this.next = null; 
		this.prev = null; 
	}

	public Knoten getNext() {
		return next;
	}

	//Oder addNextKnoten ; Add oder wie auch immer 
	//Am besten nochne prüfung ob prev oder next schon existieren 
	public void setNext(Knoten next) {
		if(this.next == null) {
			this.next = next;
			next.setPrev(this);
		}else {
			//da wir einen Knoten dazwischen Schieben, müssen wir 
			this.next.setPrev(next);
		}
		
	}

	public Knoten getPrev() {
		return prev;
	}

	public void setPrev(Knoten prev) {
		this.prev = prev;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
