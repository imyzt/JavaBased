package top.imyzt.itcase.day17;

import java.util.HashSet;

/** 
* @author 杨镇涛
* @date 2018年4月19日 下午3:57:10 
* @version 1.0 
* @Description Set的子类HashSet,无序不可重复集合 
*/
public class Demo01_HashSet {

	public static void main(String[] args) {
		
		/**
		 * 为什么重写equals()方法一定要重写hashCode()方法?
		 * 相同属性的对象的hashCode()值相同
		 * HashSet保证不重复的依据是首先比较对象的hashCode(),如果值相同,调用对象的equals()方法
		 * 保证hashCode不重复,更少调用对象的equals()
		 */
		
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("张三",12,"男"));
		set.add(new Person("张三",12,"男"));
		set.add(new Person("张三",13,"男"));
		set.add(new Person("张三",14,"男"));
		set.add(new Person("张三",16,"男"));
		set.add(new Person("张三",111,"男"));
		set.add(new Person("张三",112,"男"));
		set.add(new Person("张三",132,"男"));
		
		for (Person person : set) {
			System.out.println(person);
		}
		
		
	}
}
class Person{
	private String name;
	private Integer age;
	private Integer sex;
	public Person() {
		super();
	}
	public Person(String name, Integer age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = changeSex(sex);
	}
	public Person(String name, Integer age, Integer sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
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
	public String getSex() {
		return changeSex(sex);
	}
	public void setSex(String sex) {
		this.sex = changeSex(sex);
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	/**
	 * 将传入的字符串修改为数字
	 * @param sex
	 * @return
	 */
	private int changeSex(String sex) {
		int result = 0;
		switch (sex) {
		case "男":
			result = 1;
			break;
		case "女":
			result = 0;
			break;
		default:
			throw new IllegalArgumentException("参数异常");
		}
		return result;
	}
	private String changeSex(int sex) {
		String result = null;
		switch (sex) {
		case 1:
			result = "男";
			break;
		case 0:
			result = "女";
			break;
		default:
			throw new IllegalArgumentException("参数异常");
		}
		return result;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		System.out.println(result);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + changeSex(sex) + "]";
	}
}