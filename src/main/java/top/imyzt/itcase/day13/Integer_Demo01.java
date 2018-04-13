package top.imyzt.itcase.day13;


/** 
* @author 杨镇涛
* @date 2018年4月13日 下午3:39:33 
* @version 1.0 
* @Description 
*/
public class Integer_Demo01 {
	
	public static void main(String[] args) {
		
		/*
		 * IntegerCache.low = -128
		 * IntegerCache.high = 127
		 * public static Integer valueOf(int i) {
		        if (i >= IntegerCache.low && i <= IntegerCache.high)
		            return IntegerCache.cache[i + (-IntegerCache.low)];
		        return new Integer(i);
	       }
	     *
	     *	Integer i1 = 127;
	     *	Integer i2 = 127;
	     *	i1和i2自动装箱,相当于Integer i1 = Integer.valueOf(127);
	     *	根据jdk底层定义:有一个IntegerCache.cache[255];数组存在于常量池
	     *	如果自动装箱的对象在-128~127之间,如123,就会返回IntegerCache.cache[123 + (--128)];即IntegerCache.cache[251]即123的常量池地址.
	     *	所以如果 初始化赋值Integer对象时如果在-128~127之间.就不会创建新对象
	     *
	     * -128~127是byte的取值范围,如果在这个取值范围之内,自动装箱就不会创建对象,而是从常量池中获取,如果超过了byte取值范围,就再创建对象
		 */
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1 == i2);			//true
		
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4);			//false
	}

}
