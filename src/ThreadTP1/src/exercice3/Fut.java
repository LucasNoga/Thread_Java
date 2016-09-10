package exercice3;


public class Fut {

    int quantite;

    Fut(int quantite){
        this.quantite=quantite;
    }

    public synchronized void boire(int v, String classe, String nom){
        try{
        	long pause = 500;
    		
        while(quantite<0)
            {
                System.out.println("Attente...plus assez de boisson");
                wait();
            }
        quantite-=v;
        System.out.println("le "+ classe + " "+ nom +" a bu "+ v + " litre");
        System.out.println("Il reste : "+ quantite);}
        catch (Exception e){}

    }

    public synchronized void remplir(int v, String classe, String nom){
    	try{
    		long pause = 500;
    		quantite+=v;
    		notifyAll();
    		System.out.println("le "+ classe +" " + nom +" a rempli  "+ v + " litre");
    		System.out.println("Il reste : "+ quantite   );
    	}catch (Exception e){}

    }

}
