package UDPJava;

public class Main {
	public static void main (String[] args) {
		new Thread(new UDPServer()).start();
		//new Thread(new UDPClient()).start();
	}
}