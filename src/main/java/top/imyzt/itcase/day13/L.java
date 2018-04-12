package top.imyzt.itcase.day13;

public class L {

	public static void main(String[] args) {
		
		int len = 100;
		
		
		bubble(len);
		System.out.println();
		select(len);
		System.out.println();
		
		System.out.println(binarySearch(3));
		
	}

	private static int binarySearch(int value) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
		int min = 0, max = arr.length - 1, mid = (min + max) / 2;
		while (arr[mid] != value) {
			if (arr[mid] > value) {
				max = mid - 1;
				System.out.println(arr[mid] + "大了");
			}else if (arr[mid] < value) {
				System.out.println(arr[mid] + "小了");
				min = mid + 1;
			}
			mid = (min + max) / 2;
			
			if (min > max) {
				return -1;
			}
		}
		return value;
	}

	private static void select(int len) {
		int arr[] = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = (i + 1); j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	private static void bubble(int len) {
		int arr[] = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
