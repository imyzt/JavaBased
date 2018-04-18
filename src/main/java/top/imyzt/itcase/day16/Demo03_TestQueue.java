package top.imyzt.itcase.day16;
/** 
* @author 杨镇涛
* @date 2018年4月18日 下午5:23:26 
* @version 1.0 
* @Description 
*/
public class Demo03_TestQueue {

	public static void main(String[] args) throws Exception {
		
		Queue<String> queue = new Queue<String>();
		
		queue.in("a");
		queue.in("b");
		queue.in("e");
		queue.in("c");
		queue.in("d");
		queue.in("f");
		queue.in("g");
		
		System.out.println(queue);
		
		while (!queue.isEmpty()) {
			queue.out();
		}
		
		System.out.println(queue);

	}
}
