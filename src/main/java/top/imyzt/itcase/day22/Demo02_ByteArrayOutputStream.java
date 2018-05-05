package top.imyzt.itcase.day22;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月5日 下午3:55:29 
*/
public class Demo02_ByteArrayOutputStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("a.txt");
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();	//在内存中创建了可以增长的内存数组
		
		byte[] b = new byte[1024 * 8];
		int c;
		while ((c = fis.read(b)) != -1) {
			baos.write(b, 0, c);									//将读取到的数据逐个写入到内存中
		}
		
		
		System.out.println(new String(baos.toByteArray(), "UTF-8"));	//将缓冲区的内容读取出来传入String的构造,以UTF-8形式读取返回
		System.out.println(baos.toString());
		
		fis.close();
	}

}
