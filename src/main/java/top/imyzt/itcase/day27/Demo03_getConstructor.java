package top.imyzt.itcase.day27;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过有参和无参构造的方式创建对象 
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月22日 下午2:23:46 
 */
public class Demo03_getConstructor {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> clazz = Demo03.class;
		
		//通过有参的方式创建对象
		Constructor<?> constructor = clazz.getConstructor(String.class);
		Demo03 demo03 = (Demo03) constructor.newInstance("杨镇涛");
		demo03.print();
		
		//通过无参构造方法创建对象
		Demo03 demo = (Demo03) clazz.newInstance();
		demo.print();
	}

}
class Demo03{
	private String name;

	public Demo03(String name) {
		super();
		this.name = name;
	}

	public Demo03() {
		super();
	}
	
	public void print() {
		System.out.println("name = " + this.name);
	}
}
