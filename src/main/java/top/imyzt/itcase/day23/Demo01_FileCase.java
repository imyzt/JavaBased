package top.imyzt.itcase.day23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * 递归遍历输出文件夹,文件夹内文件大小.
 * 
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月8日 上午10:00:17 
*/
public class Demo01_FileCase {

	public static void main(String[] args) throws IOException {
		
//		System.out.println(fileLength(new File("D:\\y\\HTML\\todolist")));
		
//		deleteFile(new File("D:\\y\\source\\source"));
		
//		moveFile(new File("D:\\y\\source"), new File("D:\\y\\target"));
		
//		System.out.println(print(14, "b"));
		
		showFile(new File("D:\\y\\SpringBootAdvanced"), 0);

	}

	/**
	 * 打印指定文件夹下面的所有文件及文件夹的层级结构
	 * @author:imyzt
	 * @date:2018年5月8日下午2:17:35
	 * @param file
	 * @param lev
	 */
	public static void showFile(File file, int lev) {
		if (file.exists()) {
			if (file.isDirectory()) {
				//是文件夹就获取下面所有的文件和文件夹
				File[] listFiles = file.listFiles();
				for (File f : listFiles) {
					//缩进
					System.out.print(print(lev, "|---"));
					
					//不管是文件夹还是文件,都进行打印全路径
					System.out.println(f.getAbsolutePath());
					
					if (f.isDirectory()) {
						//如果是文件夹,就继续执行
						showFile(f, lev + 1);
					} 
				}
			}else if (file.isFile()) {
				System.out.println(file.getAbsolutePath());
			}
		}else {
			throw new RuntimeException("文件夹不存在");
		}
	}
	
	/**
	 * 指定文件夹,计算文件夹下面所有文件的字节数
	 * @author:imyzt
	 * @date:2018年5月8日上午10:14:11
	 * @param file
	 * @return
	 */
	public static long fileLength(File file) {
		long len = 0L;
		//判断文件夹或文件是否存在
		if (file.exists()) {
			//判断file是否是文件夹
			if (file.isDirectory()) {
				//是文件夹获取下面所有的文件和文件夹
				File[] listFiles = file.listFiles();
				for (File f : listFiles) {
					//将下面的所有文件和文件夹递归调用方法本身
					len += fileLength(f);
				}
				//判断file是否是文件
			} else if (file.isFile()) {
				//是文件计算大小
				len += file.length();
			}
			return len;
		}else {
			throw new RuntimeException("文件夹不存在");
		}
	}

	
	/**
	 * 指定文件夹删除文件夹以及文件夹下面的所有文件
	 * @author:imyzt
	 * @date:2018年5月8日上午10:21:22
	 * @param file
	 */
	public static void deleteFile(File file) {
		//判断文件夹或文件是否存在
		if (file.exists()) {
			//判断file是否是文件夹
			if (file.isDirectory()) {
				//是文件夹获取下面所有的文件和文件夹
				File[] listFiles = file.listFiles();
				for (File f : listFiles) {
					//将下面的所有文件和文件夹递归调用方法本身
					deleteFile(f);
				}
				//每次删完本文件夹下面所有文件后,将本文件夹删除
				file.delete();
				//判断file是否是文件
			} else if (file.isFile()) {
				file.delete();
			}
		}else {
			throw new RuntimeException("文件夹不存在");
		}
	}
	
	public static void moveFile(File source, File target) throws IOException {
		
		if (source.equals(target)) {
			throw new RuntimeException("目标路径和源路径相同");
		}
		
		//在目标文件夹下面创建源文件夹
		File file = new File(target, source.getName());
		file.mkdir();
		
		//获取到源文件夹下所有的文件和文件夹
		File[] listFiles = source.listFiles();
		//遍历源文件下的文件和文件夹
		for (File f : listFiles) {
			
			if (f.isDirectory()) {
				//如果是文件夹,递归调用自身,将源文件的当前文件夹当源文件夹,当前目标文件夹当目标文件夹
				moveFile(f, file);
			}else if (f.isFile()) {
				//如果是文件,创建输入输出流进行复制
				BufferedInputStream bis = 
						new BufferedInputStream(
								new FileInputStream(f));
				BufferedOutputStream bos = 
						new BufferedOutputStream(
								new FileOutputStream(
										new File(file, f.getName())));
				
				int b;
				while ((b = bis.read()) != -1) {
					bos.write(b);
				}
				
				bis.close();
				bos.close();
			}
		}
	}
	
	
	public static String print(int c, String str) {
		StringBuilder sb = new StringBuilder();
		while (c-- > 0) {
			sb.append(str);
		}
		return sb.toString();
	}
}
