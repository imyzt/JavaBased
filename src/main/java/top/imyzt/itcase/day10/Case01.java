package top.imyzt.itcase.day10;
/** 
 * 
* @ClassName: Case01 
* @Description: 
* 
* 	匿名内部类面试题
* 
* @author 杨镇涛
* @date 2018年4月10日 上午11:36:14 
*
 */
public class Case01 {
	public static void main(String[] args) {
		Outer.method().show();
	}
}
interface Inter{
	void show();
}
class Outer{
	public static Inter method() {
		return new Inter() {
			public void show() {
				System.out.println("hello world");
			}
		};
	}
}
