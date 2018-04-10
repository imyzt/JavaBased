package top.imyzt.itcase.day10;

/**
 * 内部类私有后通过本类操作
 * @author 01
 *
 */
public class Outer_2 {
	public static void main(String[] args) {
		Outer2 o2 = new Outer2();
		o2.returnInner2();
	}
}

class Outer2{
	private String hello  = "hello world";
	//将成员内部类私有后,外部无法访问
	private class Inner2{
		public void say() {
			System.out.println(hello);
		}
	}
	//通过本类的共有方法,操作私有的内部类
	public void returnInner2() {
		Inner2 i = new Inner2();
		i.say();
	}
}