package thread;

public class Thread2 implements Runnable{
	
	public Thread2() {
		super();
	}

	/**pour savoir comment creer un thread*/
	public void run() {
		System.out.println("je suis un autre thread "+ Thread.currentThread().getName());
		System.out.println("il y a "+ Thread.activeCount()+ " thread actif");
	}

	public static void main(String[] args) throws InterruptedException{
		/**Cree un objet qui contien le code a parralelliser*/
		Thread2 tache = new Thread2(); 
		Thread2 tache2 = new Thread2();
		Thread2[] tab_thread = new Thread2[10];

		/**cree un controleur (Classe Thread) avec comme parametre l'objet qui contient le code a executer*/
		Thread th = new Thread(tache) ;
		th.start();
		th = new Thread(tache2);
		th.start();
		
		/*boucle de 10 thread*/
		for(int i = 0; i< 10;i++){
			try {
				th = new Thread(tab_thread[i]);
				th.start();
				//th.join();
			} catch (IllegalThreadStateException e) {
				System.out.println("Thread pas fini");
			}
		}
		th.join();
	}	

}
