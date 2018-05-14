package top.imyzt.itcase.day25.factory.model;
/**
 * 狗类
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月14日 下午5:05:03 
 */
public class Dog {

	private String name;

	public Dog() {
		super();
	}

	public Dog(String name) {
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
		return "Dog [name=" + name + "]";
	}
}
