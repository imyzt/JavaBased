package top.imyzt.itcase.day10;

/**
 * 局部内部类
 * @author 01
 *
 */
public class LocalInner {
	public static void main(String[] args) {
		//访问局部内部类
		Outer05 o = new Outer05();
		o.say();
		//访问静态方法的局部内部类
		Outer05.hello();
	}
}
class Outer05{
	int c = 12;
	public void say() {
		class Inner05{
			int a = 12;
			public void print() {
				//局部内部类可以访问外部类的属性,jdk1.8以前需要给属性添加final才能访问
				System.out.println("print" + Outer05.this.c + a);
			}
		}
		Inner05 i = new Inner05();
		i.print();
	}
	
	static int d = 12;
	public static void hello() {
		class Inner05{
			int a = 12;
			public void print() {
				//局部内部类可以访问外部类的属性,jdk1.8以前需要给属性添加final才能访问
				System.out.println("print" + d + a);
			}
		}
		Inner05 i = new Inner05();
		i.print();
	}
}