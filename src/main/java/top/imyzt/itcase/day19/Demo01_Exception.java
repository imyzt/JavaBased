package top.imyzt.itcase.day19;
/** 
* @author 杨镇涛
* @date 2018年4月24日 下午3:23:28 
* @version 1.0 
* @Description 
*/
public class Demo01_Exception {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		try {
			System.out.println(arr[10]);
		} catch (ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e) {
			System.out.println(e.getMessage());	//打印报错信息
			System.out.println(e);  //jvm主动调用toString()方法
			e.printStackTrace(); 	//jvm默认调用的方法
			return;
		}finally {
			//try或catch里面有return;语句都不能停止finally
			System.out.println("finally不管try或catch被执行都会被执行。除了System.exit(0)能阻止");
		}
		
		//可以选择抛出给main函数,main抛给jvm,也可以选择捕获
		try {
			throwException(arr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//运行时异常在运行时抛出,不需要捕获
		throwRuntimeException(arr);
	}
	
	/**
	 * 抛出编译时异常
	 * @param arr
	 * @throws Exception 
	 */
	private static void throwException(int[] arr) throws Exception {
		if (arr[1] != 45) {
			throw new Exception("异常");
		}
	}
	
	/**
	 * 抛出运行时异常
	 * @param arr
	 * @throws Exception
	 */
	private static void throwRuntimeException(int[] arr) {
		if (arr[1] != 45) {
			throw new RuntimeException("数字格式异常");
		}
	}

}
