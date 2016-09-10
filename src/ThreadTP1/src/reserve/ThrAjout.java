package reserve;

/**
 *
 * @author pierre-fredericvillard
 */
public class ThrAjout  extends Thread{

    long delai;
    String nom;
    Reserve R;
    int q;

    ThrAjout(String nom, long delai, Reserve R, int q){
       this.nom=nom;
        this.delai=delai;
        this.R = R;
        this.q=q;
    }
    public void run(){
       try
       {
            sleep(delai);
       }
       catch (Exception e) { }
       R.ajoute(q);
    }
 }
