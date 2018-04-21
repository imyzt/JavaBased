package top.imyzt.itcase.day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/** 
* @author 杨镇涛
* @date 2018年4月21日 上午11:35:36 
* @version 1.0 
* @Description 
* 
* 定义一个List集合,存储无序重复字符串
* 定义方法对其排序并保留重复 
*/
public class Demo04_TreeSetCase {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("zz");
		list.add("aa");
		list.add("b");
		list.add("cc");
		list.add("de");
		list.add("dwee");
		list.add("dae");
		list.add("aa");
		
		System.out.println(list);
		sort(list);
		System.out.println(list);
	}

	private static void sort(List<String> list) {
		//通过匿名内部类定义比较器
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				//比较s1和s2.对其进行排序
				int num = s1.compareTo(s2);
				//如果相等,就返回一个正数.避免返回0之后TreeSet不存储
				return num == 0 ? 1 : num;
			}
		});
		
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}
}
