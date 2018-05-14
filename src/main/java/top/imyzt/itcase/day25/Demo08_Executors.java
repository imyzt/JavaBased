package top.imyzt.itcase.day25;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * JDK1.5 之后使用 Executors 原生支持线程池
 * 
 * 
 * Executors 通过工厂模式创建 ExecutorService 线程池对象
 * 
 * 线程池执行完成后是不会关闭的,需要手动调用 ExecutorService.shutdown()进行关闭
 * 
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月14日 下午2:21:07 
 */
public class Demo08_Executors {

	public static void main(String[] args) {

		newFixedThreadPool(3);

		newSingleThreadExecutor();
	}

	/**
	 * 通过newSingleThreadExecutor()方法可以创建一个单一的线程池对象
	 * public static ExecutorService newSingleThreadExecutor()
	 * 
	 * @author:imyzt
	 * @date:2018年5月14日下午2:39:15
	 */
	private static void newSingleThreadExecutor() {
		ExecutorService pool = Executors.newSingleThreadExecutor();
		pool.submit(new Demo07_ThreadGroup().new MyRunnable());
		
		//关闭线程池
		pool.shutdown();
	}

	/**
	 * nThreads(int) 通过传入数量决定创建多少个线程对象
	 * public static ExecutorService newFixedThreadPool(int nThreads)
	 * 
	 * @author:imyzt
	 * @date:2018年5月14日下午2:38:34
	 * @param nThreads
	 */
	private static void newFixedThreadPool(int nThreads) {
		ExecutorService pool = Executors.newFixedThreadPool(nThreads);
		pool.submit(new Demo07_ThreadGroup().new MyRunnable());
		pool.submit(new Demo07_ThreadGroup().new MyRunnable());
		pool.submit(new Demo07_ThreadGroup().new MyRunnable());
		pool.submit(new Demo07_ThreadGroup().new MyRunnable());
		pool.submit(new Demo07_ThreadGroup().new MyRunnable());
		pool.submit(new Demo07_ThreadGroup().new MyRunnable());

	}
}
