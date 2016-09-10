package compteur;

public class Main {

	public static void main(String[] args) {
		
		Compteur1 c1 = new Compteur1 ("c1", 10);
		Compteur1 c2 = new Compteur1  ("c2", 12);
		Compteur1 c3 = new Compteur1  ("c3", 5);
		c1.start();
		c2.start();
		c3.start();

		Compteur2 c4 = new Compteur2("c4", 10);
		Compteur2 c5 = new Compteur2("c5", 12);
		Compteur2 c6 = new Compteur2("c6", 5);
		Thread t1 = new Thread(c4);
		Thread t2 = new Thread(c5);
		Thread t3 = new Thread(c6);
		t1.start();
		t2.start();
		t3.start();
		
	}
}
