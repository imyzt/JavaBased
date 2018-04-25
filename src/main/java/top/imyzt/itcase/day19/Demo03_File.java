package top.imyzt.itcase.day19;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cn.hutool.core.lang.Console;

import static cn.hutool.core.lang.Console.log;

/**
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年4月25日 下午3:49:31 
* File类学习
*/
public class Demo03_File {

	public static void main(String[] args) throws IOException {
//		construction();		
		
//		method01();
		
//		method02();
		
//		method03();
		
		File file = new File("D:\\");
		//FilenameFilter,文件名称过滤器.
		String[] list = file.list(new FilenameFilter() {
			
			//重写accapt(),自定义过滤器,过滤掉不需要的文件
			@Override
			public boolean accept(File dir, String name) {
				File f = new File(dir, name);
				return f.isFile() && f.getName().endsWith(".txt");
			}
		});
		for (String name : list) {
			Console.log(name);
		}
	}

	/**
	 * File类常用获取方法
	 * @author:imyzt
	 * @date:2018年4月25日下午4:36:48
	 * @throws IOException
	 */
	private static void method03() throws IOException {
		File f1 = new File("test.txt");
		if (!f1.exists()) {
			f1.createNewFile();
		}
		log("绝对路径是:" + f1.getAbsolutePath());
		log("路径是:" + f1.getPath());
		log("文件名:" + f1.getName());
		log("长度是(字节数):" + f1.length());
		log("最后修改时间是:" + new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date(f1.lastModified())));
		
		log("D:\\zzz下面有:");
		File f2 = new File("D:\\zzz");
		String[] list = f2.list();//获取文件夹和文件名称
		for (String s : list) {
			log(s);
		}
		log("-------------");
		File[] listFiles = f2.listFiles(); //获取文件夹和文件的File对象
		for (File s : listFiles) {
			log(s.getName());
		}
	}

	/**
	 * File类的判断功能
	 * @author:imyzt
	 * @date:2018年4月25日下午4:25:27
	 */
	private static void method02() {
		File f1 = new File("D:\\test.txt");
		f1.setReadable(false);	//windows认为所有文件都是可读的
		f1.setWritable(false);	//windows可以设置文件不可写
		log("是否存在:" + f1.exists());		//是否存在
		log("是否是目录:" + f1.isDirectory());	//是否是目录
		log("是否是文件:" + f1.isFile());		//是否是文件
		log("是否可读:" + f1.canRead());		//是否可读
		log("是否可写:" + f1.canWrite());		//是否可写
		log("是否隐藏:" + f1.isHidden());		//是否隐藏
	}

	/**
	 * File类的常用方法
	 * @author:imyzt
	 * @date:2018年4月25日下午4:19:09
	 * @throws IOException
	 */
	private static void method01() throws IOException {
		File f1 = new File("D:\\test.txt");
		
		//创建一个文件,如果已存在返回false,创建成功返回true
		log(f1.createNewFile());		
		
		File f2 = new File("D:\\file");
		/*
		 * 创建一个文件夹,如果存在返回false,创建成功返回true
		 * mkdir().创建单个目录
		 * mkdirs().创建多级目录
		 */
		log(f2.mkdirs());
		
		/**
		 * renameTo()
		 * 如果路径相同就是重命名
		 * 如果路径不相同就是改名并剪切到f4的路径下
		 */
		File f3 = new File("D:\\file\\b.txt");
		File f4 = new File("D:\\zzz\\b.txt");
		log(f3.renameTo(f4));
		
		/**
		 * delete()方法不走回收站 
		 * 如果删除文件,成功返回true,不存在返回false
		 * 如果删除文件夹,文件夹内不能有其他文件
		 */
		log(f4.delete());
		log(f2.delete());
	}

	/**
	 * @Description: File类的构造
	 * @author:imyzt
	 * @date:2018年4月25日下午3:59:11
	 */
	private static void construction() {
		//接收一个相对或绝对路径.
		File f1 = new File("D:\\test.txt");
		File f2 = new File("test.txt");		//相对于项目的路径
		log(f1.exists());		
		log(f2.exists());
		
		//接受一个父路径和一个子路径
		String parent = "D:\\";
		String child = "test.txt";
		File f3 = new File(parent,child);
		log(f3.exists());
		
		//接受一个File类型的父路径和一个子路径
		File f4 = new File(parent);
		File f5 = new File(f4, child);
		log(f5.exists());
	}

}
