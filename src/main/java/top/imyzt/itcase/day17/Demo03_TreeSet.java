package top.imyzt.itcase.day17;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 杨镇涛
 * @date 2018年4月20日 上午9:56:06
 * @version 1.0
 * @Description TreeSet,基于二叉树实现,用于对象进行排序,同样可以保证对象的唯一性(compareTo()方法和自定义比较器)
 *              当compareTo方法返回0的时候,集合中只有一个元素 
 *              当compareTo方法返回 正数 的时候,元素存储在右边,集合怎么存怎么取
 *              当compareTo方法返回 负数 的时候,元素存储在左边,集合倒序存放
 */
public class Demo03_TreeSet {

	public static void main(String[] args) {
		TreeSet<Student> ts = new TreeSet<>();
		ts.add(new Student("张三",12));
		ts.add(new Student("赵四",113));
		ts.add(new Student("王五",14));
		System.out.println(ts);		//[Student [name=张三, age=12], Student [name=王五, age=14], Student [name=赵四, age=113]]
		
		TreeSet<Student> ts2 = new TreeSet<>(new ComparatorA());
		ts2.add(new Student("王五",14));
		ts2.add(new Student("a",1222));	//比较器定义的规则是姓名长度优先比较,年龄第二比较.所以不管年龄多大,姓名最短,最小
		ts2.add(new Student("赵四",113));
		System.out.println(ts2);	//[Student [name=a, age=1222], Student [name=王五, age=14], Student [name=赵四, age=113]]
	}
}
class Student implements Comparable<Student>{
	private String name;
	private Integer age;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}
	@Override
	public int compareTo(Student o) {
		int num = this.age - o.age;
		return num == 0 ? this.name.compareTo(o.name) : num;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}

/**
 * 比较器比较法
 */
class ComparatorA implements Comparator<Student>{

	/**
	 * 谁调用谁就是o2
	 */
	@Override
	public int compare(Student o1, Student o2) {
		int len = o1.getName().length() - o2.getName().length();
		return len == 0 ? o1.getAge() - o2.getAge() : len;
	}
}