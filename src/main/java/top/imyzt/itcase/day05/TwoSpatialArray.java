package top.imyzt.itcase.day05;

/**
 * ��ά����ĳ�ʼ��,��ȡ
 * @author 01
 *
 */
public class TwoSpatialArray {

	public static void main(String[] args) {
		
		//��ά����ĸ��ֳ�ʼ������
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
	 * ��ά�������
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
