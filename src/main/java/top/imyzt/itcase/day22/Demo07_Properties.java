package top.imyzt.itcase.day22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Enumeration;
import java.util.Properties;

public class Demo07_Properties {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		
		//设置Properties从指定输入流中读取
		prop.load(new InputStreamReader(new FileInputStream("config.properties"), "UTF-8"));
		
		//向配置文件中添加年龄配置
		prop.put("age", "20");

		//修改配置文件中upass字段
		prop.setProperty("upass", "654321");
		
		//将修改的内容进行存储
		prop.store(new OutputStreamWriter(new FileOutputStream("config.properties"), "UTF-8"), "修改了密码");
		
		// Properties 继承自 Hashtable 类,具有它的所有属性和方法
		//通过获取所有的key,迭代输出 Properties 中所有信息
		Enumeration<?> keys = prop.propertyNames();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			System.out.println("{" + key + "=" + prop.getProperty(key) + "}");
		}
		
		System.out.println(prop);
	}

}
