package top.imyzt.itcase.day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author 杨镇涛
 * @date 2018年4月21日 下午3:31:34
 * @version 1.0
 * @Description 单列集合基于双列集合实现,单列集合是将双列集合的第二列(value)填充掉.
 * HashMap是双列集合,可以存储null键和null值
 * 线程不安全,效率高
 */
public class Demo01_HashMap {
	public static void main(String[] args) {
		case01();
//		itorater01();
//		iterator02();

		
		
	}

	/**
	 * 使用Map的内部接口Entry,将Map包装成Set集合返回迭代
	 */
	private static void iterator02() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "张三");
		map.put("age", 20);
		map.put("address", "长沙");
		
		//Map.Entry<>是Map的内部接口,将键和值封装成Entry对象,并存放在Set集合中
		Set<Map.Entry<String, Object>> entrySet = map.entrySet();
		//对存放了Entry对象的Set集合进行迭代
		Iterator<Entry<String, Object>> it = entrySet.iterator();
		while (it.hasNext()) {
			Entry<String, Object> en = it.next();
			System.out.println(en.getKey() + ": " + en.getValue());
		}
		
		System.out.println(" ------------------简写方式-------------------");
		
		for (Entry<String, Object> en : map.entrySet()) {
			System.out.println(en.getKey() + ": " + en.getValue());
		}
	}

	/**
	 * 通过Map的keySet()获取所有的键,迭代Map集合
	 */
	private static void itorater01() {
		Map<String, Object> map = new HashMap<>();
		map.put("name", "张三");
		map.put("age", 20);
		map.put("address", "长沙");
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + ": " + map.get(key));
		}
		
		System.out.println(" ------------------简写方式-------------------");
		
		for (String s : map.keySet()) {
			System.out.println(s + ": " + map.get(s));
		}
	}

	/**
	 * Map的基础功能
	 */
	private static void case01() {
		Map<String, Object> map = new HashMap<>();
		Object i = map.put("name", "张三");
		map.put("age", 20);
		map.put("address", "长沙");
		
		Object put = map.put("address", "湘潭");

		/*
		 * 相同的键不存储,值覆盖.put()方法返回被覆盖的值
		 */
		System.out.println(i);		//null
		System.out.println(put); //长沙
		
		//remove()方法根据key删除值,返回被删除的值
		Object remove = map.remove("address");
		System.out.println(remove);		//湘潭
		
		//containsKey()返回是否包含这个key
		System.out.println(map.containsKey("name"));	//true

		//containsValue()返回是否包含这个value
		System.out.println(map.containsValue(20));		//true
		
		//获取所有的key
		System.out.println(map.keySet());
		
		//values()得到所有的值
		Collection<Object> values = map.values();
		System.out.println(values);		//[张三, 20]
		
		//size()返回大小,成对出现
		System.out.println(map.size());		//2
	}
}
