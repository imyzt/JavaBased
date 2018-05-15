package top.imyzt.itcase.day26.socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月15日 下午1:24:05 
 */
public class Server {

	public static void main(String[] args) throws IOException, InterruptedException {
		ServerSocket server = new ServerSocket(7777);
		
		//服务器是多线程的,只要接收到请求就开一条线程
		while (true) {
			
			//接受请求
			Socket socket = server.accept();		
			
			new Thread() {
				public void run() {
					try {
						
						//输入流
						BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						//输出流
						PrintStream ps = new PrintStream(socket.getOutputStream());
						
						//读取客户端发送的消息,翻转
						String line = br.readLine();
						System.out.println(line);
						line = new StringBuffer(line).reverse().toString();
						
						//返回给客户端
						ps.println(line);
						
					} catch (IOException e) {
						e.printStackTrace();
					}
				};
				
			}.start();
		}
	}
}
