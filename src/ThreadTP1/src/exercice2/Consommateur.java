/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread2;

/**
 *
 * @author pierre-fredericvillard
 */
public class Consommateur extends ProdConsSharedProperties implements Runnable{

    public Consommateur(String name, Pile stack, long time)
    {
        super(name, stack, time);
    }

    public void run()
    {
       try{
            for(int cpt=1; cpt<10 ; cpt++)
            {
                System.out.print(_name+"->");
                _stack.pop();
                Thread.sleep((long)(Math.random()*_delay));
            }
       }
       catch(Exception e){}
    }
}
