package testCompteur;

public class Compteur{
	private int n = 0;
	private int nfin;

	public Compteur (int fin){
		nfin = fin;
	}

	public void comptons(){
		
		for (int i = 0; i < nfin; i++){
		incrementons();
			try{
				Thread.sleep (1);
			}catch (Exception e) { }
		}
		System.out.println ("Total : " + Integer.toString (n));
	}
	
	public synchronized void incrementons(){
		this.n++;
	}
	

	public static void main (String[] args){
		Compteur cpt = new Compteur (100);
		LanceCompte lc1 = new LanceCompte (cpt);
		LanceCompte lc2 = new LanceCompte (cpt);
		lc1.start ();
		lc2.start ();
		try
		{
			lc1.join ();
			lc2.join ();
		}
		catch (Exception e) { return; }
	}
}


class LanceCompte extends Thread{
	Compteur cpt;

	LanceCompte (Compteur cp){
		cpt = cp;
	}

	public void run (){
		cpt.comptons ();
	}
}