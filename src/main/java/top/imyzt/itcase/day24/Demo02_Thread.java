package top.imyzt.itcase.day24;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.security.auth.callback.Callback;

/**
 * 
 * 如何实现多线程:
 * 1.继承 Thread ,重写run()方法, 在主方法中调用对象的 start()方法启动多线程
 * 		为什么会先执行线程下面的方法,在交替执行线程和线程下面的方法?因为启动线程需要时间
 * 
 * 2.实现 Runnable 接口, 重写 run() 方法,在主方法通过 new Thread(new MyRunable()).start()启动线程
 * 
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月9日 下午2:51:36 
 */
public class Demo02_Thread {

	public static void main(String[] args) throws Exception {
		/*MyThread thread = new MyThread();
		thread.start();

		MyRunnable runnable = new MyRunnable();
		new Thread(runnable).start();
		
		for (int i = 0; i < 10000; i++) {
			System.out.println("输出了");
		}*/
		
		
		MyCallable<String> m = new MyCallable();
		ExecutorService pool = Executors.newCachedThreadPool();
		pool.submit(m);
		
		
		System.out.println(m.getName());
		
		System.out.println(m.call());
		
		pool.shutdown();
	}

}

class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("MyThread启动了...");
		}
	}
}

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			System.out.println("MyRunnable启动了...");
		}
	}
}

class MyCallable<T> implements Callable<T>{
	
	private String name = "zy";

	@Override
	public T call() throws Exception {
		
		Thread.sleep(3000);
		name = "sdfaasdfsad";
		
		return (T) name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}