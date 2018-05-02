package top.imyzt.itcase.day21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * Reader 的间接子类 FileReader,用于读取文件中的字符
 * 通过码表的作用确定读取当前字符是否是中文.英文或标点
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月2日 下午4:57:13 
*/
public class Demo01_FileReader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("chinese.txt");
		int c;
		while ((c = fr.read()) != -1) {
			System.out.print((char) c);
		}
		
		fr.close();
	}

}
