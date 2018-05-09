package top.imyzt.itcase.day23;
/**
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月8日 下午2:43:22 
*/
public class Demo02_Fibonacci {

	public static void main(String[] args) {
		/*
		 * 斐波拉契数列
		 * 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
		 * 从第三位开始,每一项等于前两项之和
		 */
		System.out.println(fibonacci(12));
		
		
		/*
		 * 使用for循环求解斐波拉契数列
		 */
		//定义斐波拉契数列的第一位和第二位
		int one = 1, two  = 1;
		//for (3 * 4 * 5 * ... n)
		for (int i = 3; i <= 12; i++) {
			//第三位 等于前两项之和
			int three = one + two;
			System.out.println(three);
			//第一位后移一位 
			one = two;
			//第二位后移一位
			two = three;
		}
	}

	/**
	 * 递归求解斐波拉契数列
	 * @author:imyzt
	 * @date:2018年5月9日上午8:55:58
	 * @param n
	 * @return
	 */
	public static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}else {
			return fibonacci(n - 2) + fibonacci(n - 1);
		}
	}
}
