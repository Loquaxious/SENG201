
public class SpaceThreads implements Runnable {
	
	public void run() {
		System.out.println("Hello from " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		new Thread(new SpaceThreads()).start();
	}

}
