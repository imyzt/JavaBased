package top.imyzt.itcase.day24;
/**
 * 
 * 加入线程
 * 
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月10日 上午9:03:30 
*/
public class Demo05_Join {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread("第一号线程") {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName() + "在执行-------------");
				}
			}
		};
		
		Thread t2 = new Thread("第二号线程") {
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					if (i == 2) {
						try {
							//t1.join(); join()方法将进行插队执行,当t1执行完成之后,继续执行t2
							t1.join(1);	//join(time) 方法将给t1指定插队时间,时间到后,继续t1和t2交替执行
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(Thread.currentThread().getName() + "在执行");
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
