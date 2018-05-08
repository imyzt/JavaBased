package top.imyzt.itcase.day22;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 随机访问读写文件
 * 
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月7日 下午7:55:02
 */
public class Demo05_RandomAccessFile {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("a.txt", "rw");
		//可以用来写入文件
//		raf.write(97);
		
		//可以用来读取文件
		int x = raf.read();
		System.out.println(x);
		
		//seek(),将指针移到指定位置后继续下一步操作
		raf.seek(3);
		raf.write(98);
		
		raf.close();
	}

}
