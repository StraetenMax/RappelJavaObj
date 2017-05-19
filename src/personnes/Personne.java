package personnes;

public class Personne {
	//propriétés
		private String nom;
		private int age;
		
	//constructeurs vite et initialisé
		public Personne(){
			nom = "";
			age = 0;
		}
		public Personne(String nom, int age){
			this.nom = nom;
			this.age = age;
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
	//méthodes
		public void afficher(String nom, int age){
			nom = "Coupdetrix";
			age = 25;
		}
		public String afficher1(){
			String str = "nom : "+this.getNom()+", age : "+this.getAge();
			return str;
		}

}

