package exercice4;

public class Pithread extends Thread{
		private final static long nbPoints=1000000;
		private int nbDansAire = 0;
		public Pithread(){}
		
		
		public void run(){
			double x,y;
			for(int i=0;i<nbPoints/4;i++){
				x=Math.random();
				y=Math.random();
				if(Math.pow(x,2)+Math.pow(y,2)<1) 
					nbDansAire++;
			}
			incrementer();
		}
		
		public synchronized void incrementer(){
			Resultat.res+=((double)nbDansAire/nbPoints)*4;
		}
		
		public static void main(String[] args) {
			Pithread pi1=new Pithread();
			Pithread pi2=new Pithread();
			Pithread pi3=new Pithread();
			Pithread pi4=new Pithread();
			pi1.start();
			pi2.start();
			pi3.start();
			pi4.start();
			
			
			try {
				pi1.join();
				pi2.join();
				pi3.join();
				pi4.join();
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			
			System.out.println("Resultat = "+ Resultat.res);
		}
}

class Resultat{
	public static double res=0;
}
