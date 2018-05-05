package top.imyzt.itcase.day21;

import java.io.File;

import cn.hutool.core.lang.Console;

/**
* @author imyzt
* @email imyzt01@gmail.com
* @date 2018年5月5日 上午11:38:26 
*/
public class Demo06_Recursive {

	public static void main(String[] args) {
		
//		Console.log(fun(5));
		
		createDirectory(new File("D:\\zzz\\a"));
		
	}
	static int i = 0;
	public static void createDirectory(File f) {
		if (i > 255) {
			return;
		}
		i++;
		if (f.isDirectory()) {
			File file = new File(f.getAbsolutePath() + File.separator + "a");
			file.mkdirs();
			createDirectory(file);
		}
	}
	
	/**
	 * 递归求阶乘案例
	 * @author:imyzt
	 * @date:2018年5月5日上午11:41:57
	 * @param num 求几的阶乘
	 * @return
	 */
	public static int fun(int num) {		
		if (num == 1) {
			return 1;
		}else {
			return num * fun(num - 1);
		}
	}
}
