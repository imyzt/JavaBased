package top.imyzt.itcase.day05;

/**
 * 数组倒序
 * @author 01
 *
 */
public class ReverseArray {
	
	public static void main(String[] args) {
		//静态初始化 等同于int[] arr = new int[]{1,2,3,4,5,6,7,8,9,-1,2,34,-4,-5,-5};
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		reverse(arr);
		
		print(arr);
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			/*
			 * arr[0] = arr[arr.length - 1 - 0]
			 * arr[1] = arr[arr.length - 1 - 1]
			 * arr[2] = arr[arr.length - 1 - 2]
			 */
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
	}

}
