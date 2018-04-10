package top.imyzt.itcase.day10;

/**
 * 内部类访问特点
 * 	a:内部类可直接访问外部类的成员,包括私有的(内部类可看成外部类的成员)
 * 	b:外部类要访问内部类的成员,必须创建对象
 * 		外部类名.内部类名 对象名  = new 外部类.new 内部类();
 * @author 01
 *
 */
public class Outer_01 {
	public static void main(String[] args) {
		//外部类名.内部类名 对象名  = new 外部类.new 内部类();
		Outer1.Inner1 oi = new Outer1().new Inner1();
		oi.say();
	}
}

class Outer1{
	private String hello  = "hello world";
	class Inner1{
		public void say() {
			System.out.println(hello);
		}
	}
}