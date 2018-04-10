package top.imyzt.itcase.day10;

/**
 * 静态成员内部类调用方法
 * @author 01
 *
 */
public class Outer_3 {
	public static void main(String[] args) {
		//外部类.内部类  对象名 = 外部类.new 内部类(); -> 改写成new 外部类.内部类();
		Outer3.Inner3 oi = new Outer3.Inner3();
		oi.say();
		
		//访问静态内部类的静态方法
		Outer3.Inner31.print();
	}
}

class Outer3{
	private static String hello  = "hello world";
	static class Inner3{
		public void say() {
			System.out.println(hello);
		}
	}
	
	static class Inner31{
		static void print() {
			System.out.println("print");
		}
	}
}