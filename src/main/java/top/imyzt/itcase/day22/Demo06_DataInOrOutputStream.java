package top.imyzt.itcase.day22;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 指定数据类型的字节输入或输出流
 * 
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月7日 下午8:17:22
 */
public class Demo06_DataInOrOutputStream {

	public static void main(String[] args) throws IOException {
		//使用 java.io.DataOutputStream 将指定数据类型的内容写进 FileOutputStream 指定的的文件中
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("a.txt"));
		
		//分别写入int.short.long类型的文件
		dos.writeInt(999);
		dos.writeShort(22);
		dos.writeLong(1111212L);
		
		dos.close();
		
		//使用 DataInputStream 从 FileInputStream 指定的文件的字节中读取指定类型的内容
		DataInputStream dis = new DataInputStream(new FileInputStream("a.txt"));
		
		//从文件中按存入顺序读取int,short,long类型的文件
		int x = dis.readInt();
		short s = dis.readShort();
		long l = dis.readLong();
		System.out.println(x);
		System.out.println(s);
		System.out.println(l);
		
		dis.close();
	}

}
