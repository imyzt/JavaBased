package top.imyzt.itcase.day27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

import top.imyzt.itcase.day27.model.demo02.Fruit;
import top.imyzt.itcase.day27.model.demo02.Juicer;

/**
 * 通过使用Class.forName读取配置文件创建新对象
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月16日 下午2:36:17 
 */
public class Demo02_ClassForName {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

		Properties config = new Properties();
		config.load(new FileInputStream("src\\main\\resources\\config.properties"));
		//创建榨汁机
		Juicer juicer = new Juicer();

		String clazzName = null;
		
		for (Entry<Object, Object> entry : config.entrySet()) {

			//获取到配置文件中的value
			clazzName = entry.getValue().toString();
			//根据value中的全路径,创建Class对象
			Class<?> clazz = Class.forName(clazzName);
			// Class 对象的 newInstantce() 方法通过对象的无参构造器创建对象,通过强转转化为指定类型
			Fruit fruit = (Fruit) clazz.newInstance();
			//运行榨汁机,给榨汁机指定对象
			juicer.run(fruit);
		}

	}

}
