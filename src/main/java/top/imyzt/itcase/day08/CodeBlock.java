package top.imyzt.itcase.day08;

/**
 * 代码块
 * 
 * 代码块分类
 * 		根据其位置和声明的不同,可以分为局部代码块,构造代码块,静态代码块,同步代码块
 * 常见代码块的应用
 * 		a:局部代码块
 * 			在方法中出现,限定变量的声明周期,及早释放,提高内存利用率
 * 		b:构造代码块(初始化块)
 * 			在类中方法外出现,可以将多个构造方法中相同的代码放在一起执行,每次调用构造器都会先执行构造代码块
 * 		c:静态代码块块
 * 			在类中方法外出现,加static修饰
 * 			在类中方法外出现,并加上static修饰,用于给类进行初始化,在类加载的时候就执行,并且只执行一次
 * 			一般用于加载驱动
 * @author 01
 *
 */
public class CodeBlock {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println("------------------------------------------------");
		Student s2 = new Student("zs",12);
		
		/*
		 * 主方法静态代码块 -> Student静态代码块 -> Student构造代码块 -> Student构造器 ->
		 * Student构造代码块 -> Student构造器
		 */
	}
	
	static {
		System.out.println("----------主方法静态代码块----------");
	}

}

class Student{
	
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("----------有参构造器----------");
	}
	
	public Student() {
		System.out.println("----------无参构造器----------");
	}
	
	{					//构造代码块:每创建一次对象就执行一次,优先于构造器执行
		System.out.println("----------构造代码块----------");
		study();
	}
	
	static {				//随着类的加载而加载,且只执行一次
		System.out.println("----------静态代码块----------");		//作用:用来给类进行初始化
	}
	
	private void study() {
		System.out.println("学生学习!");
	}
}