package top.imyzt.itcase.day26.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 使用UDP协议接收发送方的消息
 *
 * @author imyzt
 * @email imyzt01@gmail.com
 * @date 2018年5月15日 上午10:50:19 
 */
public class Receive {

	public static void main(String[] args) throws Exception {

		//创建Socket
		DatagramSocket socket = new DatagramSocket(6666);
		//创建packet
		DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
		
		//接货
		socket.receive(packet);
		
		//获取数据
		byte[] data = packet.getData();
		//获取数据的有效字节个数
		int len = packet.getLength();
		//获取ip和端口
		String ip = packet.getAddress().getHostAddress();
		int port = packet.getPort();
		
		System.out.println(ip + ":" + port + "：" + new String(data, 0, len));
		
		//关闭码头
		socket.close();
	}

}
