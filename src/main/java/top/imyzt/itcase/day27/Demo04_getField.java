package top.imyzt.itcase.day27;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import top.imyzt.itcase.day27.model.Person;

/**
 * 通过反射获取到对象的成员变量和成员方法
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月22日 下午2:33:55 
 */
public class Demo04_getField {

	public static void main(String[] args) throws Exception {
		Person person = new Person();
		//拿到Person的字节码文件
		Class<? extends Person> clazz = person.getClass();
		
		/**
		 * 通过字节码文件获取对象的有参构造
		 */
		Constructor<? extends Person> cons = clazz.getConstructor(String.class);
		//通过有参构造创建Person对象
		Person p = cons.newInstance("杨镇涛");
		System.out.println(p.toString());
		
		/**
		 * 通过字节码文件获取对象的私有的成员属性
		 */
		Field name = clazz.getDeclaredField("name");
		//设置成员属性为可读写
		name.setAccessible(true);
		//修改成员属性
		name.set(p, "涛镇杨");
		System.out.println(p.toString());
		
		/**
		 * 通过字节码文件获取对象的私有成员方法
		 */
		Method print = clazz.getDeclaredMethod("print", String.class);
		//设置成员方法为可读写
		print.setAccessible(true);
		//调用
		print.invoke(p, "yzt");
		
	}

}
