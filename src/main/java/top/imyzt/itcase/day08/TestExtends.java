package top.imyzt.itcase.day08;

/**
 * 继承特点
 * 		a:java只支持单继承
 * 		b:java支持多层继承
 * 继承注意事项
 * 		a:子类只能继承父类所有非私有的成员方法、变量
 * 		b：子类不能继承父类的构造方法，但是可以通过super关键字调用父类的构造器
 * 		c：不要为了部分功能而去继承
 * 		d:子类中所有构造那个方法默认都会调用父类空参构造,因为子类会继承父类的数据,所以一定能够要先完成父类数据的初始化
 * 		e:父类没有无参构造时,需调用有参构造
 * 
 * 案例
 * 		a:不同名的变量
 * 		b:同名的变量，子类出现和父类同名变量时会采用就近原则
 * 
 * 
 * this和super区别
 * 		调用成员变量:
 * 			this调用本类的成员变量,也可以调用父类的成员变量(当子类没有的时候)
 * 			super调用父类的成员变量
 * 		调用构造方法
 * 			this(...)调用本类的构造方法
 * 			super(...) 调用父类构造器
 * 		调用成员方法
 * 			this.成员方法 调用本类或父类成员方法,子类没有时调用父类的
 * 			super.成员方法 调用父类的成员方法   
 * 
 * 
 * @author 01
 *
 */
public class TestExtends {
	
	public static void main(String[] args) {
		Son s = new Son();
		s.name = "zs";
		s.speak();
		s.print();
		System.out.println(s.address);		//采用就近原则,使用子类的变量值
	}
	
}

class Father{
	String name;
	String address = "cs";
	
	/*public Father() {
		System.out.println("Father的无参构造");
	}*/
	
	public Father(String name) {
		this.name = name;
		System.out.println("Father的有参构造");
	}
	
	public void speak() {
		System.out.println(name + "说话");
	}
}

class Son extends Father{
	String address = "xt";		//和父类变量名相同
	
	public Son() {
		
//		super(); 		//默认调用父类无参构造.
		super("zs");	//如果父类没有无参构造,必须显示调用super(参数列表)
		
		System.out.println("Son的无参构造");
	}
	
	public void print() {
		System.out.println(address);		//采用就近原则,使用子类的变量值
		System.out.println(this.name);		//子类没有name,调用父类的
		System.out.println(this.address);	//子类有address,调用本类的
		System.out.println(super.address);	//直接调用父类的address
	}
}