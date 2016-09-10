package exercice4;

public class CalculIntegrale extends Thread{
	private double resultat;
	private final static int nbPoints=1000000;
	
	public CalculIntegrale(){}
	
	public void setResultat(){
		double x,y;
		int nbDansAire=0;
		for(int i=0;i<nbPoints/4;i++){
			x=Math.random();
			y=Math.random();
			if(((Math.sqrt(x)+3.*Math.pow(x,2))/4.)>y) 
				nbDansAire++;
		}
		System.out.println("nbDansAire : "+nbDansAire);
		this.resultat=((double)nbDansAire/nbPoints);
	}
	public double getResultat(){
		return this.resultat;
	}
	public static void main(String[] args) {
		CalculIntegrale calc=new CalculIntegrale();
		calc.setResultat();
		System.out.println("Résultat : "+calc.getResultat());
	}
	
}
