package top.imyzt.itcase.day16;
/** 
* @author 杨镇涛
* @date 2018年4月18日 下午8:19:51 
* @version 1.0 
* @Description  接口泛型,接口可以自己继续定义泛型,也可以具体指定类型
*/
public class Demo05_InterfaceGeneric {

	public static void main(String[] args) {
		
	}
}
interface Inter<T>{
	public <E> void show(E e); 
}
/*在实现接口的时候可以指定具体的类型,推荐*/
class Student implements Inter<String>{

	@Override
	public <String> void show(String s) {
	}
}
/*在实现接口的时候可以继续指定自己的泛型*/
class Worker<T> implements Inter<T>{

	@Override
	public<E> void show(E e) {
	}
}