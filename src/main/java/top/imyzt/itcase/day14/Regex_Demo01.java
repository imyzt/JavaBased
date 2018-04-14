package top.imyzt.itcase.day14;
/** 
* @author 杨镇涛
* @date 2018年4月14日 下午4:46:33 
* @version 1.0 
* @Description 
*/
public class Regex_Demo01 {

	public static void main(String[] args) {
//		demo01();
		
		/*
		 * \d = [0-9]
		 * \D = [^0-9]
		 * \s = 空白字符
		 * \S = 非空白字符
		 * \w = [a-zA-Z_0-9]
		 * \W = [^\w]非单词数字字符
		 */
		//\s匹配一个空白字符,一个空格和一个回车均可以
		System.out.println(" ".matches("\\s"));
		System.out.println("	".matches("\\s"));
		System.out.println("    ".matches("\\s"));		//四个空格,不行			
		System.out.println("f".matches("\\w"));
		System.out.println("f".matches("\\W"));
		
	}

	/**
	 * 字符类
	 */
	private static void demo01() {
		//[]中括号,取一个
		System.out.println("\"a\".matches(\"[abc]\"):" + "a".matches("[abc]"));	//[...]匹配其中任意一个
		System.out.println("\"a\".matches(\"[^abc]\"):" + "a".matches("[^abc]")); //[^...]匹配除了...中任意一个
		System.out.println("\"a\".matches(\"[a-h[e-z]]\":" + "a".matches("[a-h[e-z]]")); //取a-h和e-z的并集a-z
		System.out.println("\"f\".matches(\"[a-h&&[e-z]]\"):"+ "f".matches("[a-h&&[e-z]]")); //取a-h和e-z的交集e-h
		System.out.println("\"a\".matches(\"[a-z&&[^f-z]]\"):" + "a".matches("[a-z&&[^f-z]]")); //取a-z中除了f-z的交集的任意一个
	}
	
}
