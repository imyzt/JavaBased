package top.imyzt.itcase.day16;
/** 
* @author 杨镇涛
* @date 2018年4月18日 下午5:02:01 
* @version 1.0 
* @Description 模拟栈结构 先进后出
*/

import java.util.LinkedList;

public class Stack<T> {

	private LinkedList<T> list = new LinkedList<T>();
	
	/**
	 * 向栈中添加内容
	 * @param e
	 */
	public void in(T e) {
		list.addLast(e);
	}
	
	/**
	 * 从栈中移除
	 * @throws Exception 
	 */
	public void out() throws Exception {
		if (list.size() <= 0) {
			throw new Exception("栈溢出");
		}
		list.removeLast();
	}
	
	/**
	 * 判断栈是否为空
	 * @return
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Stack=" + list;
	}
}
