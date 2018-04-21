package top.imyzt.itcase.day17;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/** 
* @author 杨镇涛
* @date 2018年4月21日 上午11:44:38 
* @version 1.0 
* @Description 
*/
public class Demo05_TreeSetCase {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				//i2.compareTo(i1),降序
				int num = i2.compareTo(i1);
				return num == 0 ? 1 : num;
			}
		});
		String input = "";
		while (true) {
			input = in.next();
			if ("quit".equals(input)) {
				break;
			}
			Integer i = Integer.valueOf(input);
			ts.add(i);
		}
		
		System.out.println(ts);
		in.close();
	}
}
