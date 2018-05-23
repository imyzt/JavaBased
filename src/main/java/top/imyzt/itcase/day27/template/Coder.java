package top.imyzt.itcase.day27.template;
/**
 * 
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月23日 上午9:55:09 
 */
public abstract class Coder {
	
	protected abstract void code();

	public final String time() {
		long start = System.currentTimeMillis();
		
		code();
		
		long end = System.currentTimeMillis();
		return (end - start) + "ms";
	}
}
class Student extends Coder{

	@Override
	protected void code() {
		for (int i = 0; i < 1033000; i++) {
			System.out.println(i);
		}
	}
	
}