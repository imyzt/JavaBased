package top.imyzt.itcase.day14;

import java.util.ArrayList;
import java.util.List;

/** 
* @author 杨镇涛
* @date 2018年4月14日 下午4:46:33 
* @version 1.0 
* @Description 
*/
public class Demo03_Regex {

	public static void main(String[] args) {
		
//		demo01();
		
//		demo02();
		
//		demo03();
		
//		demo04();
		
		String s = "我...我...我...我...爱...爱...爱...爱...学...学...学...学...习...习...习...习...习";
		
		String s2 = s.replaceAll("\\.", "");
		
		/*
		 * 分组(.)\1 匹配任意字符一组
		 * (.)\1+ 匹配任意字符一组一次或多次
		 * $1 取组里面的第一个元素
		 */
		String s3 = s2.replaceAll("(.)\\1+", "$1");
		
		System.out.println(s3);
	}

	/**
	 * 使用split正则匹配字符串并排序
	 */
	private static void demo04() {
		String num = "12,3213,1432,132,43,54,23";
		String[] numArr = num.split(",");
		int[] numInt = new int[numArr.length];
		
		for (int i = 0; i < numArr.length; i++) {
			numInt[i] = Integer.parseInt(numArr[i]);
		}
		
		for (int i = 0; i < numInt.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < numInt.length; j++) {
				if (numInt[index] > numInt[j]) {
					index = j;
				}
			}
			if (index != i) {
				int temp  = numInt[i];
				numInt[i] = numInt[index];
				numInt[index] = temp;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i : numInt) {
			sb.append(" " + i);
		}
		String s = sb.toString().substring(1);
		System.out.println(s);
	}

	private static void demo03() {
		//?: 匹配前面的条件 0-1次
		System.out.println("a".matches("[abc]?"));
		System.out.println("".matches("[abc]?"));
		
		//+: 匹配前面的条件1-n次
		System.out.println("abc".matches("[abc]+"));
		
		//*: 匹配前面的条件0-n次
		System.out.println("abcccc".matches("[abc]*"));
		
		/*
		 * {n}: 匹配前面条件{n}次
		 * {n,}: 匹配前面条件至少n次
		 * {n,m}: 匹配前面条件n-m次
		 */
		System.out.println("abc".matches("[abc]{3}"));
		System.out.println("abc".matches("[abc]{3,}"));
		System.out.println("abca".matches("[abc]{2,4}"));
	}

	private static void demo02() {
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
System.out.println("\"a\".matches(\"[a-z&&[^f-z]]\"):" + "f".matches("[a-z&&[^f-z]]")); //取a-z中除了f-z的交集的任意一个
	}
	
}
