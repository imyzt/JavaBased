package top.imyzt.itcase.day23;

import java.math.BigInteger;

/**
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月9日 上午8:48:10 
*/
public class Demo03_Case {

	public static void main(String[] args) {
		
		BigInteger bi1 = new BigInteger("1");
		for (int i = 1; i <= 5; i++) {
			BigInteger bi2 = new BigInteger(i + "");	
			bi1 = bi1.multiply(bi2);
			System.out.println(bi1);
		}
		
	}
	
}
