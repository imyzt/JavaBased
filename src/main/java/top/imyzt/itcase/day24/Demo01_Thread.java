package top.imyzt.itcase.day24;
/**
 * 
 * 证明JVM启动时是多线程的.
 * 下面的方法有main方法主线程和垃圾回收器线程
 * 创建完100000个Person()对象后, 执行输出100000行输出语句时,之前的100000个Person()对象同时正在被垃圾回收器线程回收.
 * 
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月9日 下午2:40:12 
*/
public class Demo01_Thread {

	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {
			new Person();
		}
		
		for (int i = 0; i < 1000000; i++) {
			System.out.println("------------------主线程执行了------------------");
		}
	}

}
class Person{

	@Override
	protected void finalize() {
		System.out.println("垃圾回收器执行了");
	}
	
}
