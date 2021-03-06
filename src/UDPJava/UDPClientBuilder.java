package UDPJava;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

class UDPClientBuilder {
	
	InetSocketAddress isA;
	DatagramSocket s;
	DatagramPacket req, rep;
	final int size = 2048;
	
	UDPClientBuilder(){ 
		isA = null; s = null; req = rep = null; 
	}
	
	protected void setConnection() throws IOException {
		s = new DatagramSocket();
		isA = new InetSocketAddress("localhost",8080);
		/** we can include more setting, later … */
	}
}
