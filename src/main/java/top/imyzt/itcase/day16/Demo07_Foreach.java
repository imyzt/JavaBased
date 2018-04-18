package top.imyzt.itcase.day16;
/** 
* @author 杨镇涛
* @date 2018年4月18日 下午8:55:18 
* @version 1.0 
* @Description 增强for循环,底层依赖于迭代器实现 
*/
public class Demo07_Foreach {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		//依赖迭代器实现
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
