package top.imyzt.itcase.day17;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/** 
* @author 杨镇涛
* @date 2018年4月20日 上午9:29:02 
* @version 1.0 
* @Description 使用LinkedHashSet去重
* LinkedHashSet是基于链表实现的,所以是能够保证怎么存就怎么取的.LinkedHashSet继承了HashSet,可以保证元素不重复
*/
public class Demo02_LinkedHashSet {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
		System.out.println(list);
		toHeavy(list);
		System.out.println(list);
	}

	/**
	 * 使用LinkedHashSet去重
	 * @param list 需要去重的集合
	 */
	private static void toHeavy(List<String> list) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		//去重
		set.addAll(list);
		//清空list
		list.clear();
		//将set添加到list
		list.addAll(set);
	}

}
