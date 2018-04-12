package top.imyzt.itcase.day12;

/** 
 * @author 杨镇涛
 * @date 2018年4月11日 下午7:56:53 
 * @version 1.0 
 * @Description 
 */
public class String_03 {

	public static void main(String[] args) {

		//		demo01();

		//		demo02();

		
		demo03();



	}

	/**
	 * 查找s2在s1中出现的次数
	 */
	private static void demo03() {
		String s1 = "jjjjsdfadfjjjsdfaasdfadsjjjasfdfdsjjjfsadfajjj";
		String s2 = "jjj";

		int count = 0;
		int index = 0;
		while ((index = s1.indexOf(s2)) != -1) {
			s1 = s1.substring(index + s2.length());
			++count;
		}
		System.out.println(count);
	}

	private static void demo02() {
		int[] arr = {1,2,3,4};
		System.out.println(String.valueOf(arr));
		System.out.println(new StringBuffer("abc").reverse());
	}

	private static void demo01() {
		String s1 = "kjfdsajfksdahfjksdahfiuwehFSJDKHNRW";
		//将首字母转换为大写,其他的全小写
		String s2 = s1.substring(0,1).toUpperCase().concat(s1.substring(1).toLowerCase()); //链式编程
		System.out.println(s2);
	}
}
