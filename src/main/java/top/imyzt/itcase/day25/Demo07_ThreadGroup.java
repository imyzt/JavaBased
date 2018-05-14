package top.imyzt.itcase.day25;
/**
 * 
 * 线程组 ThreadGroup
 * 	线程组可以将多个线程同时操作.
 * 
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月14日 上午10:30:06 
 */
public class Demo07_ThreadGroup {

	public static void main(String[] args) {

		getThreadGroupName();
		
		ThreadAddThreadGroup();
	}

	/**
	 * 将线程加入到线程组,通过Thread的构造
	 * new Thread(线程组,Runnable的子类对象,线程名称)
	 * 
	 * @author:imyzt
	 * @date:2018年5月14日上午11:49:06
	 */
	public static void ThreadAddThreadGroup() {
		ThreadGroup tg = new ThreadGroup("线程组一");							//创建线程组
		MyRunnable runnable = new Demo07_ThreadGroup().new MyRunnable();	//创建Runnable的子类对象

		Thread t1 = new Thread(tg, runnable, "线程一");						//将线程一和线程二放入线程组一中
		Thread t2 = new Thread(tg, runnable, "线程二");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t2.getThreadGroup().getName());
		
		tg.setDaemon(true);													//通过线程组统一操作对象
	}

	/**
	 * 默认线程都是属于 main (主线程组)
	 * 可以通过Thread.getThreadGroup()方法获取到当前线程的线程组
	 * 通过 ThreadGroup.getName()方法获取到线程组的名称
	 * 
	 * @author:imyzt
	 * @date:2018年5月14日上午11:29:50
	 */
	public static void getThreadGroupName() {
		MyRunnable runnable = new Demo07_ThreadGroup().new MyRunnable();
		
		Thread t1 = new Thread(runnable, "线程一");
		Thread t2 = new Thread(runnable, "线程二");
		
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		
		System.out.println(tg1.getName());
		System.out.println(tg2.getName());
	}

	class MyRunnable implements Runnable{

		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() + "=" + i);
			}
		}
		
	}
}
