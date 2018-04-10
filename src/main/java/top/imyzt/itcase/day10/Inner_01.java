package top.imyzt.itcase.day10;

/**
 * 面试题
 * @author 01
 *
 */
public class Inner_01 {
	public static void main(String[] args) {
		Outer04.Inner04 oi = new Outer04().new Inner04();
		oi.show();
	}
}
class Outer04{
	public int num = 10;
	class Inner04{
		public int num = 20;
		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			//内部类之所有能获取到外部类的成员,是因为它获取到外部类的引用  外部类名.this
			System.out.println(Outer04.this.num);
		}		
	}
}
