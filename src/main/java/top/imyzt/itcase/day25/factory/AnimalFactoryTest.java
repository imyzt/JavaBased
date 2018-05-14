package top.imyzt.itcase.day25.factory;

import top.imyzt.itcase.day25.factory.model.Cat;
import top.imyzt.itcase.day25.factory.model.Dog;

/**
 * 通过多方法工厂模式设计工厂模式
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月14日 下午5:08:57 
 */
public class AnimalFactoryTest {

	public static void main(String[] args) {
		
		Cat cat = AnimalFactory.createCat("小白");
		System.out.println(cat.toString());
		
		Dog dog = AnimalFactory.createDog("旺财");
		System.out.println(dog);
		
		
		Cat emptyCat = AnimalFactory.createCat();
		emptyCat.setName("大白");
		System.out.println(emptyCat);
		
		Dog emptyDog = AnimalFactory.createDog();
		emptyDog.setName("大黄");
		System.out.println(emptyDog);
	}

}
