package compteur;

/**
 *
 * @author pierre-fredericvillard
 */
public class Compteur1 extends Thread {
	
    int n;
    String nom;

    Compteur1(String nom, int n){
        this.nom=nom;
        this.n=n;
    }

    public void run(){
        for (int i= 0; i<n;i++)
        {
           long pause=(long)(Math.random()*5000);
           System.out.println(pause);
           try
           {
               System.out.println(nom+" -> "+i);
               sleep(pause);
           }
           catch (Exception e) { }
        }
        System.out.println(nom+" a compté jusqu'à "+n);
    }

}
