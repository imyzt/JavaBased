package top.imyzt.itcase.day27;

import java.lang.reflect.Field;

import top.imyzt.itcase.day27.model.Person;

/**
 * 修改成员的私有属性
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月22日 下午3:25:27 
 */
public class Demo05_setProperty {

	public static void main(String[] args) throws Exception {
		
		Person person = new Person(1, "杨镇涛", "湖南长沙", "232", '男');
		System.out.println(person);
		
		setProperty(person, "name", "涛镇杨");
		System.out.println(person);
	}
	
	public static void setProperty(Object obj, String field, String args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class<? extends Object> object = obj.getClass();
		Field declaredField = object.getDeclaredField(field);
		declaredField.setAccessible(true);
		declaredField.set(obj, args);
	}

}
