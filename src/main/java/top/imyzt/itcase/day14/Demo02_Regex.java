package top.imyzt.itcase.day14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
* @author 杨镇涛
* @date 2018年4月16日 下午5:34:06 
* @version 1.0 
* @Description 正则 Pattern 类
*/
public class Demo02_Regex {
	
	public static void main(String[] args) {
		
		String s = "手机号码是:18749003032,以前是:18530111234,以后是:18888888888";
		String regex = "1[358]\\d{9}";
		Pattern pattern = Pattern.compile(regex);   //通过compile编译正则表达式
		Matcher matcher = pattern.matcher(s);		//获取匹配项
		
		while (matcher.find()) {					//查找
			System.out.println(matcher.group());	//打印查找出来的内容
		}
		
	}

}
