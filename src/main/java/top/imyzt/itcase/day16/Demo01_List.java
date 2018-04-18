package top.imyzt.itcase.day16;

import java.util.LinkedList;

/** 
* @author 杨镇涛
* @date 2018年4月18日 下午4:17:44 
* @version 1.0 
* @Description List的有一个子类,基于链表实现的非线程安全的LinkedList,效率高.查询和修改慢,增删快
*/
public class Demo01_List {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("b");
		list.addFirst("a");
		list.addLast("c");
		list.addLast("d");
		list.addLast("e");

		//取第一个元素
		System.out.println(list.getFirst());
		
		//删除指定元素,基于equals方法实现,对象需要重写equals
		list.remove("c");
		list.removeFirst();//删除第一个
		list.remove(1);//删除指定索引元素
		list.removeLast();//删除最后一个
		//判断是否包含某元素,基于equals方法实现,对象需要重写equals
		System.out.println(list.contains("a"));
		
		System.out.println(list);
	}

}
