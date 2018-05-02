package top.imyzt.itcase.day21;

import java.io.FileWriter;
import java.io.IOException;

/**
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月2日 下午5:03:10 
*/
public class Demo02_FileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("chinese.txt", true);
		fw.write("我是渣渣辉");
		fw.close();
	}

}
