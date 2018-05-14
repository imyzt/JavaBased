package top.imyzt.itcase.day25;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * JDK1.5以后使用 ReentrantLock 替代synchronize
 * 可以使用 ReentrantLock.lock()对代码块加锁,ReentrantLock.unlock()释放锁
 * 可以使用ReentrantLock.newCondition()创建一个 Condition ,用于线程等待和线程唤醒
 * 
 * Condition对象的await()和signal()可以等待和唤醒指定线程
 * 
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月11日 上午11:04:12 
 */
public class Demo06_ReentrantLock {

	public static void main(String[] args) {

		Print01 p = new Print01();

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

		new Thread() {
			@Override
			public void run() {
				while (true) {
					try {
						p.print03();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();

	}

}
class Print01{
	private int flag = 1;

	private ReentrantLock lock = new ReentrantLock();

	private Condition c1 = lock.newCondition();
	private Condition c2 = lock.newCondition();
	private Condition c3 = lock.newCondition();

	public void print01() throws InterruptedException {
		lock.lock();

		try {
			if (flag != 1) {
				c1.await();
			}

			System.out.print("a");
			System.out.print("b");
			System.out.println();

			flag = 2;
			c2.signal();
		} finally {
			lock.unlock();
		}
	}

	public void print02() throws InterruptedException {
		lock.lock();

		try {
			if (flag != 2) {
				c2.await();
			}

			System.out.print("1");
			System.out.print("2");
			System.out.println();

			flag = 3;
			c3.signal();
		} finally {
			lock.unlock();
		}

	}

	public void print03() throws InterruptedException {
		lock.lock();

		try {
			if (flag != 3) {
				c3.await();
			}

			System.out.print("A");
			System.out.print("B");
			System.out.println();

			flag = 1;
			c1.signal();
		} finally {
			lock.unlock();
		}
	}
}