package top.imyzt.itcase.day12;
/** 
* @author 杨镇涛
* @date 2018年4月11日 下午2:37:36 
* @version 1.0 
* @Description String类常用方法 
*/
public class String_Method {
	
	public static void main(String[] args) {
		String a = "123";
		String b = "abc";
		String c = "ABC";
		
		System.out.println(a.equals(b));
		System.out.println(b.equalsIgnoreCase(c));	//不区分大小写比较内容是否相同
		System.out.println(a.concat(b));
		System.out.println(a.startsWith("1"));		//是否以1开始
	}

}
