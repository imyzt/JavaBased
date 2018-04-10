package top.imyzt.itcase.day10;
/**
 * 
* @ClassName: AnonymInner 
* @Description: 
* 
* 	匿名内部类当参数传递时
* 
* @author 杨镇涛
* @date 2018年4月10日 上午11:15:21 
*
 */
public class AnonymInner2 {
	public static void main(String[] args) {
		method(new Person() {			//父类引用指向子类对象
			@Override
			public void say() {
				System.out.println("show");
			}
		});
	}
	
	public static void method(Person p) {
		p.say();
	}
}
abstract class Person{
	public abstract void say();
}