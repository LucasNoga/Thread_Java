package exercice2;

public class Coureur{
	private String nom;
	private int[] stat=new int[4];
	public long temps;
	
	public Coureur(String nom){
		this.nom=nom;
		for(int i=0;i<4;i++) stat[i]=0;
	}
	
	public void courir(){
		int place;
		for(int i=0;i<100;i++)
			if(i%10 == 0){
				
				System.out.println("Le coureur "+this.nom+" a parcouru "+i+" mètres");
				try{
					long pause = (long) Math.random()*1000;
					temps += pause;
					Thread.sleep(pause);
					}catch(Exception e){}
			}
		
		//recupere la position du coureur
		place = Classement.getPosition();
		System.out.println("le coureur: "+this.nom+ " a fini " + place + " avec un temps " + this.temps + " ms");
		this.stat[place-1]+=1;
	}
	
	//methode qui retourne la statistique du coureur pour chaque position
	public int getStat(int position){
		return stat[position];
	}
	
	public static void main(String[] args){
		Coureur c1=new Coureur("Jean");
		Coureur c2=new Coureur("Paul");
		Coureur c3=new Coureur("Pierre");
		Coureur c4=new Coureur("Jacques");
		
		//on lance 10 course
		for(int i=0;i<10;i++){
			Classement.reset();
			
			System.out.println("\nCourse "+(i+1)+"\n");
			LanceCourse lc1=new LanceCourse(c1);
			LanceCourse lc2=new LanceCourse(c2);
			LanceCourse lc3=new LanceCourse(c3);
			LanceCourse lc4=new LanceCourse(c4);
			lc1.start();
			lc2.start();
			lc3.start();
			lc4.start();
			try{
				lc1.join();
				lc2.join();
				lc3.join();
				lc4.join();
			}
			catch(Exception e){}
		}
		
		System.out.println("\nStatistiques Jean :\n");
		for(int i=0;i<4;i++)
			System.out.println("Place "+(i+1)+" : "+c1.getStat(i));
		System.out.println("\nStatistiques Paul :\n");
                for(int i=0;i<4;i++)
                        System.out.println("Place "+(i+1)+" : "+c2.getStat(i));
		System.out.println("\nStatistiques Pierre :\n");
                for(int i=0;i<4;i++)
                        System.out.println("Place "+(i+1)+" : "+c3.getStat(i));
		System.out.println("\nStatistiques Jacques :\n");
                for(int i=0;i<4;i++)
                        System.out.println("Place "+(i+1)+" : "+c4.getStat(i));
	}
}

class LanceCourse extends Thread{
	Coureur coureur;
	LanceCourse(Coureur coureur){
		this.coureur=coureur;
	}
	public void run(){
		coureur.courir();
	}
}

class Classement{
	private static int position=0;
	public static synchronized int getPosition(){
		position++;
		return position;
	}
	public static void reset(){
		position=0;
	}
}
