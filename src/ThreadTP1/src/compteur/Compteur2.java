package compteur;

/**
 *
 * @author pierre-fredericvillard
 */
public class Compteur2 implements Runnable {
	
    int n;
    String nom;

    Compteur2(String nom, int n){
        this.nom=nom;
        this.n=n;
    }

    public void run(){
        for (int i= 0; i<n;i++)
        {
           long pause=(long)(Math.random()*5);
           try
           {
               System.out.println(nom+" -> "+i);
               Thread.sleep(pause);
           }
           catch (Exception e) { }
        }
        System.out.println(nom+" a compté jusqu'à "+n);
    }

}
