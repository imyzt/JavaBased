package top.imyzt.itcase.day27;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map.Entry;
import java.util.Properties;

import top.imyzt.itcase.day27.model.Person;

/**
 * 通过读取配置文件加载类，运行类的print()私有方法
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月22日 下午3:40:29 
 */
public class Case02_reflect {

	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		properties.load(new FileInputStream(new File("conf.properties")));
		
		Class<?> clazz = null;
		
		for (Entry<Object, Object> entry : properties.entrySet()) {
			if ("class".equals(entry.getKey())) {
				clazz = Class.forName((String) entry.getValue());
				break;
			}
		}
		
		if (clazz == null) {
			return;
		}
		
		Constructor<?> constructor = clazz.getConstructor(String.class);
		Person person = (Person) constructor.newInstance("杨镇涛");
		
		
		Method print = clazz.getDeclaredMethod("print", String.class);
		print.setAccessible(true);
		print.invoke(person, "张三丰");
		
	}

}
