package top.imyzt.itcase.day09;

import java.time.LocalDate;

/**
 * 
 * 成员变量
 * 		编译看左边(父类),运行看左边(父类)
 * 成员方法
 * 		编译看左边(父类),运行看右边(子类)
 * 静态方法
 * 		编译看左边(父类),运行看左边(父类)
 * 		静态方法和成员变量同属于类
 * @author 01
 */
public class Polymorphic_02 {

	public static void main(String[] args) {
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld.getYear());
		
		Fu01 f = new Zi01();
		//f的指针只能操作new Zi01()中super区(父)中的成员变量(因为左边Fu01 f是Fu01类型的,故只能操作super区父类的成员变量)
		System.out.println(f.num);		//10
		//f的指针能操作重写了的New Zi01()中的print()方法(因为动态绑定机制,编译检查父类是否存在该方法保证编译正常进行,运行动态绑定子类的此方法)
		f.print();
		//static method 和成员变量同属于类,所以和成员变量一样,只能操作到super区的方法
		f.say();
	}
}

class Fu01{
	int num = 10;
	
	public void print() {
		System.out.println("Fu01");
	}
	
	public static void say() {
		System.out.println("Fu01 static");
	}
}

class Zi01 extends Fu01{
	int num = 20;
	
	@Override
	public void print() {
		System.out.println("Zi01");
	}
	
	//此处禁止使用 @Override 注解
	public static void say() {
		System.out.println("Zi01 static");
	}
}
