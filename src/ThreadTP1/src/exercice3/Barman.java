package exercice3;

public class Barman extends Thread{
	String nom;
	Fut fut;
	int quantite;

	Barman(String nom, Fut fut, int quantite){
		this.nom=nom;
		this.fut = fut;
		this.quantite=quantite;
	}
	public void run(){
		try{
			long pause = 50;
			sleep(pause);
			fut.remplir(quantite, "Barman", this.nom);
			
		}catch(Exception e){}


	}
}
