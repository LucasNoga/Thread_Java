package reserve;

/**
 *
 * @author pierre-fredericvillard
 */
public class Exo4 {
    public static void main(String[] args) {
        Reserve res=new Reserve (100);
        ThrPuise c1 = new ThrPuise ("A", 5000, res, 50);
        ThrPuise  c2 = new ThrPuise   ("B", 2000, res, 150);
        ThrAjout  c3 = new ThrAjout   ("C", 5000, res, 100);
        c1.start();
        c2.start();
        c3.start();


    }
}
