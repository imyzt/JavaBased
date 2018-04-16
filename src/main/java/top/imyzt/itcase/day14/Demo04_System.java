package top.imyzt.itcase.day14;
/** 
* @author 杨镇涛
* @date 2018年4月16日 下午8:31:23 
* @version 1.0 
* @Description System类学习 
*/
public class Demo04_System {

	public static void main(String[] args) {
		
		new Demo();
		System.gc();		//通知gc垃圾回收
		
		int[] src = {2,3,4,5};
		int[] dest = new int[src.length];
		System.arraycopy(src, 0, dest, 0, src.length);   //源数组,源数组起始位置,目标数组,目标数组起始位置,拷贝长度
		for (int i = 0; i < dest.length; i++) {
			System.out.print(dest[i]);
		}
		
		
		System.exit(0);		//使jvm退出运行
	}
}
class Demo{
	@Override
	protected void finalize(){
		System.out.println("垃圾被回收了");
	}
}
