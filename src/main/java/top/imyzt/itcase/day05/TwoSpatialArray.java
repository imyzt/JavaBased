package top.imyzt.itcase.day05;

/**
 * 二维数组的初始化,读取
 * @author 01
 *
 */
public class TwoSpatialArray {

	public static void main(String[] args) {
		
		//二维数组的各种初始化方法
		int[] arr[] = new int[22][21];
		int[][] arr1 = new int[1][1];
		int[][] arr2 = new int[2][];
		int[][] arr3 = {{1,2,3,4,5,2},{2,3,4,45,3}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10000);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("sum=" + sumArray(arr));
	}

	/**
	 * 二维数组求和
	 * @param arr
	 * @return
	 */
	private static int sumArray(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
	
	
	
	
}
