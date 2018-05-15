package top.imyzt.itcase.day26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 文件上传服务器
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月15日 下午2:33:01 
 */
public class FileUploadServer {

	public static void main(String[] args) throws IOException {

		//监听8888端口
		ServerSocket server = new ServerSocket(8888);
		
		while (true) {
			//接受请求
			Socket socket = server.accept();

			new Thread() {
				public void run() {
					try {
						//获取文件输入和输出流
						InputStream is = socket.getInputStream();
						BufferedReader br = new BufferedReader(new InputStreamReader(is));
						PrintStream ps = new PrintStream(socket.getOutputStream());
						
						//判断文件是否存在于服务器,并返回结果
						String fileName = br.readLine();
						boolean fileIsExists = fileIsExists(fileName);
						ps.println(fileIsExists);
						
						FileOutputStream fos = new FileOutputStream(new File("upload/" + fileName));
						byte[] arr = new byte[8192];
						int len;
						while ((len = is.read()) != -1) {
							fos.write(arr, 0, len);
						}
						fos.close();
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

				/**
				 * 判断服务器是否已存在该文件
				 * @author:imyzt
				 * @date:2018年5月15日下午2:58:03
				 * @param fileName
				 * @return
				 */
				private boolean fileIsExists(String fileName) {
					File file = new File("upload");
					if (!file.exists()) {
						file.mkdirs();
						
						File f = new File(file, fileName);
						
						return f.exists();
					}
					return false;
				};
			}.start();

		}


	}

}
