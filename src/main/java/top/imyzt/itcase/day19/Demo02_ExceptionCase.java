package top.imyzt.itcase.day19;
/**
 * 异常的面试题
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年4月24日 下午4:31:54
 */
public class Demo02_ExceptionCase {

	public static void main(String[] args) {
		/*
		 * final,finally,finalize区别
		 * final 
		 * 		用于修饰类,类不能被继承
		 * 		用于修饰方法,不能被重写
		 * 		用于修饰变量,只能赋值一次
		 * finally
		 * 		try,catch语句中的一个语句体,不能单独使用.用于释放资源
		 * finalize
		 * 		是一个方法,当垃圾回收器确定不存在对该对象的更多引用时,有对象的垃圾回收器调用此方法.
		 */
		
		
		System.out.println(finallyTest());
	}
	
	private static int finallyTest() {
		int i = 10;
		try {
			System.out.println(i / 0);
			i = 20;
			return i;
		} catch (Exception e) {
			i = 30;
			e.printStackTrace();
			return i;		//当执行到return i;时已经建立好返回路径了.i的值已经固定.finally修改对return的i的值没有影响
		} finally {
			i = 40;
		}
	}

}
