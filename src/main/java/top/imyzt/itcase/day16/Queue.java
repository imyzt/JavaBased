package top.imyzt.itcase.day16;
/** 
* @author 杨镇涛
* @date 2018年4月18日 下午5:19:28 
* @version 1.0 
* @Description 模拟队列,先进先出 
*/

import java.util.LinkedList;

public class Queue<T> {

	private LinkedList<T> list = new LinkedList<T>();

	/**
	 * 向队列中添加元素
	 * @param e
	 */
	public void in(T e) {
		list.addLast(e);
	}
	
	/**
	 * 从队列中移除元素
	 * @throws Exception
	 */
	public void out() throws Exception {
		if (list.size() <= 0) {
			throw new Exception("队列溢出");
		}
		list.removeFirst();
	}
	
	/**
	 * 判断队列是否为空
	 * @return
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return "Queue=" + list;
	}
	
}

