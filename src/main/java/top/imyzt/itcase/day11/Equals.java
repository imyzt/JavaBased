package top.imyzt.itcase.day11;
/**
 *  
* @ClassName: Equals 
* @Description: 重写equals方法 
* @author 杨镇涛
* @date 2018年4月10日 下午4:50:40 
*
 */
public class Equals {
	
	public static void main(String[] args) {
		Person p1 = new Person("y");
		
		Person p2 = new Person("y");
		
		System.out.println(p2.hashCode());		//获取该对象的地址值
		System.out.println(p2.toString());		//没重写前直接返回该类全类名@16位地址值
		System.out.println(p2.getClass().getName());	//获取该类的全类名
		System.out.println(p1.equals(p2));
	}
}

class Person{
	private String name;

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person() {
		super();
	}

	//重写equals方法,比较对象的属性值是否相同
	@Override
	public boolean equals(Object obj) {
		//先判断两个对象是否为空,在判断obj是否是this实例对象的类或派生类
		if (this != null && obj != null && obj instanceof Person) {
			Person p = (Person) obj;
			return this.getName().equals(p.getName());
		}
		return false;
	}
	
}