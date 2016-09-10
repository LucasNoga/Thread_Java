package ecriture;

/**
 *
 * @author pierre-fredericvillard
 */
public class Ecrit extends Thread{
    public Ecrit(String texte,
		 int nb,
		 long attente)
  {
    this.texte = texte ; this.nb = nb ;

    this.attente = attente ;
  }
  public void run ()
  {
    try
    {
      for (int i=0 ; i<nb ; i++)
      {
        System.out.print (texte) ;
        sleep (attente) ;
      }
    }
    catch (InterruptedException e) {} // impose par sleep
  }
  private String texte ;
  private int nb ;
  private long attente ;

 }