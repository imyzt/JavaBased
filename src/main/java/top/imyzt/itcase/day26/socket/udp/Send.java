package top.imyzt.itcase.day26.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 使用UDP协议发送消息
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月15日 上午10:49:56 
 */
public class Send {

	public static void main(String[] args) throws Exception {
		
		String msg = "hello world!";
		byte[] data = msg.getBytes();

		//创建Socket,相当于创建一个码头
		DatagramSocket socket = new DatagramSocket();
		//创建packet,相当于创建一个集装箱
		DatagramPacket packet = new DatagramPacket(data, 0, data.length, InetAddress.getByName("127.0.0.1"), 6666);
		
		//发货
		socket.send(packet);
		
		//关闭码头
		socket.close();
		
	}

}
