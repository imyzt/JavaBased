package top.imyzt.itcase.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/** 
* @author 杨镇涛
* @date 2018年4月17日 上午11:10:26 
* @version 1.0 
* @Description 集合最顶级 Collection学习
*/
@SuppressWarnings({ "unchecked", "rawtypes" })
public class Demo01_Collection {

	public static void main(String[] args) {

		//迭代器
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		Iterator it = c1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
//		collectionAll();
		
//		collection();
		
	}

	private static void collectionAll() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("d");
		
//		list1.addAll(list2);
		System.out.println(c1);
		
		c1.removeAll(c2);		//删除两个的交集部分
		System.out.println(c1);
		
		boolean bool = c1.containsAll(c2);		//判断是否包含c2
		System.out.println(bool);
		
		/*
		 * 取交集 将结果赋值给this,如果发生了改变就返回true,如果没发生改变就返回false
		 * 发生改变: c1 != c1+c2的交集,取出交集赋值给c1,然后c1就发生了改变,返回true
		 * 不发生改变: c1 == c1+c2的交集,取出交集赋值给c1,c1还是没有改变.返回false
		 * 
		 */
		System.out.println(c1.retainAll(c2));
	}

	private static void collection() {
		Collection list = new ArrayList();
		
		list.add("123");
		list.add(123);
		list.add("list");
		System.out.println(list.toString());
		
		System.out.println(list.size());
		
		list.remove("123");
		System.out.println(list.toString());
		
		System.out.println(list.contains(123));
		
		list.clear();
		System.out.println(list);
		
		System.out.println(list.isEmpty());		//判断是否为空
	}
}
