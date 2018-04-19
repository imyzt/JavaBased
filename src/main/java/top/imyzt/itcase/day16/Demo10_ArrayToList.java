package top.imyzt.itcase.day16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 
* @author 杨镇涛
* @date 2018年4月19日 下午2:42:55 
* @version 1.0 
* @Description 数组和集合的互相转换 
*/
public class Demo10_ArrayToList {

	public static void main(String[] args) {
		
//		arrayToList();
		
		listToArray01();
	}

	private static void listToArray01() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		
		String[] arr = list.toArray(new String[11]);
		arr[1] = "fa";
		for (String s : arr) {
			System.out.print(s + " ");
		}
	}

	private static void arrayToList() {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		List<int[]> list = Arrays.asList(arr);		//基本数据类型数组转换成list时,会变成一个对象.
		System.out.println(list); 		//[[I@26f0a63f],arr的地址值
		for (int[] is : list) {
			for (int i : is) {
				System.out.println(i);
			}
		}
		
		//list.remove(2);		//会抛出UnsupportedOperationException不能修改异常
	}
}
