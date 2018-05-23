package top.imyzt.itcase.day27.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 测试JDK的动态代理，JDK的代理只能代理接口
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月23日 上午9:13:43 
 */
public class TestJDKProxy {

	public static void main(String[] args) {
		
		StudentImpl student = new StudentImpl();
		
		InvocationHandle invocationHandle = new InvocationHandle(student);
		
		/**
		 * Proxy 类的newProxyInstance()方法可以代理指定的对象
		 * 
		 * newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h);
		 * ClassLoader 可以通过被代理对象的字节码文件(Class)的getClassLoader()方法获取
		 * interface可以通过被代理对象的字节码文件(Class)的getInterfaces()方法获取
		 * InvocationHandler 即实现 InvocationHandler 的类，用于增强被代理类
		 * 
		 */
		IStudent stu = (IStudent) Proxy.newProxyInstance(student.getClass().getClassLoader(), student.getClass().getInterfaces(), invocationHandle);
		
		stu.login();
		
	}

}
