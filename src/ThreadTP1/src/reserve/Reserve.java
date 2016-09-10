package reserve;

/**
 *
 * @author pierre-fredericvillard
 */
public class Reserve {

    int quantite;

    Reserve(int res)
            {
        quantite=res;
    }

    synchronized void puise(int v){
        try{
        while(quantite<0)
            {
                System.out.println("Attente...");
                wait();
            }
        quantite-=v;
        System.out.println("Il reste : "+ quantite);}
        catch (Exception e){}

    }

    synchronized void ajoute(int v){
        quantite+=v;
        notify();
        System.out.println("Il reste : "+ quantite   );
    }

}
