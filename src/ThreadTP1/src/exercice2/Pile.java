/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thread2;

public class Pile {
	private	int[]	stack ;	//	la	pile	en	elle −même
	private int	size ; // taille maximale de la pile
	private int	index; // position courante de la dernière position libre
	public Pile(int size ) {
		stack = new int[size];
		this.size = size;
		index = 0;
	}
	public Pile() { this(5); }
	public boolean isEmpty() { return index == 0; } // test de pile vide
	public boolean isFull() { return index == size; } // test de pile pleine 
	public int	size ()	{ return	index;	}
	public int	capacity() { return size;	}
        synchronized public void push(int a){
            try{
                while(isFull())
                {
                    System.out.println("Trop plein, Attente...("+index+"/"+size);
                    wait();
                }
                index++;
                stack[index-1]=a;
                System.out.println("index : "+ index + " = " + stack[index-1]);
                notifyAll();
                }
            catch(Exception e){}            
        }
        synchronized public int pop(){
              int value=0;
              try{   
                while(isEmpty())
                {
                    System.out.println("Vide, Attente...");
                    wait();
                }
                 value = stack[index-1];
                System.out.println("valeur : "+ value + " index= " + index);
                index--;
                notifyAll();
                
                }
            catch(Exception e){}                         
            return value;
        }
}