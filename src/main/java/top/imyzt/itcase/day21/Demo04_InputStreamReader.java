package top.imyzt.itcase.day21;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

/**
 * 
 * InputStreamReader 和 OutputStreamWriter 属于 Reader 的子类,属于字符流
 * 
 * <p>
 * 	指定字符集读取文件和写入文件
 * </p>
 * 
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月5日 上午9:40:19 
*/
public class Demo04_InputStreamReader {

	public static void main(String[] args) throws IOException {
		method();
		
		method02();
	}

	/**
	 * 使用缓冲区读写指定字符集的内容
	 */
	private static void method02() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(
								new FileInputStream("chinese.txt"), "utf-8"));
		BufferedWriter bw = 
				new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream("chineseWriter.txt", true), "utf-8"));
		
		int b;
		while ((b = br.read()) != -1) {
			bw.write(b);
		}
		
		br.close();
		bw.close();
	}

	/**
	 * 指定字符集读取文件并写入另一个文件
	 * @author:imyzt
	 * @date:2018年5月5日上午9:48:56
	 * @throws UnsupportedEncodingException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void method() throws UnsupportedEncodingException, FileNotFoundException, IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("chinese.txt"), "utf-8");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("chineseWriter.txt", true), "utf-8");
		
		char[] arr = new char[1024 * 8];
		int b;
		while ((b = isr.read(arr)) != -1) {
			osw.write(arr, 0, b);
		}
		isr.close();
		osw.close();
	}

}
