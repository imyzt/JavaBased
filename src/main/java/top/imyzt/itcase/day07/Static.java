package top.imyzt.itcase.day07;
/**
 * static关键字特点
 * 		a:随着类的加载而加载
 * 		b:优先于对象存在
 * 		c:被类的所有对象共享
 * 			如果类的某个成员变量是被所有对象共享的,那么它就应该被定义为静态的.
 * 		d:可以通过类名调用
 * 			其实它本身也可以使用对象名调用
 * 			推荐使用类名调用
 * 			静态修饰的内容一般我们称其为:与类相关的,类成员
 * 
 * static关键字注意事项
 * 		a:在静态方法中没有this关键字
 * 			静态是随着类的加载而加载,this是随着对象的创建而存在
 * 			静态比对象先存在
 * 		b:静态方法只能访问静态的成员变量和静态的成员方法
 * 			静态方法:
 * 				成员变量:只能访问静态变量
 * 				成员方法:只能访问静态的成员方法
 * 			非静态方法:
 * 				成员变量:可以是静态和非静态的
 * 				成员方法:可以是静态和非静态的
 * 静态变量也叫类变量,成员变量也叫对象变量
 * 		a:所属不同
 * 			静态变量属于类,所以也称为类变量
 * 			成员变量属于对象,所以也称为实例变量(对象变量)
 * 		b:内存中位置不同
 * 			静态变量存储于方法区的静态区
 * 			成员变量存储于堆内存
 * 		c:内存出现时间不同
 * 			静态变量随着类的加载而加载,随着类消失
 * 			成员变量随着对象的加载而加载,随着对象消失
 * 		d:调用不同
 * 			静态变量可以通过类名调用,也可以通过对象调用(推荐使用类名调用)
 * 			成员变量只能通过对象名调用
 * @author imyzt
 *
 */
public class Static {

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "zs";
		s.age = 12;
//		s.address = "xxx";
		Student.address = "长沙";		//address为static类型变量.只需一次赋值.
		System.out.println(s.toString());
		
		Student s2 = new Student();
		s2.name = "ls";
		s2.age = 18;
		System.out.println(s2.toString());
	}
}

class Student{
	
	String name;
	Integer age;
	static String address;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
