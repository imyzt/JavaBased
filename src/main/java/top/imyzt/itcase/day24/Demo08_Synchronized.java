package top.imyzt.itcase.day24;

import javax.swing.plaf.synth.SynthColorChooserUI;

/**
 * 
 * 同步代码块
 * 
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月10日 上午9:42:55 
 */
public class Demo08_Synchronized {

	public static void main(String[] args) {

		Test t = new Test();

		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					t.print05();
				}
			}
		}.start();

		new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 1900; i++) {
					t.print06();
				}
			}
		}.start();

	}

}

class Test extends Thread{
	/**
	 * 锁可以是任意对象!
	 * 锁必须是唯一的
	 */
	Lock lock = new Lock();
	public void print01() {
		synchronized (lock) {
			System.out.print("0");
			System.out.print("1");
			System.out.print("2");
			System.out.println();
		}
	}
	public void print02() {
		synchronized (lock) {
			System.out.print("a");
			System.out.print("b");
			System.out.print("c");
			System.out.println();	
		}
	}

	/**
	 * 方法锁可以是this.
	 */
	public synchronized void print03() {
		System.out.print("0");
		System.out.print("1");
		System.out.print("2");
		System.out.println();
	}
	public void print04() {
		synchronized (this) {
			System.out.print("a");
			System.out.print("b");
			System.out.print("c");
			System.out.println();	
		}
	}

	/**
	 * 静态方法锁可以是当前类的.class文件 
	 */
	public static synchronized void print05() {
		System.out.print("0");
		System.out.print("1");
		System.out.print("2");
		System.out.println();
	}
	public static void print06() {
		synchronized (Test.class) {
			System.out.print("a");
			System.out.print("b");
			System.out.print("c");
			System.out.println();	
		}
	}
}

class Lock {}
