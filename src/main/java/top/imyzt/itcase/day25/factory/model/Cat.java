package top.imyzt.itcase.day25.factory.model;
/**
 * 猫类
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月14日 下午5:03:36 
 */
public class Cat {

	private String name;

	public Cat() {
		super();
	}

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
}
