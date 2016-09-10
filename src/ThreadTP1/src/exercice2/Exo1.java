/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread2;

/**
 *
 * @author pierre-fredericvillard
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pile stack= new Pile();
        System.out.println("-------------------");
        System.out.println("Création de la pile");
        System.out.println("-------------------");
        for (int i=0; i<stack.capacity(); i++){
            int a = (int)(Math.random()*ProdConsSharedProperties._MAX);
            stack.push(a);
        }
        System.out.println("-----------------");
        System.out.println("Début des threads");
        System.out.println("-------------------");
        Consommateur conso1 = new Consommateur("conso 1", stack, 10 );
        Producteur prod1 = new Producteur("prod 1", stack, 1 );
        Consommateur conso2 = new Consommateur("conso 2", stack, 14);
        Producteur prod2 = new Producteur("prod 2", stack, 5 );
        Thread t1= new Thread(conso1);
        Thread t2 = new Thread(prod1);
        Thread t3= new Thread(conso2);
        Thread t4 = new Thread(prod2);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}
