package top.imyzt.itcase.day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/** 
* @author 杨镇涛
* @date 2018年4月24日 上午10:38:00 
* @version 1.0 
* @Description 
*/
public class Poker {

	public static void main(String[] args) {
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[] color = {"黑桃", "红桃", "梅花", "方块"};
		HashMap<Integer, String> map = new HashMap<>();
		List<Integer> poker = new ArrayList<>();
		TreeSet<Integer> dipai = new TreeSet<>();
		TreeSet<Integer> left = new TreeSet<>();
		TreeSet<Integer> right = new TreeSet<>();
		TreeSet<Integer> me = new TreeSet<>();
		
		maipai(num, color, map, poker);
		
		for (int i = 0; i < 2; i++) {
			xipai(poker);
			
			for (int j = 0; j < poker.size(); j++) {
				System.out.print(map.get(poker.get(j)) + " ");
			}
			
			fapai(poker, dipai, left, right, me);
			
			
			lookPoker(map, left, "李四");
			lookPoker(map, right, "张三");
			lookPoker(map, me, "我");
			
			
			
			System.out.println("-----------------------------------------");
		}
		
	}



	private static void maipai(String[] num, String[] color, HashMap<Integer, String> map, List<Integer> poker) {
		int index = 1;
		for (String n : num) {
			for (String c : color) {
				map.put(index, c.concat(n));
				poker.add(index++);
			}
		}
		map.put(index, "小王");
		poker.add(index++);
		map.put(index, "大王");
		poker.add(index++);
	}



	private static void fapai(List<Integer> poker, TreeSet<Integer> dipai, TreeSet<Integer> left,
			TreeSet<Integer> right, TreeSet<Integer> me) {
		dipai.clear();
		left.clear();
		right.clear();
		me.clear();
		//发牌
		for (int i = 0; i < poker.size(); i++) {
			if (i >= poker.size() - 3) {
				dipai.add(poker.get(i));
			}else if (i % 3 == 0) {
				left.add(poker.get(i));
			}else if (i % 3 == 1) {
				right.add(poker.get(i));
			}else {
				me.add(poker.get(i));
			}
		}
	}



	private static void xipai(List<Integer> poker) {
		//洗牌
		Collections.shuffle(poker);
	}
	
	
	
	private static void lookPoker(HashMap<Integer, String> map, TreeSet<Integer> poker, String name) {
		System.out.print(name + "的牌是:");
		for (Integer i : poker) {
			System.out.print(map.get(i) + " ");
		}
		System.out.println();
	}

}
