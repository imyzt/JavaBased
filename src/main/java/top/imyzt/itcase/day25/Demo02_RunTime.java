package top.imyzt.itcase.day25;

import java.io.IOException;
import java.util.Random;

/**
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月10日 下午4:06:42 
*/
public class Demo02_RunTime {

	public static void main(String[] args) throws IOException {

System.out.println(System.getProperty("file.encoding"));
/*
 * new Random().nextInt((max - min) + 1) + min
 * 如需取[10-20]之间的随机数
 * new Random().nextInt((20 - 10) + 1) + 10
 * new Random().nextInt(11) + 10即可
 */
int random = (new Random().nextInt(11) + 10);
		for (int i = 0; i < 100000; i++) {
			if (random >= 20 || random <= 10) {
				System.out.println(random);
			}
		}
		
	}
	
}
