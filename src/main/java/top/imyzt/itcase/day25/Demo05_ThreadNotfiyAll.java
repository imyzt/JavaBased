package top.imyzt.itcase.day25;
/**
 * 
 * 多个线程之间的相互唤醒
 * 
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月11日 上午10:07:06 
 */
public class Demo05_ThreadNotfiyAll {

	public static void main(String[] args) {

		Print p = new Print();

		new Thread() {
			public void run() {
				try {
					while (true) {
						p.print01();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
		}.start();

		new Thread() {
			public void run() {
				try {
					while (true) {
						p.print02();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
		}.start();

		new Thread() {
			public void run() {
				try {
					while (true) {
						p.print03();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
		}.start();

	}

}

/**
 * 多个线程之间的相互唤醒
 * 
 * 1. 在同步代码块中,用哪个对象锁,就用哪个对象调用wait方法
 * 2. wait()方法为什么在Object类中: 因为锁对象可以是任意对象,Object是所有类的基类,所以wait()方法和notify()需定义在Object类中
 * 3. sleep()和wait()的区别
 * 		a.sleep()必须传入时间参数,时间到了自动醒来
 * 		b.wait()可以传入参数也可以不传入参数,传入参数就是在参数时间结束后等待,不传入参数就是直接等待
 * 		c.sleep()在同步方法和同步代码块中不释放锁,必须执行完成才会释放锁
 * 		d.wait()在同步方法和同步代码块中释放锁,CPU不会在此等待.
 * 
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月11日 上午10:11:23
 */
class Print{
	private int flag = 1;

	public void print01() throws InterruptedException {
		synchronized (this) {
			//if (flag != 1) {			//if语句是在哪里等待,在哪里唤醒.当下次唤醒时,直接从this.wait()向下执行,不进行判断就会进入错误的唤醒				
			while (flag != 1) {			//while语句在线程等待唤醒后,重新进行判断	
				this.wait();
			}
			System.out.print("a");
			System.out.print("b");
			System.out.println();
			flag = 2;
			this.notifyAll();		//唤醒所有等待的线程
		}
	}

	public void print02() throws InterruptedException {
		synchronized (this) {
			while (flag != 2) {
				this.wait();
			}
			System.out.print("1");
			System.out.print("2");
			System.out.println();
			flag = 3;
			this.notifyAll();
		}
	}

	public void print03() throws InterruptedException {
		synchronized (this) {
			while (flag != 3) {
				this.wait();
			}
			System.out.print("A");
			System.out.print("B");
			System.out.println();
			flag = 1;
			this.notifyAll();
		}
	}
}
