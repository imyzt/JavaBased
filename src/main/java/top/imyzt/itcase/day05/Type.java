package top.imyzt.itcase.day05;

/**
 * 基本数据类型对比引用数据类型
 * 
 * 基本数据类型的值传递,不改变原值,因为调用后会弹栈,局部变量(change中的变量)随之消失
 * 引用数据类型的值传递,改变原值,因为即使方法弹栈,但是堆内存中的对象还在,可以通过地址继续访问
 * @author 01
 * 
 * java中到底是值传递还是址传递
 * 1.既是传值,也是传址,基本数据类型传递的值,引用数据类型传递的址
 * 2.java中只有传值,因为地址值也是值.(java之父支持)
 *
 */
public class Type {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("a=" + a + ", b=" + b);		//a=10, b=20
		change(a,b);	//传递的值
		System.out.println("a=" + a + ", b=" + b);		//a=10, b=20,为什么变成了开始的10,20?
		
		System.out.println(" ------------------------ ");
		
		int c[] = {1,2,3,4,5};
		System.out.println(c[1]);						//2
		change(c);	//传递的地址
		System.out.println(c[1]);						//4,为什么变成了4
		
		System.out.println(" ------------------------ ");
		
		String str = "String";
		System.out.println(str);						//String
		change(str);	//传递的值(String类型特殊)
		System.out.println(str);						//str=String
		
		
	}

	private static void change(int[] c) {
		for (int i = 0; i < c.length; i++) {
			if (c[i] % 2 == 0) {
				c[i] = c[i] * 2;	//由于传递的地址,修改后就是真实改变了
			}
		}
	}

	private static void change(int a, int b) {
		System.out.println("a=" + a + ", b=" + b);		//a=10, b=20
		a = 30;											//由于传递的值,栈会重新开辟一块空间存储此方法中的变量.等此方法结束(弹栈),a=30, b=40就会从内存中消失
		b = 40;
		System.out.println("a=" + a + ", b=" + b);		//a=30, b=40
	}
	
	private static void change(String str) {
		System.out.println("str=" + str);		//str=String
		str = "str";											//由于传递的值,栈会重新开辟一块空间存储此方法中的变量.等此方法结束(弹栈),str=str就会从内存中消失
		System.out.println("str=" + str);		//str=str
	}
	
}
