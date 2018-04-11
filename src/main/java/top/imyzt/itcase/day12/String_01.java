package top.imyzt.itcase.day12;
/**
 *  
* @ClassName: String 
* @Description: String容易混淆的面试题
* @author 杨镇涛
* @date 2018年4月11日 上午11:21:00 
*
 */
public class String_01 {

	public static void main(String[] args) {
		
		demo04();
	}

	private static void demo04() {
		String s1 = "ab";		//常量池中出现"ab"
		
		String s2 = "abc";		//常量池中出现"abc"
		/*
		 * java对 字符串串联(+)以及将其它对象转换为字符串的特殊支持
		 * 字符串串联是通过StringBuffer(或者StringBuild)的append()实现的.字符串转换是通过toString()实现的
		 * 
		 * s1 + "c" 时先在堆内存中创建一个StringBuffer(或Stringbuild)对象,调用append(),sb对象="abc"
		 * 通过sb.toString()方法,将sb对象转换成字符串.
		 * 最终s3指向的是堆内存中toString()方法存放的"abc"字符串地址
		 */
		String s3 = s1 + "c";	
		System.out.println(s2 == s3);
	}

	private static void demo03() {
		byte a = 2 + 2;				//常量优化机制,编译时已经成4了,将4赋值给a, 只针对常量有效
		String s1 = "a" + "b" + "c";  //根据java常量优化机制,在编译时  "a" + "b" + "c" 已经变成"abc"字符串存放于常量池中
		String s2 = "abc";				//直接指向常量池
		System.out.println(s1 == s2);	//true
	}

	private static void demo01() {
		/*
		 * 创建了两次对象."abc"常量一次,new String()一次
		 * new String()操作是将参数复制一份出来放在new String()对象中
		 */
		String s1 = new String("abc"); 		
	}

	private static void demo02() {
		String s1 = new String("abc"); 	//new String()就是将参数中的值从常量池中拷贝一份副本出来放堆内存
		String s2 = "abc";
		//false, s1指向的是堆内存中的new String(),s2指的是常量池中的"abc"
		System.out.println(s1 == s2);
	}
}
