package oppTutorial;


public abstract class Mensch implements Lebewesen{

	//Konstante f�r den Mensch
	final String fressart = "Allesfresser"; 
	final long population = 7863797963l;
	
	
	@Override
	public void essen() {
		// TODO Auto-generated method stub
		System.out.println("Menschen sind: " + fressart);
	}
	@Override
	public String schlafen() {
		// TODO Auto-generated method stub
		return "Ein Mensch muss im Durchschnitt 7-8 Stunden schlafen";
	}
	@Override
	public String gerauesch() {
		// TODO Auto-generated method stub
		return "Menschen haben eine intelligente Sprache und ein ausgepr�gtes Stimmbanddesig, daher k�nnen sie jedes Ger�usch nachahmen";
	}
	@Override
	public String lebensdauer() {
		// TODO Auto-generated method stub
		return "Die Lebenserwartung von Menschen betr�gt 79 Jahre";
	}
	@Override
	public long mengePopulation(float prozentanteil) {
		// TODO Auto-generated method stub
		return (long) (population*prozentanteil);
	} 
	
	
	

}
