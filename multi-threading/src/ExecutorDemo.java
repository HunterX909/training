import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class GoRunnable implements Runnable{
	private final long countUntil;
	
	public GoRunnable(long countUntil) {
		this.countUntil=countUntil;
	}
	
	@Override
	public void run() {
		long sum =0;
		for (int i = 0; i < countUntil; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
}
public class ExecutorDemo {
	private static final int NTHREDS = 10;
	
	public static void main(String[] args) {
		ExecutorService executor  = Executors.newFixedThreadPool(NTHREDS);
		//ExecutorService executor  = Executors.newSingleThreadExecutor();
		//ExecutorService executor  = Executors.newCachedThreadPool();
		
		int start = (int) System.currentTimeMillis();
		for (int i = 0; i < 500; i++) {
			Runnable worker = new GoRunnable(10000000L +i);
			executor.execute(worker); 
		}
//		This will make the executor accept no new threads
//		and finish all existing threads in the queue
//		executor.shutdown();
//		wait until all threads are finish
		try {
			executor.awaitTermination(100, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while(!executor.isTerminated()) {
			
		}
		System.out.println("Finnshed all threads");
		
		int end = (int) System.currentTimeMillis();
		System.out.println(end-start);
	}
}
