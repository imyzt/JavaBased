package top.imyzt.itcase.day27.enums;


/**
 * 
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月23日 上午10:44:13 
 */
public class TestEnumColor {

	public static void main(String[] args) {

		//返回枚举的编号
		System.out.println(Color.RED.ordinal());

		//比较的是编号
		System.out.println(Color.RED.compareTo(Color.BLANK));

		//获取实例名称
		System.out.println(Color.RED.name());

		//获取实例名称
		System.out.println(Color.BLANK.toString());

		//通过字节码对象获取枚举项
		Season value = Season.valueOf(Season.class, "SPRING");
		System.out.println(value);
		
		//获取所有枚举项
		for (Color c : Color.values()) {
			System.out.print(c + "，");
		}

//		System.out.println(Season.SPRING.show());
	}

}
