package top.imyzt.itcase.day23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 
 * 约瑟夫环
 * 
 * 约瑟夫环（约瑟夫问题）是一个数学的应用问题：已知n个人（以编号1，2，3...n分别表示）围坐在一张圆桌周围。
 * 从编号为k的人开始报数，数到m的那个人出列；他的下一个人又从1开始报数，数到m的那个人又出列；依此规律重复下去，直到圆桌周围的人全部出列。
 * 通常解决这类问题时我们把编号从0~n-1，最后 [1]  结果+1即为原问题的解。
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月9日 上午10:43:47 
*/
public class Demo04_JosephProblem {

public static void main(String[] args) {
	
	List<String> person = new ArrayList<>();
	person.add("张一");
	person.add("张二");
	person.add("张三");
	person.add("张四");
	person.add("张五");
	person.add("张六");
	person.add("张七");
	person.add("张八");

	System.out.println(josephProblem(person, 4, 6) + "活了下来");
	
}

/**
 * 约瑟夫环
 * 一群人(person)围在一起坐成环状(N), 从某个编号开始报数(如:k),数到某个数(m)的时候,此人出列,下一个重新报数,一直循环到只有最后一个人,约瑟夫结束
 * 
 * @author:imyzt
 * @date:2018年5月9日上午11:26:16
 * @param person	集合
 * @param k 起点种子
 * @param m 计数器数
 * @return
 */
public static String josephProblem(List<String> person, int k, int m) {
	//输入的是正常计数从1开始的,在集合中是从0开始的,故需要将 k-1 
	k -= 1;
	//count 用于数数
	int count = 1;	
	//一直执行到 人数 为 1 时,停止执行
	for (int i = k; person.size() != 1; i++) {
		
		if (i == person.size()) {
			i = 0;
		}

		//每当数到  m 时,当前人出列
		if (count == m) {
			person.remove(i --);		//杀掉之后,需要将后面的前移一位,故 --
			count = 0;
		}
		//计数器继续执行
		count ++;
	}
	return person.get(0);
}

}
