package top.imyzt.itcase.day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * 
 * 序列流
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月5日 下午2:32:28 
*/
public class Demo01_SequenceInputStream {

	public static void main(String[] args) throws IOException {
		
//		twoInputStream();
		
		manyInputStream();
	}

	/**
	 * 利用 SequenceInputStream 整合多个InputStream,通过 Enumeration
	 * 
	 * @author:imyzt
	 * @date:2018年5月5日下午2:47:44
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void manyInputStream() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		FileInputStream fis3 = new FileInputStream("c.txt");
		
		Vector<InputStream> vector = new Vector<>();
		vector.add(fis1);
		vector.add(fis2);
		vector.add(fis3);
		
		Enumeration<InputStream> element = vector.elements();
		
		SequenceInputStream sis = new SequenceInputStream(element);
		
		FileOutputStream fos = new FileOutputStream("d.txt", true);
		
		int c;
		while ((c = sis.read()) != -1) {
			fos.write(c);
		}
		
		sis.close();
		fos.close();
	}

	/**
	 * 利用 SequenceInputStream 整合两个InputStream
	 * @author:imyzt
	 * @date:2018年5月5日下午2:38:02
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void twoInputStream() throws FileNotFoundException, IOException {
		FileInputStream fis1 = new FileInputStream("a.txt");
		FileInputStream fis2 = new FileInputStream("b.txt");
		
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		
		FileOutputStream fos = new FileOutputStream("c.txt", true);
		
		int c;
		while ((c = sis.read()) != -1) {
			fos.write(c);
		}
		
		sis.close();
		fos.close();
	}

}
