/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread2;

/**
 *
 * @author pierre-fredericvillard
 */
public class RWbasic <T>{

    public T data;

    public RWbasic(T data)
    {
        this.data= data;
    }

    public T read(){
        System.out.println("lecture : "+data);
        return data;
    }

    public void write(T data){
        System.out.println("--- ecriture : "+data);
        this.data=data;
    }



}
