package top.imyzt.itcase.day21;
/**
 * 
 * 装饰设计模式
 * 	装饰设计模式不像继承,继承的基类发生改变,子类也需要作出相应的改变,耦合度太高.
 * 	装饰设计模式的耦合度不高,被装饰的类发生改变不会影响到装饰类
 * 
 * 对原有功能的增强,并且不影响原有功能
 * 
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月5日 上午9:04:31 
*/
public class Demo03_Wrap {

	public static void main(String[] args) {
		//装饰类通过有参构造器初始化时传入被装饰类的对象
		Studen s = new Studen(new Person());
		s.code();
	}

}
interface Coder{
	void code();
}
/**
 * 被装饰的类
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月5日 上午9:14:27
 */
class Person implements Coder{

	@Override
	public void code() {
		System.out.println("学习");
	}
}
/**
 * 装饰类
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月5日 上午9:14:40
 */
class Studen implements Coder{

	//被装饰类的引用
	Person p;
	
	//在构造方法中传入被装饰的类的对象
	public Studen(Person p) {
		this.p = p;
	}

	//对原有的功能进行增强
	@Override
	public void code() {
		p.code();
		System.out.println("学习java");
		System.out.println("学习js");
	}
	
}