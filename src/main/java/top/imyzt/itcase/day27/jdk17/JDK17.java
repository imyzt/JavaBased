package top.imyzt.itcase.day27.jdk17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * JDK1.7的新特性
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月23日 下午1:59:08 
 */
public class JDK17 {
	
	public static void main(String[] args) {
		
		/**
		 * 1.二进制字面量
		 * 2.数字可以使用下划线隔开
		 * 3.switch支持字符串判断
		 * 4.泛型简化，菱形泛型
		 * 5.异常的多个catch合并，每个异常使用或 |
		 * 6.try-with-resources 语句
		 */
		
		System.out.println(0b1101);
		
		System.out.println(100_111_000);
		
		switch ("A") {
		case "A":
			System.out.println("switch A");
			break;
		default:
			break;
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		try {
			Thread.sleep(1000);
			Class.forName("top.imyzt.itcase.day27.jdk17.JDK17");
		} catch (InterruptedException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try(
				BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream(new File("pom.xml")), "UTF-8"));
			)
		{
			System.out.println(bf.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
