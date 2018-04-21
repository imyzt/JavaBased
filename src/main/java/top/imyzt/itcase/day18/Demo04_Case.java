package top.imyzt.itcase.day18;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/** 
* @author 杨镇涛
* @date 2018年4月21日 下午5:10:47 
* @version 1.0 
* @Description 输入一串字符串,统计每一个字符出现的次数
*/
public class Demo04_Case {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		HashMap<Character, Integer> map = new HashMap<>();
		
		if (null != input && !"".equals(input)) {
			char[] charArray = input.toCharArray();
			
			
			for (char c : charArray) {
				map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
			}
			
		}
		for (Entry<Character, Integer> en : map.entrySet()) {
			System.out.println(en.getKey() + "= " + en.getValue());
		}
		in.close();
	}

}
