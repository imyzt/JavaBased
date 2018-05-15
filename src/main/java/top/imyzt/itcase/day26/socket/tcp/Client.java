package top.imyzt.itcase.day26.socket.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * 
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月15日 下午1:24:16 
 */
public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		
		Scanner in = new Scanner(System.in);
		
		Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 7777);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
		PrintStream ps = new PrintStream(socket.getOutputStream());

		//向服务器发送消息
		ps.println(in.nextLine());
		
		
		//接收服务器返回的消息
		System.out.println(br.readLine());
		
		socket.close();
	}
}
