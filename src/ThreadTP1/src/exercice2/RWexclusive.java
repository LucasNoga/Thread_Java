/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread2;

/**
 *
 * @author pierre-fredericvillard
 */
public class RWexclusive<T> extends RWbasic<T>{

    public RWexclusive(T data)
    {
        super(data);
    }

   synchronized public T read(){
        System.out.println("lecture : "+data);
        return data;
    }

    synchronized public void write(T data){
        System.out.println("---ecriture : "+data);
        this.data=data;
    }

}
