/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread2;

/**
 *
 * @author pierre-fredericvillard
 */
public class Writer extends Thread{

    private int nr;
    private RWbasic<Integer> basic;
    private RWexclusive<Integer> basic2;
    private ReaderWriters<Integer> basic3;

    public Writer(int nr, RWbasic basic)
    {
        this.nr=nr;
        this.basic=basic;
    }

    public Writer(int nr, RWexclusive basic2)
    {
        this.nr=nr;
        this.basic2=basic2;
    }


    public Writer(int nr, ReaderWriters basic3)
    {
        this.nr=nr;
        this.basic3=basic3;
    }



    public void run()
    {
      try {
        for(int i=0;i<nr;i++)
        {
            basic2.write(basic2.data+1);
            sleep(10000);
        }
      }
      catch(Exception e){}
    }

}
