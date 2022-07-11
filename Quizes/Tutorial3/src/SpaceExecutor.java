import java.util.concurrent.*;

public class SpaceExecutor implements Runnable{
	
	private ExecutorService exe;
	
	SpaceExecutor(int numThreads) {
		this.exe = Executors.newFixedThreadPool(numThreads);
	}
	
	public void addTask(Callable<?> task) {
		exe.submit(task);
	}
	
	public ExecutorService getExecutor() {
		return exe;
	}
	
	public void killExecutor() {
		exe.shutdownNow();
	}
	
	public void run() {
		exe.execute(null);
	}
	
	public static void main(String[] args) {
		SpaceExecutor taskMgr = new SpaceExecutor(1);

		Callable<?> longTask = () -> {
		    Thread.sleep(500);
		    return null;
		};

		taskMgr.addTask(longTask);
		taskMgr.addTask(longTask);

		ThreadPoolExecutor exec = (ThreadPoolExecutor) taskMgr.getExecutor();
		System.out.printf("Number of threads: %s%n", exec.getPoolSize());
		System.out.printf("Number of tasks in queue: %s%n", exec.getQueue().size());

		System.out.printf("Executor is running: %s%n", !exec.isShutdown());
		taskMgr.killExecutor();
		System.out.printf("Executor is running: %s%n", !exec.isShutdown());
	}
}
