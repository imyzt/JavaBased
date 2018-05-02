package top.imyzt.itcase.day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import cn.hutool.core.lang.Console;

/**
 * 字节流读取中文和写入中文.
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月2日 下午3:10:31 
*/
public class Demo03_InputStreamReaderOrWriterChinese {
	
	public static void main(String[] args) throws IOException {
		
		readerChinese();
		
		writerChinese();
	}

	/**
	 * 字节流写入中文时,会将内容转换为byte数组,所以不会出现乱码问题
	 * @author:imyzt
	 * @date:2018年5月2日下午3:44:27
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void writerChinese() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("chineseWriter.txt");
		fos.write("哈哈哈\r\n\t哈哈哈".getBytes());
		fos.close();
	}

	/**
	 * 字节流读取中文字符会出现字节长度方面的问题
	 * gbk中文2字节长度
	 * utf8中文3字节长度,标点和英文1字节长度
	 * 而在读取的时候会出现中文,英文,标点各种内容,指定读取长度不能解决问题,需使用字符流
	 * @author:imyzt
	 * @date:2018年5月2日下午3:39:06
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void readerChinese() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("chinese.txt");
		
		byte[] arr = new byte[3];
		while (fis.read(arr) != -1) {
			Console.log(arr);
		}
		fis.close();
	}

}
