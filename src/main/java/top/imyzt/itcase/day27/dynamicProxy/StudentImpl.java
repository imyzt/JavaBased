package top.imyzt.itcase.day27.dynamicProxy;
/**
 * Student的实现类
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月23日 上午9:10:50 
 */
public class StudentImpl implements IStudent {

	@Override
	public void login() {
		System.out.println("登录");
	}

}
