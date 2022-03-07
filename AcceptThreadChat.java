package multiThread;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class AcceptThreadChat implements Runnable {

	int port;
	
	public AcceptThreadChat(int port) { // 8000-8009
		this.port = port;
	}
	
	public void run() {
		
	    ServerSocket AcceptThread = null;
	    Socket socket = null;
	    String userName = null;
	    String answer = null;
	    Scanner userNameScanner = null;
	    Scanner userNameAnswer = null;
	    
		try {
			AcceptThread = new ServerSocket(this.port); // 서버소켓 설정 생성자값

			while(true) {
				System.out.println(port);
				socket = AcceptThread.accept();
				System.out.println("연결완료되었습니다");
				InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress(); // 상대방 정보 가져오기
				System.out.println("IP주소: "+isa.getHostName()+", port: "+socket.getLocalPort()+"와 연결이 되었습니다");
			}
		}catch(Exception e) {
			System.out.println("연결이 종료되었습니다.");
			System.out.println(e);		
		}if(!socket.isClosed()) {
			try {
				socket.close();
			}catch(IOException e) {}
		}
	}
}