package top.imyzt.itcase.day27;

import top.imyzt.itcase.day27.model.Person;

/**
 * 
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月16日 下午2:21:07 
 */
public class Demo01_reflect {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<Person> clazz01 = Person.class;
		
		Person p = new Person();
		Class<? extends Person> clazz02 = p.getClass();
		
		Class<?> clazz03 = Class.forName("top.imyzt.itcase.day27.model.Person");
		
		System.out.println(clazz01 == clazz02);
		System.out.println(clazz02 == clazz03);
	}

}
