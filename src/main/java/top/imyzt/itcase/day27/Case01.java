package top.imyzt.itcase.day27;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 通过反射越过泛型类型检查 
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月22日 下午3:08:10 
 */
public class Case01 {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		
		Class<? extends ArrayList> clazz = list.getClass();
		Method add = clazz.getMethod("add", Object.class);
		add.invoke(list, "杨镇涛");
		
		System.out.println(list);
	}

}
