package top.imyzt.itcase.day08;

/**
 * 继承常见面试题01
 * @author 01
 *
 */
public class ExtendsCase01 {

	public static void main(String[] args) {
		/*
		 * syso Fu
		 * syso Zi
		 */
		Zi zi =  new Zi();
		zi.show();
	}
	
}
class Fu{
	public int num = 10;
	public Fu() {
		System.out.println("Fu");
	}
}
class Zi extends Fu{
	int num = 20;
	public Zi() {
		System.out.println("Zi");
	}
	
	public void show() {
		int num = 30;
		System.out.println(num);			//30
		System.out.println(this.num);		//20
		System.out.println(super.num);		//10
	}
}