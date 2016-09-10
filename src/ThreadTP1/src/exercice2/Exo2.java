/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread2;

/**
 *
 * @author pierre-fredericvillard
 */
public class Exo2 {

    public static void main(String[] args) {


        /*---Partie 1---
        RWbasic<Integer> basic = new RWbasic<Integer>(5);        
        Reader lecture = new Reader(5, basic);
        Reader lecture2 = new Reader(5, basic);
        Reader lecture3 = new Reader(5, basic);
        Reader lecture4 = new Reader(5, basic);
        Reader lecture5 = new Reader(5, basic);
        Writer ecrivain = new Writer(10, basic);
        lecture.start();
        lecture2.start();
        lecture3.start();
        ecrivain.start();
        lecture4.start();
        lecture5.start();*/
        
        /*---Partie 2---*/
        RWexclusive<Integer> basic2 = new RWexclusive<Integer>(5);
        Reader lecture = new Reader(5, basic2);
        Reader lecture2 = new Reader(5, basic2);
        Reader lecture3 = new Reader(5, basic2);
        Reader lecture4 = new Reader(5, basic2);
        Reader lecture5 = new Reader(5, basic2);
        Writer ecrivain = new Writer(10, basic2);
        lecture.start();
        lecture2.start();
        lecture3.start();
        ecrivain.start();
        lecture4.start();
        lecture5.start();
        
        /*---Partie 3---*/
        /*ReaderWriters<Integer> basic3 = new ReaderWriters<Integer>(5);
        Reader lecture = new Reader(5, basic3);
        Reader lecture2 = new Reader(5, basic3);
        Reader lecture3 = new Reader(5, basic3);
        Reader lecture4 = new Reader(5, basic3);
        Reader lecture5 = new Reader(5, basic3);
        Writer ecrivain = new Writer(10, basic3);
        lecture.start();
        lecture2.start();
        lecture3.start();
        ecrivain.start();
        lecture4.start();
        lecture5.start();*/


    }

}
