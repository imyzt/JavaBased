package top.imyzt.itcase.day23;

/**
 * 
 * 求解阶乘
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月9日 上午8:48:10 
*/
public class Demo03_Case {

	public static void main(String[] args) {
		
		System.out.println(fun(15));
		
		long n = 1; 
		for (long i = 2; i <= 5; i++) {
			long temp = n;
			
			/*
			 * 1 * 2 = 2		第一次: n(1) * i(2) = 2
			 * 2 * 3 = 6		第二次: n(2) * i(3) = 6
			 * 6 * 4 = 24		第三次: n(6) * i(4) = 24
			 * 24 * 5 = 120		第四次: n(24) * i(5) = 120
			 * 
			 * 用前两项的乘积乘以第三项,以此类推
			 * 通项公式: n! = 1 * 2 * 3 * 4 * n
			 * 
			 * n *= i 等同于 n = n * i
			 */
			n *= i;
			
			System.out.println(temp + " * " + i + " = " + n);
		}
	}
	
	/**
	 * 使用递归求解阶乘
	 * 通项公式: n! = n * (n - 1)!
	 * @author:imyzt
	 * @date:2018年5月9日上午9:17:32
	 * @param n
	 * @return
	 */
	public static long fun(long n) {
		if (n == 1) {
			return 1;
		}else {
			//每一项的阶乘  等于本身 * 本身减一的阶乘
			return n * fun(n - 1);
		}
	}
}
