package top.imyzt.itcase.day09;

/**
 * 类与类,类与接口,接口与接口的关系
 * 	a:类与类
 * 		继承关系,只能单继承,可以多层继承
 * 	b:类与接口
 * 		实现关系,可以多实现
 * 		可以继承一个类的同时实现多个接口
 * 	c:接口与接口
 * 		继承关系,可以单继承,可以多继承
 * 		
 * @author 01
 *
 */
public class Case_01 {
	static final String i = "1";
	public static void main(String[] args) {
		String a = "1";
		a = "2";
		System.out.println(i==a);
		System.out.println(i);
		
	}

}
interface InterA{
	abstract void printA();
	
}
interface InterB {
	public abstract void printB();	
}
interface InterC extends InterA, InterB{
	public void printA();
}
