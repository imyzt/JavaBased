package top.imyzt.itcase.day26.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 使用UDP + Thread 制作聊天小程序
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月15日 上午11:14:41 
 */
public class MoreThread {

	public static void main(String[] args) {
		new Receive().start();

		new Send().start();
	}

}
class Send extends Thread {
	@Override
	public void run() {
		try {

			DatagramSocket socket = new DatagramSocket();
			Scanner in = new Scanner(System.in);

			while (true) {

				String msg = in.nextLine();

				boolean bool = "quit".equals(msg);

				DatagramPacket packet = 
						new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, InetAddress.getByName("127.0.0.1"), 6666);

				socket.send(packet);

				if (bool) {
					socket.close();
					in.close();
					break;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Receive extends Thread {
	@Override
	public void run() {
		try {

			DatagramSocket socket = new DatagramSocket(6666);
			DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);

			while (true) {
				socket.receive(packet);

				byte[] data = packet.getData();
				int len = packet.getLength();
				String ip = packet.getAddress().getHostAddress();
				int port = packet.getPort();

				String msg = new String(data, 0, len);
				
				if ("quit".equals(msg)) {
					System.out.println("拜拜~~");
					socket.close();
					break;
				}
				
				System.out.println(ip + port + ": " + msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}