package top.imyzt.itcase.day24;
/**
 * 
 * 守护线程
 * 
 * 线程A为线程B的守护线程.
 * 当线程B停止后,线程A会主动停止.不会继续执行
 * 
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月9日 下午5:13:23 
*/
public class Demo04_Daemon {

	public static void main(String[] args) {
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println("非守护线程在执行..." + i);
				}
			}
		};
		
		Thread t3 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 2; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("非守护线程222222222222222222在执行..." + i);
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("...守护线程在执行" + i);
				}
			}
		};
		
		//将 t2 设置为守护线程
		t2.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
		/*
		 * ...守护线程在执行0
			...守护线程在执行1
			...守护线程在执行2
			...守护线程在执行3
			非守护线程在执行...0
			非守护线程在执行...1
			...守护线程在执行4
			...守护线程在执行5
			...守护线程在执行6
			...守护线程在执行7
			...守护线程在执行8
			...守护线程在执行9
		 */
	}

}
