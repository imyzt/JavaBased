package top.imyzt.itcase.day09;

/**
 * 多态概述
 * 		事物存在的多种形态
 * 多态前提
 * 		a:要有继承关系
 * 		b:要有方法重写
 * 		c:要有父类引用指向子类对象
 * @author 01
 *
 */
public class Polymorphic_01 {

	public static void main(String[] args) {
		//普通方法
		Cat c = new Cat();
		c.eat();
		
		//父类引用指向子类对象
		Animal a = new Cat();
		a.eat();
	}
}

class Animal{
	public void eat() {
		System.out.println("动物吃饭");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("猫吃鱼");
	}
}
