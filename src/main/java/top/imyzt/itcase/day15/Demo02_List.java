package top.imyzt.itcase.day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/** 
* @author 杨镇涛
* @date 2018年4月17日 下午4:56:12 
* @version 1.0 
* @Description Collection的子类 List类 
*/
@SuppressWarnings({ "unchecked", "rawtypes" })
public class Demo02_List {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add("w");
		
		/*
		 * list.remove(Object o)
		 * 如果需要删除集合中元素内容为 1 的元素,而不是索引为1的元素,需要手动装箱new Integer(内容);
		 * list.remove(int index)
		 * 只需传入索引就可以删除指定索引的元素
		 */
		list.remove(new Integer(1));
		System.out.println(list);
		
		
		list.set(1, 11);		//修改指定索引元素的内容
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			if ("w".equals(list.get(i))) {
				list.add("for");
			}
		}
		System.out.println(list);
		
		ListIterator lit = list.listIterator();
		while (lit.hasNext()) {				//判断是否有下一个元素
			if ("w".equals(lit.next())) {	//lit.next()获取元素并将指针后移一位
				//list.add("www");			//如果迭代的同时修改元素,就会出现并发修改异常ConcurrentModificationException
				lit.add("lit");				//使用迭代器自己的添加方法可以避免出现并发修改异常
			}		
		}
		System.out.println(list);
		
		//直接运行lit.hasPrevious(),并没有在之前运行lit.hasNext()方法,指针默认是指在 0 的,没有上一位元素,所以并不会打印任何内容
		while (lit.hasPrevious()) {			//判断是否有上一个元素
			System.out.print(lit.previous() + " ");		//获取元素并将指针向前移动一位
		}
	}
}
