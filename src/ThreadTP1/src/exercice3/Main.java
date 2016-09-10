package exercice3;

public class Main {

	public static void main(String[] args) {
		Fut futExplosive = new Fut(50);
		Barman barman1 = new Barman("barman1", futExplosive, 10); 
		Barman barman2 = new Barman("barman2", futExplosive, 20);
		Barman barman3 = new Barman("barman3", futExplosive, 30);
		Buveur buveur1 = new Buveur("buveur1", futExplosive, 15, 3);
		Buveur buveur2 = new Buveur("buveur2", futExplosive, 15, 5);
		Buveur buveur3 = new Buveur("buveur3", futExplosive, 35, 10);
		
		barman1.start();
		barman2.start();
		barman3.start();
		buveur1.start();
		buveur2.start();
		buveur3.start();
		

	}

}
