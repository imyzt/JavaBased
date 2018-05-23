package top.imyzt.itcase.day27.jdk18;
/**
 * JDK1.8的新特性
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月23日 下午2:22:59 
 */
public class JDK18 {

	/**
	 * 1.JDK1.8中，接口中用default修饰的非静态方法可以拥有方法体。静态方法也可以拥有方法体。
	 * 2.JDK1.8中，局部内部类访问局部变量，局部变量不需要显示声明为final，会自动添加
	 */
	
	public static void main(String[] args) {
		Person.sleep("杨镇涛");
		
		Student s = new Student();
		s.study("杨镇涛");
		
		Show show = new Show();
		show.print();
	}
	
}

class Show{
	
	public void print() {
		int age = 10;
		class Inner {
			public void print() {
				//age = 12;				//jdk1.8不需显示声明final，默认添加final，不能修改
				System.out.println(age);
			}
		}
		
		Inner inner = new Inner();
		inner.print();
	}
}

interface Person{
	public default void study(String name) {
		System.out.println(name + "在学习");
	}
	
	public static void sleep(String name) {
		System.out.println(name + "在休息");
	}
}
class Student implements Person {
	
}
