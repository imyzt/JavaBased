package top.imyzt.itcase.day16;
/** 
* @author 杨镇涛
* @date 2018年4月18日 下午5:06:08 
* @version 1.0 
* @Description  
*/
public class Demo02_TestStack {

	public static void main(String[] args) throws Exception {
		
		Stack<String> stack = new Stack<String>();
		stack.in("a");
		stack.in("b");
		stack.in("c");
		stack.in("d");
		stack.in("e");
		stack.in("f");
		stack.in("g");
		
		System.out.println(stack);
	
		while (!stack.isEmpty()) {
			stack.out();
		}
		
		System.out.println(stack);
	}
}
