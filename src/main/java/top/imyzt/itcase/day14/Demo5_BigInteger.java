package top.imyzt.itcase.day14;

import java.math.BigInteger;

/** 
* @author 杨镇涛
* @date 2018年4月17日 上午9:10:20 
* @version 1.0 
* @Description BigInteger类学习 
*/
public class Demo5_BigInteger {
	
	public static void main(String[] args) {
		
		BigInteger bi1 = new BigInteger("100");
		BigInteger bi2 = new BigInteger("2");
		
		System.out.println(bi1.add(bi2));			//加
		System.out.println(bi1.subtract(bi2));		//减
		System.out.println(bi1.multiply(bi2));		//乘
		System.out.println(bi1.divide(bi2));		//除
		
		//返回this / val 和 this % val 的数组
		BigInteger[] arr = bi1.divideAndRemainder(bi2);
		for (BigInteger i : arr) {
			System.out.println(i);
		}
		
	}

}
