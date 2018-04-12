package top.imyzt.itcase.day13;
/** 
* @author 杨镇涛
* @date 2018年4月12日 上午10:00:50 
* @version 1.0 
* @Description StringBuffer练习 
*/
public class StringBuffer_01 {

	public static void main(String[] args) {
		/**
		 * sb1的长度="123"的长度+16
		 * StringBuffer是引用数据类型,change(sb1);传递的是址,方法内部修改了地址值的对象,故打印时发生了变化
		 */
		StringBuffer sb1 = new StringBuffer("123");
		System.out.println(sb1);		//123
		change(sb1);
		System.out.println(sb1);		//123456
		
		System.out.println("-----------------");
		/**
		 * String虽然是引用数据类型,但String当做参数传递时和基本数据类型一致,传递的是值不是址
		 */
		String s = "123";
		System.out.println(s);		//123
		change(s);
		System.out.println(s);		//123
	}

	public static void change(StringBuffer sb) {		//sb1对象和sb对象指向的是同一个引用
		sb.append("456");
		System.out.println(sb);		//123456
	}

	public static void change(String s) {		//s在change()弹栈后变成垃圾回收了
		s = s + "456";
		System.out.println(s);		//123456
	}
}
