package top.imyzt.itcase.day24;
/**
 * 
 * 
 * 火车站卖票
 * 
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月10日 上午10:26:15 
 */
public class Demo09_Ticket {

	public static void main(String[] args) {
		/**
		 * 继承 Thread 类实现火车站多窗口卖票的并发修改同一资源的情况
		 * 1.资源必须定义成静态的,保证每一次new Ticket()对象使用的同一个资源
		 * 2.run()方法中必须在业务代码上添加同步锁,保证当前线程在执行时不能切换到其它线程操作此资源
		 * 3.锁对象必须是唯一的,不能再Ticket中new对象当做锁对象,因为每一次都new Ticket(),不是同一个对象.可以使用对象的字节码文件
		 */
		new Ticket().start();
		new Ticket().start();
		
		System.out.println("--------------------------------------------------------");
		
		/**
		 * 实现 Runnable 接口实现火车站多窗口卖票的并发修改同一资源的情况
		 * 1.资源无需定义成静态的.因为只创建了一次火车站对象,然后将对象传给多个Thread对象.资源本身就是唯一的.
		 * 2.run()方法中必须加同步锁.保证当前线程进入方法后不会被其它线程抢占CPU资源
		 * 3.锁对象可以是this,原因同1,只创建了一次对象.this是同一个对象.
		 */
		Ticket02 ticket02 = new Ticket02();
		new Thread(ticket02).start();
		new Thread(ticket02).start();
	}

}
class Ticket extends Thread {

	static int ticket = 100;

	@Override
	public void run() {
		while (true) {
			synchronized(Ticket.class) {
				if (ticket <= 0) {
					break;
				}
				try {
					Thread.sleep(10);		//模拟其它耗时操作
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(getName() + "卖出了第" + ticket -- + "票");
			}
		}
	}
}

class Ticket02 implements Runnable {
	
	private int ticket = 100;

	@Override
	public void run() {
		while (true) {
			synchronized(this) {
				if (ticket  <= 0) {
					break;
				}
				try {
					Thread.sleep(10);		//模拟其它耗时操作
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "卖出了第" + ticket -- + "票");
			}
		}
	}
}