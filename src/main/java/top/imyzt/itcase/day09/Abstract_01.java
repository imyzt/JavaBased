package top.imyzt.itcase.day09;

/**
 * 抽象类的特点
 * 
 * 	抽象类和抽象方法必须用abstract关键字修饰
 * 		abstract class Test{}
 * 		public abstract void test();
 * 	抽象类不一定有抽象方法,有抽象方法的类一定是抽象类或接口
 * 	抽象类不能直接实例化,由其子类实例化(抽象类多态)
 * 	抽象类的子类要么是抽象类,要么重写抽象类的全部抽象方法
 * 
 * @author 01
 *
 */
public class Abstract_01 {
	public static void main(String[] args) {
		abstract01 a3 = new abstract03();		//abstract03{}实现了abstract01{}的eat()
		a3.eat();
		abstract01 a4 = new abstract04();		//abstract04{}继承了abstract02{},abstract02{}继承了abstract01{}的抽象方法
		a4.eat();
	}

}
abstract class abstract01{
	abstract void eat();
	protected void name() {
		System.out.println("抽象类");
	}
}
abstract class abstract02 extends abstract01{
	@Override
	protected void name() {
		System.out.println("实现类");
	}
}
class abstract03 extends abstract01{

	@Override
	void eat() {
		System.out.println("实现类吃");
	}
}
class abstract04 extends abstract02{

	@Override
	void eat() {
		System.out.println("实现类吃");
	}
}