package top.imyzt.test;

import java.io.File;

/** 
* @author 杨镇涛
* @date 2018年4月12日 上午8:56:43 
* @version 1.0 
* @Description 
*/
public class Test01 {
	
	public static void main(String[] args) {
		File f = new File("E:\\itcast\\01、第一阶段java基础");
		demo(f);
		System.out.println(count + "个文件");
	}
	
	static int count = 0;
	
	
	private static void demo(File f) {
		
		if (f.exists()) {
			String[] list = f.list();
			for (String s : list) {
				File file  = new File(f.getPath() + File.separator + s);
				if (file.isDirectory()) {
					demo(file);
				}else {
					++count;
					if (file.getName().indexOf("API") != -1) {
						System.out.println(file.getName());
					}
				}
			}
		}
	}

}
