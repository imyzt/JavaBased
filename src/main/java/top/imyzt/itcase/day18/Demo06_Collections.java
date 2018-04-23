package top.imyzt.itcase.day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 集合工具类
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年4月23日 下午9:31:52
 */
public class Demo06_Collections {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("e");
		list.add("d");
		list.add("c");
		
		//排序
		Collections.sort(list);
		System.out.println(list);
		
		//二分查找,必须是升序序列.如果不存在就返回  (-插入点)-1
		System.out.println(Collections.binarySearch(list, "c"));
		
		//根据默认排序获取最大值
		System.out.println(Collections.max(list));
		
		//翻转集合
		Collections.reverse(list);
		System.out.println(list);
		
		//随机置换
		Collections.shuffle(list);
		System.out.println(list);
	}
}
