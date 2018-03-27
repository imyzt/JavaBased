package top.imyzt.itcase.day05;

/**
 * 查找数组中的元素
 * @author 01
 *
 */
public class FindArray {
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,67,7};
		
		System.out.println(findArr(arr, 2));
	}

	private static int findArr(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}

}
