package top.imyzt.itcase.day12;
/** 
* @author 杨镇涛
* @date 2018年4月11日 下午7:43:22 
* @version 1.0 
* @Description 
*/
public class String_02 {
	
	public static void main(String[] args) {
		
		String s1 = "中文...";			
		byte[] bytes = s1.getBytes();		//GBK编码中,中文第一个字节一定是负数
		char[] charArray = s1.toCharArray(); 
		for (char c : charArray) {
			System.out.print(c + " ");
		}
		System.out.println();
		for (byte c : bytes) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println(String.valueOf(charArray));		//valueOf底层也是new String();
	}

}
