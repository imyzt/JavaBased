package top.imyzt.itcase.day25;
/**
 * 
 * 线程等待和线程唤醒保证线程之间交替执行 
 * 
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月10日 下午5:31:23 
 */
public class Demo04_ThreadWait {

	public static void main(String[] args) {
		
		Printer p = new Printer();

		new Thread() {
			@Override
			public void run() {
				while (true) {
					try {
						p.print01();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				while (true) {
					try {
						p.print02();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
		
	}
	
}

class Printer {
	private int flag = 1;
	
	public void print01() throws InterruptedException {
		synchronized (this) {
			if (flag != 1) {
				this.wait();
			}
			System.out.print("1");
			System.out.print("2");
			System.out.print("3");
			System.out.println();
			flag = 2;
			this.notify();
		}
	}
	
	public void print02() throws InterruptedException {
		synchronized (this) {
			if (flag != 2) {
				this.wait();
			}
			System.out.print("a");
			System.out.print("b");
			System.out.print("c");
			System.out.println();
			flag = 1;
			this.notify();
		}
	}
}