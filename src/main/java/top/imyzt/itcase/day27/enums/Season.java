package top.imyzt.itcase.day27.enums;
/**
 * 
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月23日 上午11:39:17 
 */
public enum Season {

	SPRING("春天"){
		@Override
		public String show() {
			return super.getName();
		}
	}, SUMMER("夏天"){
		@Override
		public String show() {
			return super.getName();
		}
	}, AUTUMN("秋天"){
		@Override
		public String show() {
			return super.getName();
		}
	}, WINTER("冬天"){
		@Override
		public String show() {
			return super.getName();
		}
	};
	
	private String name;
	
	private Season(String name) {
		this.name = name;
	}

	public abstract String show();
	
	protected String getName() {
		return name;
	}
}
