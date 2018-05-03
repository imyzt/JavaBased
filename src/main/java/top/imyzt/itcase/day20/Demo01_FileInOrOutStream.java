package top.imyzt.itcase.day20;

import java.io.FileInputStream;
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
		FileOutputStream fos = new FileOutputStream("out.txt", false);
		
		// 1024的整数倍
		byte[] arr = new byte[1024 * 8];
		int len;
		
		int available = fis.available();
		Console.log("文件有: " + available + "个字节");
		
		//fis.read(arr); 每次将内容读到arr中
		while ((len = fis.read(arr)) != -1) {
			fos.write(arr, 0, len);
		}
		
		fos.close();
		fis.close();
	}

}
