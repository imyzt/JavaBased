package top.imyzt.itcase.day10;
/**
 * 
* @ClassName: AnonymInner 
* @Description: 
* 匿名内部类
* 	匿名内部类就是内部类的简化写法
* 	前提:存在一个接口或类(可以是具体类也可以是抽象类)
* 	格式: new 接口名或类名(){
* 		重写方法;
* 	};
* 	本质:是一个继承了该类或是实现了该类的子类匿名对象
* 
* 	匿名内部类针对只包含一个方法时使用
* 
* @author 杨镇涛
* @date 2018年4月10日 上午11:15:21 
*
 */
public class AnonymInner01 {
	public static void main(String[] args) {
		
		new B() {
			public void say() {
				System.out.println("B say");
			}
		}.say();
		
		/*
		 * new interface,实现接口
		 * new class,重写方法
		 */
		A a = new A() {
			public void print() {
				System.out.println("A print");
			}

			public void say() {
				System.out.println("A say");
			}
		};
		
		a.print();
		a.say();
		
	}
}
interface A{
	void print();
	void say();
}
interface B{
	void say();
}