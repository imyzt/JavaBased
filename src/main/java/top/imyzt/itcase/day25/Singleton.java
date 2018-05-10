package top.imyzt.itcase.day25;
/**
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月10日 下午12:02:01 
*/
public class Singleton {

public static void main(String[] args) {
	SingletonHungry sh1 = SingletonHungry.getInstance();
	SingletonHungry sh2 = SingletonHungry.getInstance();
	System.out.println("饿汉模式创建的单例是否为同一个对象: " + (sh1 == sh2));	//true
	
	
	SingletonLazy sl1 = SingletonLazy.getInstace();
	SingletonLazy sl2 = SingletonLazy.getInstace();
	System.out.println("懒汉模式创建的单例是否为同一个对象: " + (sl1 == sl2));	//true
	
	StaticInner si1 = StaticInner.getInstance();
	StaticInner si2 = StaticInner.getInstance();
	System.out.println("静态内部类方式创建的单例是否为同一个对象: " + (si1 == si2));	//true
	
}

}

/**
 * 饿汉模式:空间换时间,一加载就创建对象.
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月10日 下午2:37:28
 */
class SingletonHungry {
	
	//1.将构造方法私有化，外部将不可通过new创建此类的实例。
	private SingletonHungry() {
		
	}
	
	/*
	 * 2.其它类无法实例化本类,在本类中实例化,创建本类的唯一实例
	 * 使用static将instance转化为成员变量,在类加载时执行.
	 * 使用private修饰防止其它类直接调用修改.
	 */
	private static SingletonHungry instance = new SingletonHungry();
	
	//3.对外提供公共的访问方法,此方法提供的永远是此类被加载时获取的instance实例
	public static SingletonHungry getInstance() {
		return instance;
	}
}

/**
 * 线程安全的懒汉模式: 时间换空间,使用时才创建对象.
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月10日 下午3:08:50
 */
class SingletonLazy	{
	
	//1.将构造方法私有化，外部将不可通过new创建此类的实例。
	private SingletonLazy() {
		
	}
	
	//2.声明一个引用
	private static SingletonLazy instance;
	
	//3.提供一个用户获取唯一实例的方法
	public static SingletonLazy getInstace() {
		if (instance == null) {
			/*
			 * 双重判断提高效率
			 * 如果第一个线程获取到了单例的实例对象,后面的线程在获取实例对象时不需要进入同步代码块了.
			 */
			synchronized (SingletonLazy.class) {
				if (instance == null) {	//二重检查保证实例唯一性
					instance = new SingletonLazy();
				}
			}
		}
		return instance;
	}
}

/**
 * 静态内部类的单例模式
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月10日 下午3:17:18
 */
class StaticInner{
	
	//1.将构造方法私有化，外部将不可通过new创建此类的实例。
	private StaticInner() {
		
	}
	
	/*
	 * 静态内部类创建外部类对象
	 * private防止外部类调用修改.
	 * final保证唯一性
	 * static保证外部类能直接访问,而不是需要创建内部类对象.那样就不是单例了
	 */
	private static class InnerInstance {
		//类初始化之前的系列操作...
		private final static StaticInner instance = new StaticInner();
	}
	
	public static StaticInner getInstance() {
		return InnerInstance.instance;
	}
}
