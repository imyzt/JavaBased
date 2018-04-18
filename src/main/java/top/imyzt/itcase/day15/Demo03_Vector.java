package top.imyzt.itcase.day15;

import java.util.Enumeration;
import java.util.Vector;

/** 
* @author 杨镇涛
* @date 2018年4月18日 下午2:37:06 
* @version 1.0 
* @Description List的另一个实现类 Vector,jdk1.2时并入List,实现list接口 
*/
@SuppressWarnings({ "rawtypes", "unchecked" })
public class Demo03_Vector {

	public static void main(String[] args) {
		
		/**
		 * 最原始的Vector添加元素,修改,删除元素
		 * 
		 * 实现List接口后方法进行了更新,和使用ArrayList基本无异.
		 */
		Vector v = new Vector();
		v.addElement("a");
		v.addElement("b");
		v.addElement("c");
		v.addElement("d");
		
		v.removeElement("a");
		
		v.setElementAt("e", 2);
		
		Enumeration it = v.elements();
		while (it.hasMoreElements()) {					//判断是否还有元素
			System.out.println(it.nextElement());		//获取元素并将指针后移
		}
	}
}
