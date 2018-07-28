
public class RunnableLambda {
	
	public static void main(String[] args) throws InterruptedException {
		Runnable runnable = () -> {
			for(int i=0; i<10; i++){
				System.out.println("Hello from Thread " + Thread.currentThread().getName() + " " + i);
			}
		};
		
		Thread t = new Thread(runnable);
		t.start();
		t.join();
	}

}
