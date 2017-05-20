package personnes;

public class Personne {
	//propriétés
		 private String nom;
		 private int age;
		 private double[] comptes;
		
	//constructeurs vite et initialisé
		public Personne(){
			nom = "";
			age = 0;
			comptes[0.00];
		}
		public Personne(String nom, int age, double[] comptes){
			this.nom = nom;
			this.age = age;
			this.comptes = comptes;
		}
	//accesseurs et mutateurs
		public String getNom(){
			return nom;
		}
		public void setNom(String nom){
			this.nom = nom;
		}
		public int getAge(){
			return age;
		}
		public void setAge(int age){
			this.age = age;
		}
		public double[] getComptes(){
			return comptes;
		}
		
		public void setComptes(){
			this.comptes = comptes;
		}
		
	//méthodes
		public void afficher(String nom, int age){
			nom = "Coupdetrix";
			age = 25;
		}
		public String afficher1(){
			String str = "nom : "+this.getNom()+", age : "+this.getAge()+", comptes : "+this.getComptes();
			return str;
		}

}

