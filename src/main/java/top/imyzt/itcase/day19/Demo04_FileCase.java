package top.imyzt.itcase.day19;

import java.io.File;

import cn.hutool.core.lang.Console;

/**
 * 将制定目录下的所有jpg图片绝对路径打印到控制台
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年4月25日 下午4:48:45 
*/
public class Demo04_FileCase {

	public static void main(String[] args) {
		File dir = new File("D:\\");
		dir(dir);
	}

	private static void dir(File dir) {
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				if (!file.isHidden()) {
					dir(file);
				}
			}else if (file.isFile()) {
				String name = file.getName();
				if (name.endsWith(".jpg")) {
					Console.log(file.getAbsolutePath());
				}
			}
		}
	}

}
