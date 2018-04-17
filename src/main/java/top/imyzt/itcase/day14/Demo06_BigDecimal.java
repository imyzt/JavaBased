package top.imyzt.itcase.day14;

import java.math.BigDecimal;

/** 
* @author 杨镇涛
* @date 2018年4月17日 上午9:19:49 
* @version 1.0 
* @Description BigDecimal
*/
public class Demo06_BigDecimal {

	public static void main(String[] args) {
		
		System.out.println((2-1.1) == 0.9);  //false
		
		/*
		 * BigDecimal是为了更精确的存储数字
		 * 构造方法传入字符串时会做精确运算.传入数字类型时还是不精确.
		 */
		
		BigDecimal bd1 = new BigDecimal("2.0");
		BigDecimal bd2 = new BigDecimal("1.1");
		
		BigDecimal bd3 = BigDecimal.valueOf(2.0);
		BigDecimal bd4 = BigDecimal.valueOf(1.1);
		System.out.println(bd3.subtract(bd4));
		
		System.out.println(bd1.add(bd2));
		System.out.println(bd1.subtract(bd2));
		System.out.println(bd1.multiply(bd2));
		System.out.println(bd1.divide(bd2));
		
		

	}

}
