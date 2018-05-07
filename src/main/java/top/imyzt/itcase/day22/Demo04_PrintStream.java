package top.imyzt.itcase.day22;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import static cn.hutool.core.lang.Console.log;

/**
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月7日 下午3:47:49 
*/
public class Demo04_PrintStream {
	
	public static void main(String[] args) throws IOException {
		log();
//		method01();
		
//		method02();
		
		method03();
	}

	/**
	 * 使用 PrintWriter(OutputStream out, boolean autoFlush)创建自动刷新输出字符流
	 * @author:imyzt
	 * @date:2018年5月7日下午4:08:37
	 * @throws FileNotFoundException
	 */
	private static void method03() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new FileOutputStream("f.txt"), true);
		pw.write("AAA");
		pw.print("BBB");
		
		//println()方法会将缓存刷入文件
		pw.println("CCC");
	}

	/**
	 * 使用 PrintWriter 字符流,需要手动关闭流才能将内容从缓存中刷入
	 * @author:imyzt
	 * @date:2018年5月7日下午4:06:12
	 * @throws FileNotFoundException
	 */
	private static void method02() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("f.txt");
		pw.write("ddd");
		pw.print("eee");
		pw.println("fff");
		pw.close();
	}

	/**
	 * 使用 PrintWriter 打印字节流
	 * @author:imyzt
	 * @throws IOException 
	 * @date:2018年5月7日下午4:02:33
	 */
	private static void method01() throws IOException {
		PrintStream ps = new PrintStream("f.txt");
		ps.write("aaa".getBytes());
		ps.print("bbb");
		ps.println("ccc");
		
		ps.close();
	}

}
