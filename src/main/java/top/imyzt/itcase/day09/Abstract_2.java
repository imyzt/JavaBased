package top.imyzt.itcase.day09;

/**
 * 抽象类的成员特点
 * 
 * 	抽象类的成员变量: 既可以是变量,也可以是常量。abstract不能修饰成员变量
 * 	抽象类有构造方法，用于子类访问父类数据的初始化
 * 	抽象类的成员方法：既可以是抽象的，也可以是非抽象的
 * 
 * 抽象方法的成员方法特点：
 * 	抽象方法：强制要求子类做的事
 * 	非抽象方法：子类继承的事情，提高代码复用性
 * 
 * @author 01
 *
 */
public class Abstract_2 {
	public static void main(String[] args) {
		Demo t = new Test();
		t.speak();		//Test speak
		t.look();		//Demo look
	}
}
abstract class Demo{
	abstract void speak();
	protected void look() {
		System.out.println("Demo look");
	}
}
class Test extends Demo{
	@Override
	void speak() {
		System.out.println("Test speak");
	}
}