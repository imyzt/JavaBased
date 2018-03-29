package top.imyzt.itcase.day06;

/**
 * 成员变量和局部变量的区别
 * 
 * A:在类中的位置不同
 * 		成员变量在类中方法外
 * 		局部变量在方法内或形参中
 * B:在内存中位置不同
 * 		成员变量在堆中(成员变量属于对象,对象进堆内存)
 * 		局部变量在栈中(局部变量属于方法,方法进栈内存)
 * C:生命周期不同
 * 		成员变量随着对象的创建而存在,对象的消失而消失
 * 		局部变量随着方法的创建而存在,方法的消失而消失
 * D:初始化值不同
 * 		成员变量有默认初始化值
 * 		局部变量没有默认初始化值,必须定义,赋值才能使用
 * 
 * 注意事项:
 * 	*局部变量名称可以和成员变量名称相同,在方法使用的时候,采用就近原则
 * 	*基本数据类型变量包括 : byte,short,int,long,float,double,boolean,char
 * 	*引用数据类型变量包括: 数组,类,接口,枚举
 * @author imyzt
 *
 */
public class Variable {

	String name;  //成员变量,默认初始化为null,可以直接使用
	
	public void spack(int age) {	//age属于局部变量
		String sex = null;	//局部变量,默认不初始化,必须显式定义,赋值后才能使用
		
		System.out.println(sex);
	}
	
	public static void main(String[] args) {
		Variable v = new Variable();
		System.out.println(v.name + "f");
		v.spack(12);
	}
}
