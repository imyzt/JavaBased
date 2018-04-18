package top.imyzt.itcase.day16;
/** 
* @author 杨镇涛
* @date 2018年4月18日 下午8:07:08 
* @version 1.0 
* @Description 方法泛型 
*/
public class Demo04_MethodGeneric {

	public static void main(String[] args) {
		
		Tool<String> t = new Tool<>();
		t.print("print");
		Tool.show("show");
	}
}
class Tool<T>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public<E> void print(E e) {
		System.out.println(e);		//方法泛型最好与类一致,如果不一致需在方法上声明该泛型
	}
	
	public static<E> void show(E e) {
		System.out.println(e);		//静态方法必须声明自己的泛型,因为静态方法在类创建之前(类创建泛型才生效)就已经存在
	}
}
