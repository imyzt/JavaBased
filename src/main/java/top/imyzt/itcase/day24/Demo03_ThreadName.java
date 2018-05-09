package top.imyzt.itcase.day24;
/**
 * 
 * 为线程设置名称的三种方法
 * 
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月9日 下午3:30:38 
*/
public class Demo03_ThreadName {

	public static void main(String[] args) {
		
		//每一个线程都有一个默认名字, Thread-编号
		new Thread() {
			@Override
			public void run() {
				System.out.println("线程 " + this.getName() + "启动了");
			}
		}.start();
		
		//可以通过有参构造传入线程的名称
		new Thread("1") {
			@Override
			public void run() {
				System.out.println("线程 " + this.getName() + "启动了");
			}
		}.start();
		
		//也可以通过this.setName()设置线程的名称
		new Thread() {
			@Override
			public void run() {
				this.setName("2");
				System.out.println("线程 " + this.getName() + "启动了");
			}
		}.start();
		
		//可以通过Thread的实例对象的setName()方法设置线程的名称
		Thread t3 = new Thread("1") {
			@Override
			public void run() {
				System.out.println("线程 " + this.getName() + "启动了");
			}
		};
		t3.setName("3");
		t3.start();
	}

}
