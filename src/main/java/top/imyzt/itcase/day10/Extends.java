package top.imyzt.itcase.day10;
/** 
* @author : 杨镇涛
* @date 创建时间：2018年4月10日 下午2:34:07 
* @version 1.0 
* @since  
* @return  
*/
public class Extends {

	
}
class Person01{
	
}
class Student extends Person01{
	
}
interface Father{
	Person01 say();
}
class Son implements Father{
	
	/*
	 * 子类重写父类方法时返回值属于父类返回值的子类或自己即可(non-Javadoc)
	 * 
	 * 即 zi instanceof fu 即可
	 * @see top.imyzt.itcase.day10.Father#say()
	 */
	public Student say(){
		return new Student();
	}
}
