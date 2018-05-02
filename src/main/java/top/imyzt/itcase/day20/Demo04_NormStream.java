package top.imyzt.itcase.day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 标准流操作
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月2日 下午4:03:57 
*/
public class Demo04_NormStream {

	
	public static void main(String[] args) throws Exception {
		
//		older();
		
		newMethod();
		
		
		
		
	}

	/**
	 * jdk1.7以后,通过实现 @see AutoCloseable 接口,
	 * 实现了 AutoCloseable接口的对象,会在执行完try{}大括号内的操作后
	 * 自动执行try()小括号内的对象的close()方法,自动关闭对象
	 * 
	 * @author:imyzt
	 * @throws Exception 
	 * @date:2018年5月2日下午4:25:09
	 */
	private static void newMethod() throws Exception {
		try (
				FileInputStream fis = new FileInputStream("chinese.txt");
				FileOutputStream fos = new FileOutputStream("chinese.txt");
				MyClose close = new MyClose();
		){
			byte[] b = new byte[8192];
			int len;
			while ((len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
		}
	}

	/**
	 * jdk1.7以前处理异常的方法
	 * @author:imyzt
	 * @date:2018年5月2日下午4:20:43
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void older() throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("chinese.txt");
			fos = new FileOutputStream("chinese.txt");
			
			byte[] b = new byte[8192];
			int len;
			
			while ((len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
		} finally {
			try {			
				if (fis != null) {
					fis.close();
				}
			} finally {		//能关闭一个尽量关闭一个
				if (fos != null) {
					fos.close();
				}
			}
		}
	}

}
class MyClose implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("我关闭了");
	}
	
}