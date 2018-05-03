package top.imyzt.itcase.day20;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 带缓冲区的文件流
 * 
 * BufferedInputStream 内置了一个缓冲区(数组),从BufferedInputStream中读取一个字节时,BufferedInputStream会一次性从文件中读取 8192个,存在缓冲区中,返回给程序一个
 * 程序在次读取时,就不用找文件了,直接从缓冲区中获取.直到缓冲区中所有都被使用了,才重新从文件中读取 8192个
 * 
 * BufferedOutputStream 也内置了一个缓冲区,程序写入字节时,不会直接写入文件,先写到缓冲区,如果缓冲区写满后,BufferedOutputStream才会将缓冲区中的数据一次性写入文件
 * 
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月2日 下午2:33:36 
*/
public class Demo02_BufferInOrOutStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("log.txt");
		FileOutputStream fos = new FileOutputStream("out.txt", false);
		
		/*
		 * 带缓冲区的IO流只是对FileInputStream和FileOutputStream进行了增强型封装,所有关闭时,关闭缓冲流即可
		 * 
		 * 自己定义byte[] arr = new byte[8192];的速度略比缓冲流快,因为少定义一个缓冲区.
		 * 
		 * close();方法具备flush()刷新功能,在关闭流之前调用会将缓冲区最后剩余的不足[8192]个字节的内容写入文件中
		 * 
		 * flush();方法具备刷新功能,刷新缓冲区,刷新后不会关闭流,可以继续写入
		 */
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b;
		while ((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bos.close();
		bis.close();
	}
}
