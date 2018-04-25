package top.imyzt.test;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.util.IdcardUtil;

/** 
* @author 杨镇涛
* @date 2018年4月24日 上午9:13:14 
* @version 1.0 
* @Description 
*/
public class HuTools {


	public static void main(String[] args) {
		String idCard = "321083197812162119";
		System.out.println(IdcardUtil.isValidCard("321083197812162119"));
		System.out.println(IdcardUtil.hide("321083197812162119", 6, 14));
		DateTime parse = DateUtil.parse("2018-04-24");
		System.out.println(IdcardUtil.getAgeByIdCard(idCard, parse));
		
		
		Console.error("hehe");
	}

}

class Person{
	private String name;
}