package top.imyzt.itcase.day09;

/**
 * 多态的好处和弊端
 * 
 * 好处:
 * 		提高了代码的维护性(继承保证)
 * 		提高了代码的扩展性(由多态保证)
 * 弊端:
 * 		不能使用子类特有的属性和行为
 * @author 01
 *
 */
public class Polymorphic_03 {

	public static void main(String[] args) {

		method(new Dog03());
		method(new Pig03());
		method(new Cat03());
		method(new T());
		
		
		System.out.println();
		Animal03 a = new Dog03();
		a.eat();
	}
	
	public static void method(Animal03 a) {		//当做参数的时候用多态最好,扩展性强
		//instanceof判断左边的引用是否是右边的子类对象或者是相同对象
		if (a instanceof Cat03) {
			Cat03 c = (Cat03) a;			
			c.eat();
			c.catchMouse();
		}else if (a instanceof Dog03) {
			Dog03 d =  (Dog03) a;
			d.eat();
			d.lookHome();
		}else if (a instanceof Pig03) {
			Pig03 p = (Pig03) a;
			p.eat();
			p.sleep();
		}
	}
}

class Animal03{
	public void eat() {
		System.out.println("动物吃饭");
	}
}

class Cat03 extends Animal03{
	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
	public void catchMouse() {
		System.out.println("猫抓老鼠");
	}
}

class Dog03 extends Animal03{
	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}
	public void lookHome() {
		System.out.println("狗看门");
	}
}

class Pig03 extends Animal03{
	@Override
	public void eat() {
		System.out.println("猪吃草");
	}
	public void sleep(){
		System.out.println("猪睡觉");
	}
}
class T extends Pig03{
	@Override
	public void eat() {
		System.out.println("T吃饭");
	}
}