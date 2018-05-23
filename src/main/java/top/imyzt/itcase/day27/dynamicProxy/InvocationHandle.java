package top.imyzt.itcase.day27.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 实现 InvocationHandle 的invoke()方法增强被代理对象的功能
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月23日 上午9:11:38 
 */
public class InvocationHandle implements InvocationHandler{
	
	//被代理的对象
	private Object target;
	
	public InvocationHandle(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		//模拟增强操作
		System.out.println("权限验证");
		
		method.invoke(target, args);
		
		//模拟增强操作
		System.out.println("日志记录");
		return null;
	}

}
