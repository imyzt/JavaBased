package top.imyzt.itcase.day08;

/**
 * 
 * @author 01
 *
 */
public class TestExtends_02 {
	
	public static void main(String[] args) {
		/*
		 * 实例化c时顺序
		 * 1.new Cat()调用Cat()无参构造 Cat(){}
		 * 2.Cat(){} 中的this("zs");	调用有参构造
		 * 3.有参构造中super(name);调用父类有参构造
		 * 4.父类有参构造执行完毕,子类有参构造执行完毕,子类无参构造执行完毕
		 */
		Cat c = new Cat();	//一,二,三,四,五
		System.out.println(c.name);
		
		System.out.println("--------------------");
		
		/*
		 * 实例化c2时顺序
		 * 1.new Cat("李四");调用Cat()有参构造Cat(String name) {}
		 * 2.Cat(String name) {}中的super(name);调用父类有参构造
		 * 3.父类有参构造执行完毕,子类有参构造执行完毕
		 */
		Cat c2 = new Cat("李四");	//1,2,3,4,5
		System.out.println(c2.name);
	}

}

class Animal{

	String name;
	
	//父类没有无参构造
	
	//第五步,第3步
	public Animal(String name) {
		this.name = name;
		System.out.println("父类有参构造");
	}
}

class Cat extends Animal {

	//第一步.
	public Cat() {
		//第二步.
		this("张三");		//子类无参构造可以调用子类有参构造,通过this(参数)
		System.out.println("子类无参构造");
	}
	
	//第三步,第1步
	public Cat(String name) {
		//第四步,第2步
		super(name);		//子类必须调用父类有参构造
		System.out.println("子类有参构造");
	}
}
