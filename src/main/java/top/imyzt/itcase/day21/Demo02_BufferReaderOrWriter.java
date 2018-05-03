package top.imyzt.itcase.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;


/**
 * 使用jdk自带的缓冲字符流处理,读取一行
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月3日 下午2:47:07 
*/
public class Demo02_BufferReaderOrWriter {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new FileReader("chinese.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("chineseWriter.txt", true));
		
		readerAndWriter(bf, bw);
		readerLineAndWriter(bf, bw);
		lineNumberReader();
		
		bf.close();
		bw.close();
	}

	/**
	 * 继承自ReaderLine,有获取和设置行号的功能
	 * @author:imyzt
	 * @date:2018年5月3日下午3:39:18
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void lineNumberReader() throws FileNotFoundException, IOException {
		LineNumberReader lnr = new LineNumberReader(new FileReader("chinese.txt"));
		String b;
		lnr.setLineNumber(0); //设置行号
		while ((b = lnr.readLine()) != null) {
			System.out.println(lnr.getLineNumber() + ":\t" + b); //getLineNumber可以获取当前行号
		}
		
		lnr.close();
	}

	/**
	 * 一次读一行
	 * @author:imyzt
	 * @date:2018年5月3日下午3:26:38
	 * @param bf
	 * @param bw
	 * @throws IOException
	 */
	private static void readerLineAndWriter(BufferedReader bf, BufferedWriter bw) throws IOException {
		String line;
		while ((line = bf.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
	}

	/**
	 *  普通读写
	 * @author:imyzt
	 * @date:2018年5月3日下午3:25:28
	 * @param bf
	 * @param bw
	 * @throws IOException
	 */
	private static void readerAndWriter(BufferedReader bf, BufferedWriter bw) throws IOException {
		int c;
		while ((c = bf.read()) != -1) {
			bw.write(c);
		}
	}

}
