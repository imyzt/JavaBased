package top.imyzt.itcase.day14;
/** 
* @author 杨镇涛
* @date 2018年4月16日 下午8:01:48 
* @version 1.0 
* @Description  Math类学习
*/
public class Demo01_Math {
	
	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		System.out.println(Math.abs(-12));	//取绝对值
		System.out.println(Math.ceil(12.3)); //向上取整
		System.out.println(Math.floor(12.3));	//向下取整
		System.out.println(Math.max(12, 20));  //比较大小
		System.out.println(Math.pow(2, 3));  //2^3
		System.out.println(Math.random());	//生成 [0-1) 之间的随机数
		System.out.println(Math.round(3.49f));	//四舍五入
		System.out.println(Math.sqrt(9));	//开平方
		
	}

}
