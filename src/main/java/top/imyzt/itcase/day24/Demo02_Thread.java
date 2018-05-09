package top.imyzt.itcase.day24;
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

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();

		MyRunnable runnable = new MyRunnable();
		new Thread(runnable).start();
		
		for (int i = 0; i < 10000; i++) {
			System.out.println("输出了");
		}
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