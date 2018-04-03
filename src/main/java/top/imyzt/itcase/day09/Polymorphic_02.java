package top.imyzt.itcase.day09;

/**
 * 
 * 成员变量
 * 		编译看左边(父类), 运行看左边(父类)
 * @author 01
 */
public class Polymorphic_02 {

	public static void main(String[] args) {
		Fu01 f = new Zi01();
		//f的指针只能操作new Zi01()中super区(父)中的成员变量
		System.out.println(f.num);		//10
	}
}

class Fu01{
	int num = 10;
}

class Zi01 extends Fu01{
	int num = 20;
}
