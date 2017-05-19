package personnes;

public class PersonneMain {

	public static void main(String[] args) {
		//instancier la classe
		Personne P1 = new Personne();
		Personne P2 = new Personne("Coupdetrix",25);
		
		
		
		//System.out.println(afficher(nom, age));
		System.out.println(P2.afficher1());
	
	}

}
