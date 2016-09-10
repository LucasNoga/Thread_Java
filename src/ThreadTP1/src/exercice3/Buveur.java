package exercice3;

public class Buveur extends Thread{

	String nom;
	int quantite;
	int gorgee;
	Fut fut;

	Buveur(String nom, Fut fut, int quantite, int gorgee){
		this.nom=nom;
		this.fut = fut;
		this.quantite=quantite;
		this.gorgee = gorgee;
	}
	public void run(){
		
			for(int i = 0; i < gorgee; i++){
				fut.boire(quantite/gorgee, "Buveur", this.nom);
				try{
					long pause = 500;
					sleep(pause);

				}catch(Exception e){}
			}
	}
}

