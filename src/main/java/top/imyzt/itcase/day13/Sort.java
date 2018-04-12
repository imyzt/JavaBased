package top.imyzt.itcase.day13;
/** 
 * @author 杨镇涛
 * @date 2018年4月12日 下午1:49:23 
 * @version 1.0 
 * @Description 选择排序
 */
public class Sort {
	public static void main(String[] args) {
		int len = 1000;
		int arr[] = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		select(arr);
		bubble(arr);
	}

	/**
	 * 选择排序
	 * @param arr
	 */
	private static void select(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = (i+1); j < arr.length - 1; j++) {
				
				if (arr[i] > arr[j + 1]) {
					++ count;
					int temp = arr[i];
					arr[i] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("select比较了 : "+count + "次");
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
	/**
	 * 冒泡排序
	 * @param arr
	 */
	private static void bubble(int[] arr) {

		/**
		 * 冒泡排序
		 * 轻的往上,重的往后
		 * 外层for循环定义比较次数,每一次比较到最后一位元素已经是最大值了,故不需要比较最后一位.比较arr.length - 1次即可
		 * 内层for循环定义比较当前数组长度之间的比较次数  arr.length - 1 - i,-1是防止数组越界,-i是为了提高效率,不需要比较外层for循环已经比较过的数
		 * 
		 */

		int count = 0;
		for (int i = 0; i < arr.length -1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				
				if (arr[j] > arr[j + 1]) {
					++count;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("\nbubble比较了 : "+count + "次");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
