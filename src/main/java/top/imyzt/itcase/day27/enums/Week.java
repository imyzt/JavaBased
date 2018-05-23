package top.imyzt.itcase.day27.enums;
/**
 * 星期的枚举 
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月23日 上午11:33:40 
 */
public enum Week {

	MON("星期一"), TUE("星期二"), WED("星期三");
	
	private String name;

	private Week(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name();
	}
	
	public String getName() {
		return name;
	}
}
