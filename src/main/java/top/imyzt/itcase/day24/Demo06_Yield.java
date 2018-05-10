package top.imyzt.itcase.day24;
/**
 * 
 * 礼让线程
 * 
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月10日 上午9:19:15 
*/
public class Demo06_Yield {

	public static void main(String[] args) {
		
		new Demo06_Yield().new MyThread().start();
		new Demo06_Yield().new MyThread().start();
		
		
	}

	class MyThread extends Thread{
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				if (i % 4 == 0) {
					Thread.yield();		//会将资源礼让给其它线程
				}
				System.out.println(getName() + "执行中...." + i);
			}
		}
	}
}
