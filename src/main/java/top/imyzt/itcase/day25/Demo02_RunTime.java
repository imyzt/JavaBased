package top.imyzt.itcase.day25;

import java.io.IOException;

/**
 * 
 * Runtime可以执行计算机命令
 * 
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月10日 下午4:06:42 
 */
public class Demo02_RunTime {

	public static void main(String[] args) throws IOException {

		Runtime r = Runtime.getRuntime();
		//r.exec()可以执行计算机命令
		r.exec("shutdown -a");
	}


}
