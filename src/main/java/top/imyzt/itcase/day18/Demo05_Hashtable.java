package top.imyzt.itcase.day18;

import java.util.Hashtable;

/** 
* @author 杨镇涛
* @date 2018年4月23日 下午3:08:05 
* @version 1.0 
* @Description 
* Hashtable,jdk1.0时出现,基本已废弃.
* Hashtable是线程安全的,效率低
* Hashtable和TreeMap一样,无法存储null值和null键
*/
public class Demo05_Hashtable {

	public static void main(String[] args) {
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("a", 20);
		ht.put("b", 30);
//		ht.put(null, 20);java.lang.NullPointerException Hashtable无法存放null值和null键
		System.out.println(ht);
	}

}
