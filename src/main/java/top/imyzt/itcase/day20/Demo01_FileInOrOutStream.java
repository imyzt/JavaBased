package top.imyzt.itcase.day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import cn.hutool.core.lang.Console;

/**
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年4月28日 下午3:56:47 
* FileInputStream 和 FileOutputStream
*/
public class Demo01_FileInOrOutStream {

	public static void main(String[] args) throws IOException {
		
		// 文件输入流
		FileInputStream fis = new FileInputStream("log.txt");
		// 文件输出流 文件输出路径, 追加还是覆盖
		FileOutputStream fos = new FileOutputStream("out.txt", true);
		int read;
		
		int available = fis.available();
		Console.log("文件有: " + available + "个字节");
		
		while ((read = fis.read()) != -1) {
			fos.write(read);
		}
		
		fos.close();
		fis.close();
	}

}
