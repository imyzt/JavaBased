package top.imyzt.itcase.day18;

import java.util.LinkedHashMap;

/** 
* @author 杨镇涛
* @date 2018年4月21日 下午4:49:10 
* @version 1.0 
* @Description LinkedHashMap 可以保证怎么存,怎么取,key不可重复
*/
public class Demo02_LinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("name", "张三");
		map.put("age", 20);
		map.put("address", "长沙");
		
		System.out.println(map);
	}

}
