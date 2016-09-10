package exercice4;

public class Pi{
	private double pi;
	private final static long nbPoints=100000000;
	public Pi(){}
	
	public void getPi(){
		double x,y;
		long nombreCercle=0;
		for(int i=0;i<nbPoints;i++){
			x=Math.random();
			y=Math.random();
			if(Math.pow(x,2)+Math.pow(y,2) <= 1) 
				nombreCercle++;
		}
		this.pi=((double)nombreCercle/nbPoints)*4;
	}
	
	/**public static void main(String[] args) {
		Pi pi=new Pi();
		pi.getPi();
		System.out.println(pi.pi);
	}*/
}
