package top.imyzt.itcase.day25.factory;
/**
 *
 * 多方法工厂模式,模仿 Executors 工厂的做法
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月14日 下午3:55:59 
 */

import top.imyzt.itcase.day25.factory.model.Cat;
import top.imyzt.itcase.day25.factory.model.Dog;

public class AnimalFactory {

	/**
	 * 创建一个猫
	 * @author:imyzt
	 * @date:2018年5月14日下午5:07:11
	 * @param catName 猫的名字
	 * @return
	 */
	public static Cat createCat(String catName) {
		return new Cat(catName);
	}
	
	public static Cat createCat() {
		return new Cat();
	}
	
	
	/**
	 * 创建一个狗
	 * @author:imyzt
	 * @date:2018年5月14日下午5:07:22
	 * @param dogName 狗的名字
	 * @return
	 */
	public static Dog createDog(String dogName) {
		return new Dog(dogName);
	}
	
	public static Dog createDog() {
		return new Dog();
	}
}