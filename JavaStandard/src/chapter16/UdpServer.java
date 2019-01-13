package chapter16;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UdpServer {
	public static void main(String args[]) {
		try {
			new UdpServer().start(); // UDP������ ����
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void start() throws IOException {
		// ��Ʈ 7777���� ����ϴ� ������ �����Ѵ�.
		DatagramSocket socket = new DatagramSocket(7777);
		DatagramPacket inPacket, outPacket;

		byte[] inMsg = new byte[10];
		byte[] outMsg;

		while (true) {
			// �����͸� �����ϱ� ���� ��Ŷ�� ����
			inPacket = new DatagramPacket(inMsg, inMsg.length);

			// ��Ŷ�� ���� �����͸� ����(receive)
			socket.receive(inPacket);

			// ������ ��Ŷ���� ���� client�� IP�ּҿ� Port�� ��´�.
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();

			// ������ ���� �ð��� �ú��� ����([hh:mm:ss])�� ��ȯ
			SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
			String time = sdf.format(new Date());
			outMsg = time.getBytes(); // time�� byte�迭�� ��ȯ�Ѵ�.

			// ��Ŷ�� �����ؼ� client���� ����(send)
			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
			socket.send(outPacket);
		}
	}
}
