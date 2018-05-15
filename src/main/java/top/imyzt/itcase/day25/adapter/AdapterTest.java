package top.imyzt.itcase.day25.adapter;

/**
 * 适配器设计模式
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月15日 上午9:31:16 
 */
public class AdapterTest {

	public static void main(String[] args) {
		
		PersonAdapter hehe = new PersonAdapter() {
			@Override
			public void coding() {
				System.out.println("呵呵写hehhehe");
			}
		};
		hehe.coding();
	}
	
}
