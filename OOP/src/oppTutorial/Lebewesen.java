package oppTutorial;

//Interfaces sind Schnittstellen, sie können mehrfach vererbt werden 
//Sie können jedoch nicht dafür genutzt werden um Objekte zu erzeugen
public interface Lebewesen {
	
	
	public void essen(); // Der Methodenkörper ist leer, nur der Methoden Kopf ist gegeben 
	public String schlafen();
	public String gerauesch();
	public String lebensdauer();
	public long mengePopulation(float prozentanteil); //Hier geben wir einen Rückgabewert mit aber auch einen Übergabe Paramter, anhand von einer übergebenden
													 // Prozentanzahl wollen wir die Menge in einer Long Zahl zurück bekommen 
}
