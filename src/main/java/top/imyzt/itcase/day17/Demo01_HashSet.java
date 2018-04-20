package top.imyzt.itcase.day17;

import java.util.HashSet;

/** 
* @author 杨镇涛
* @date 2018年4月19日 下午3:57:10 
* @version 1.0 
* @Description Set的子类HashSet,无序不可重复集合 
* 
* HashSet原理:
* 	我们使用Set集合都是需要去重,如果在存储的时候逐个比较equals()方法,效率较低,哈希算法提高了去重的效率,降低了使用equals()方法的调用次数
* 	当HashSet调用add()方法存储对象的时候,会先调用HashCode()方法得到一个哈希值,然后在集合中查找是否有相同哈希值的对象.(相同属性的对象的哈希值相同)
* 		如果没有哈希值相同的对象就直接存入集合
* 		如果有哈希值相同的对象,就和哈希值相同的对象逐个进行equals比较,比较结果为false就存入,true不存
* 	将自定义对象存入HashSet去重时:
* 		1.类中必须重写hashCode()和equals()
* 		2.hashCode():属性值相同的值必须相同,属性值不同的返回值尽量不同(提高效率)
* 		3.equals():属性值相同返回true,属性值不同返回false
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
		/**
		 * 为什么是31?
		 * 1.31是质数,质数只能被1和本身整除
		 * 2.31不大不小,不会超出int取值范围
		 * 3.31是2^5-1
		 */
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