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
			System.out.println("索引" + binarySearch(arr, num));
			System.out.println("----------------------");
		}
		
	}
	
	private static int binarySearch(int[] arr, int value) {
		//设定最大值(数组的最大索引),最小值(数组的最小索引),和中间值
		int max = arr.length - 1, min = 0, mid = 0;
		
		//只要最小索引不大于最大索引
		while (min <= max) {
			//中间值=最大索引和最小索引的中间值
			mid = (max + min) / 2;
			
			if (arr[mid] == value) {			//如果中间值 等于 value,直接返回
				return mid;	
			}else if (arr[mid] > value) {		//如果中间值 大于 value
				max = mid - 1;					//将最大索引下调到 中间索引 - 1
			}else {								//如果中间值 小于 value
				min = mid + 1;					//将最小索引上调到 中间索引 + 1
			}
		}
		return -1;								//未找到
	}
}
