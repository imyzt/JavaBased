package top.imyzt.itcase.day16;

import java.util.ArrayList;
import java.util.List;

/** 
* @author 杨镇涛
* @date 2018年4月18日 下午8:32:00 
* @version 1.0 
* @Description 通配符泛型,当左边类型不确定时,可以指定通配符 
*/
public class Demo06_WildcardGeneric {

	public static void main(String[] args) {
		List<? super Person> list = new ArrayList<Person>();
		list.add(new Person());
	}
	
}
class Person{
	public String name;
}
class Student01 extends Person{
	
	public Student01(String name) {
		super();
		this.name = name;
	}

	public String name;
}
