package top.imyzt.itcase.day16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 
* @author 杨镇涛
* @date 2018年4月19日 下午2:07:05 
* @version 1.0 
* @Description 集合的遍历修改三种方法 
*/
public class Demo08_IteratorEdit {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		
//		method01(list);
//		method02(list);
//		method03(list);
		
		
		//增强for循环不能用于迭代器修改,因为指针不能像普通for循环一样回移
		/*for (String s : list) {
			if ("b".equals(s)) {
				list.remove("b");
			}
		}*/
	}

	/**
	 * 迭代器配合for循环修改元素
	 * it.next()负责方法继续执行(i++)
	 * @param list
	 */
	private static void method03(List<String> list) {
		for (Iterator<String> it = list.iterator(); it.hasNext();) {
			if ("b".equals(it.next())) {
				it.remove();
			}
		}
		System.out.println(list);
	}

	/**
	 * 使用迭代器修改元素
	 * 如果匹配到条件,使用迭代器自己的方法移除当前元素
	 * @param list
	 */
	private static void method02(List<String> list) {
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			if ("b".equals(it.next())) {
				//list.remove("b");			//不能使用list的移除方法,因为list.iterator()方法已经通知迭代器循环指定次数.移除元素后出现并发修改异常
				it.remove();
			}
			
		}
		System.out.println(list);
	}

	/**
	 * 普通for循环修改
	 * 如果匹配到条件,删除了之后,将指针 i 向前移动一位
	 * @param list
	 */
	private static void method01(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if ("b".equals(list.get(i))) {
				list.remove(i--);			//如果条件满足,移除掉元素之后将指针向前移动
			}
		}
		System.out.println(list);
	}

}
