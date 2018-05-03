package top.imyzt.itcase.day21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输入和输出流,不能读取字节文件
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月3日 下午2:40:14 
*/
public class Demo01_FileReaderOrWriter {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("chinese.txt");
		FileWriter fw = new FileWriter("chinese.txt", true);
		
		char[] b = new char[1024 * 2];
		int len;
		while ((len = fr.read(b)) != -1) {
			fw.write(b, 0, len);
		}
		
		fr.close();
		fw.close();
	}

}
