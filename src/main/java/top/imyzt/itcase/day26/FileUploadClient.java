package top.imyzt.itcase.day26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 文件上传客户端
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月15日 下午2:33:01 
 */
public class FileUploadClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		File file = getFile();
		
		//建立与服务器的链接
		Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 8888);
		
		//获取文件输入和输出流
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream ps = new PrintStream(socket.getOutputStream());
		
		//发送文件名到服务器
		ps.println(file.getName());
		
		//接收服务器判断文件是否存在的结果值
		boolean fileIsExists = Boolean.valueOf(br.readLine());
		
		//如果不存在则开始传输
		if (!fileIsExists) {
			
			FileInputStream fis = new FileInputStream(file);
			byte[] arr = new byte[8192];
			int len;
			while ((len = fis.read(arr)) != -1) {
				ps.write(arr, 0, len);
			}
			
			fis.close();
			
		}else {
			System.out.println("文件已存在服务器");
		}
		
		socket.close();
	}

	private static File getFile() {
		Scanner in = new Scanner(System.in);
		
		while (true) {
			
			String path = in.nextLine();
			File file = new File(path);
			if (!file.exists()) {
				System.out.println("文件不存在");
			}else if (file.isDirectory()) {
				System.out.println("不能输入目录");
			}else {
				in.close();
				return file;
			}
		}
		
	}

}
