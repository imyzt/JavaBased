package top.imyzt.itcase.day08;

/**
 * 代码加载顺序
 * @author 01
 *
 */
public class ExtentdsCase02 {

	public static void main(String[] args) {
		Zi01 z = new Zi01();
		
		/*
		 * 1.main方法进栈
		 * 2.Fu01.class加载内存,Zi01加载内存
		 * 3.Fu01.class进内存同时,Fu01的静态代码块执行
		 * 4.Zi01.class进内存同时,Zi01的静态代码块执行
		 * 
		 * Fu静态代码块
		 * Zi静态代码块
		 * Fu构造代码块
		 * Fu无参构造
		 * Zi构造代码块
		 * Zi无参构造
		 */
	}
}

class Fu01{
	
	static {
		System.out.println("Fu静态代码块");
	}
	
	{
		System.out.println("Fu构造代码块");
	}
	
	public Fu01() {
		System.out.println("Fu无参构造");
	}
}

class Zi01 extends Fu01{
	
	static {
		System.out.println("Zi静态代码块");
	}
	
	{
		System.out.println("Zi构造代码块");
	}
	
	public Zi01() {
		System.out.println("Zi无参构造");
	}
}