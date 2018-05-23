package top.imyzt.itcase.day27.enums;
/**
 * 颜色的枚举类
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月23日 上午10:43:11 
 */
public enum Color {

	RED, GREEN, BLANK;
	
	@Override
	public String toString() {
		String id = name();
		String lower = id.substring(1).toLowerCase();
		return id.charAt(0) + lower;
	}
}
