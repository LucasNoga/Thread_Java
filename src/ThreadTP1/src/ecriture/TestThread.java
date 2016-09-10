package ecriture;

/**
 *
 * @author pierre-fredericvillard
 */
public class TestThread {

    public static void main(String[] args) {
        Ecrit e1 = new Ecrit ("bonjour", 10, 5);
        Ecrit e2 = new Ecrit ("bonsoir", 12, 10);
        Ecrit e3 = new Ecrit ("\n", 5, 15);
        e1.start();
        e2.start();
        e3.start();
    }

}
