package multiThread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ChatThread {
	public static void main(String[] args) {
	
		Socket socket = null;
		
	    String userName = null;
	    String answer = null;
	    Scanner userNameScanner = null;
	    Scanner userNameAnswer = null;
	    Scanner scannerOutMessage = null;
	    BufferedReader in = null;
        BufferedWriter out = null;

        try {
			userNameScanner = new Scanner(System.in);
			userNameAnswer = new Scanner(System.in);
			socket = new Socket();
			
			
			System.out.print("닉네임을 입력해주세요: ");
			userName = userNameScanner.nextLine();
			System.out.println(userName+"으로 설정하시겠습니까?(Y/N)");
			answer = userNameAnswer.next(); // String으로 변환
			
			if(answer.equalsIgnoreCase("y")) {// 이름 확정
				System.out.println("닉네임을"+userName+"(으)로 지정하였습니다");
				}else if(answer.equalsIgnoreCase("n")) {
					System.out.print("닉네임을 입력해주세요: ");
					userName = userNameScanner.nextLine();
					System.out.println(userName+"으로 설정하시겠습니까?(Y/N)");
				}
			
			in = new BufferedReader (new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter (new OutputStreamWriter(socket.getOutputStream()));
			scannerOutMessage = new Scanner(System.in);
			
			while(true) {
				System.out.println("메세지 를 입력하세요: ");
				String outMessage = scannerOutMessage.nextLine(); // 입력한 줄 다 읽기
			
				out.write(outMessage+"\n"); // 스캐너에서 입력받은 줄을 쓰기(상대방에게 출력)
				out.flush();
				
				String inMessage = in.readLine(); // 상대방의 메세지를 읽어오기
				System.out.println(userName+inMessage);
			}
        }catch(Exception e) {
			
			}
	}
}
