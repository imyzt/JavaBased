package top.imyzt.itcase.day16;

import static java.util.Arrays.*;

/** 
* @author 杨镇涛
* @date 2018年4月19日 下午2:24:46 
* @version 1.0 
* @Description jdk1.5新特性,静态导入 
*/
public class Demo09_NewFeaturesByJDK15 {

	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,4,4,5,54,54,3,3,2};
		
		print(12, arr);
		print(1,2,233,3,321,1,12,12,12,21,12,12);
		
//		staticImport();
	}

	/**
	 * jdk1.5新特性,可变参数.
	 * 格式 : 数据类型 ... 参数名
	 * 可变参数必须位于最后一个参数
	 * @param x
	 * @param arr
	 */
	private static void print(int x, int... arr) {
		System.out.printf("第一个参数: %d \n", x);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	/**
	 * jdk1.5新特性,静态导入,没有用
	 */
	private static void staticImport() {
		int[] arr = {3,32,1,12,43,24,9};
		sort(arr);
		//System.out.println(toString(arr));	//静态导入的Arrays.toString()方法和本类从Object类中继承的toString()冲突,无法使用
	}
}
