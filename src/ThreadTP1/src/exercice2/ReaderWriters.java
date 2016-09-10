/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread2;

/**
 *
 * @author pierre-fredericvillard
 */
public class ReaderWriters<T> extends RWbasic<T> {

    static int nbReader=0;

    public ReaderWriters(T data)
    {
        super(data); 
    }

    private synchronized void startRead(){
        nbReader++;
    }

    private synchronized void endRead(){
        nbReader--;
        if (nbReader==0)
            notifyAll();
    }

    public T read(){
        startRead();
        System.out.println("lecture : "+data);
        endRead();
        return data;
    }

    public void write(T data){
        try{
            while (nbReader<0)
                wait();
                this.data=data;
                System.out.println("--- ecriture : "+data);
            }
        catch(Exception e){}
    }


}
