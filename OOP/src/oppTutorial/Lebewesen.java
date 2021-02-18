package oppTutorial;

//Interfaces sind Schnittstellen, sie k�nnen mehrfach vererbt werden 
//Sie k�nnen jedoch nicht daf�r genutzt werden um Objekte zu erzeugen
public interface Lebewesen {
	
	
	public void essen(); // Der Methodenk�rper ist leer, nur der Methoden Kopf ist gegeben 
	public String schlafen();
	public String gerauesch();
	public String lebensdauer();
	public long mengePopulation(float prozentanteil); //Hier geben wir einen R�ckgabewert mit aber auch einen �bergabe Paramter, anhand von einer �bergebenden
													 // Prozentanzahl wollen wir die Menge in einer Long Zahl zur�ck bekommen 
}
