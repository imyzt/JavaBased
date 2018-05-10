package top.imyzt.itcase.day24;
/**
 * 设置线程优先级
 * 
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月10日 上午9:28:33 
*/
public class Demo07_Priority {

	public static void main(String[] args) {
		
		Thread t1 = new Demo06_Yield().new MyThread();
		Thread t2 = new Demo06_Yield().new MyThread();
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
	}

}
class A {
}