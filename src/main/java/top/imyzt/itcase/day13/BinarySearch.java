package top.imyzt.itcase.day13;

import java.util.Scanner;

/** 
* @author 杨镇涛
* @date 2018年4月12日 下午2:20:08 
* @version 1.0 
* @Description 
*/
public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
		
		Scanner input = new Scanner(System.in);
		while (true) {
			int num = input.nextInt();
			System.out.println(biary(arr, num));
			System.out.println("----------------------");
		}
		
	}

	
	
	private static int biary(int[] arr, int num) {
		
		int max = arr[arr.length - 1], min = arr[0], mid = (max + min) / 2;
		
		while (min <= max) {
			
			
			
		}
		
		return mid;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static int binarySearch(int[] arr, int value) {
		int min = arr[0], max = arr[arr.length - 1], mid = (max + min) / 2;
		
		while (arr[mid] != value) {		//如果传入的值和中间值不相等的情况
			
			if (arr[mid] > value) {		
				max = mid - 1;			//中间值大于传入的值,说明传入的值在[min,mid-1]之间,故将max下降为mid-1
				System.out.println(arr[mid] + "大了");
			}else if (arr[mid] < value) {
				min = mid + 1;			//中间值小于传入的值,说明传入的值在[mid+1,max]之间,故将min上调为mid+1
				System.out.println(arr[mid] + "小了");
			}
			
			mid = (max + min) / 2;		//不管是大于还是小于,最后都需要将中间值移动到两个最值中间
			
			if (min > max) {
				return -1;
			}
		}
		
		return mid;
	}
}
