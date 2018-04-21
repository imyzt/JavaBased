package top.imyzt.itcase.day18;

import java.util.Comparator;
import java.util.TreeMap;

/** 
* @author 杨镇涛
* @date 2018年4月21日 下午4:51:08 
* @version 1.0 
* @Description 
* 二叉树实现,key不可重复
* 
* 可以通过实现Comparable接口重写compareTo()进行排序
* 也可以通过自定义比较器实现
*/
public class Demo03_TreeMap {

	public static void main(String[] args) {
		
//		compareTo();
//		comparaTor();
	}

	private static void comparaTor() {
		TreeMap<Student, String> map = new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				int num = s1.age - s2.age;
				return 0 == num ? s1.name.compareTo(s2.name) : num;
			}
			
		});
		map.put(new Student("赵六",20), "长沙");
		map.put(new Student("王五",30), "上海");
		map.put(new Student("李四",40), "广州");
		map.put(new Student("张三",10), "深圳");
		
		System.out.println(map);//{Student [name=张三, age=10]=深圳, Student [name=赵六, age=20]=长沙, Student [name=王五, age=30]=上海, Student [name=李四, age=40]=广州}
	}

	private static void compareTo() {
		TreeMap<Student, String> map = new TreeMap<>();
		map.put(new Student("赵六",20), "长沙");
		map.put(new Student("王五",20), "上海");
		map.put(new Student("李四",20), "广州");
		map.put(new Student("张三",20), "深圳");
		
		//通过重写compareTo(),对传入的对象进行排序.(只针对key排序)
		System.out.println(map);//{Student [name=张三, age=20]=深圳, Student [name=李四, age=20]=广州, Student [name=王五, age=20]=上海, Student [name=赵六, age=20]=长沙}
	}
}
class Student implements Comparable<Student>{

	String name;
	Integer age;
	
	
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
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
		return true;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Student s) {
		int num = this.name.compareTo(s.name);
		return 0 == num ? this.age - s.age : num;
	}
}
