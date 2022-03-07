package multiThread;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class test {
	public static void main(String[] args) throws JSONException {
		
	    Scanner portScanner = null;
	    Scanner userNameScanner = null;
		
		portScanner = new Scanner(System.in);
		String portName;
		
		List<String>List = new ArrayList<String>(); // JSONArray
		List.add("8000");
		List.add("8001");
		List.add("8002");
		List.add("8003");
		List.add("8004");
		List.add("8005");
		List.add("8006");
		List.add("8007");
		List.add("8008");
		List.add("8009");
		
		// 반복문을 이용해 ArrayList를 추출하고 그것을 JSONArray에 담는다
		JSONArray arr = new JSONArray(); 
		for (int i = 0; i<List.size(); i++) {
			arr.add(List.get(i));
		}
		JSONObject objList = new JSONObject();
		objList.put("PortList", arr);
		System.out.println(objList.toString()); // list 생성 끝
		
		
		
		
		// 배열리스트를 문자열로 변환
		String strPortList = List.toString();
		System.out.println(strPortList);
		
		String strTest = Arrays.deepToString(List.toArray());   
		
//		--------------------------------------------
		
		System.out.print("접속하고자하는 포트 번호를 입력해주세요: ");
		portName = portScanner.nextLine(); // 입력값을 읽어서 portName에 담기
//		String strPortname = portName.toString(); // portName을 문자로 변환
		
		System.out.println(List.contains(portName));
		
//		if(strTest.equals(strPortname)) {
//			System.out.println("O");
//		}else {
//			System.out.println("X");
//		}
		
		
//			System.out.print("접속하고자하는 포트 번호를 입력해주세요: ");
//			portName = portScanner.nextLine();
//		
//		do {
//			System.out.println(portName+"에 접속합니다");
//			System.out.println("4000번과의 접속이 끊겼습니다.");
//			System.out.println(portName+"에 접속하였습니다");
//			
//			if(List.contains(portName)) {
//				System.out.println(portName+"에 접속합니다");
//				System.out.println("4000번과의 접속이 끊겼습니다.");
//				System.out.println(portName+"에 접속하였습니다");				
//			}while(!List.contains(portName)); // if
//				System.out.println("입력하신 번호는 접속할 수 없습니다.");
//				System.out.print("다시 한번 입력해주세요: ");
//				portName = portScanner.next();
//		}
		
		
//		
//		if(!strPortList.equals(strPortname)) {
//			System.out.println("입력하신 번호는 접속할 수 없습니다.");
//			System.out.print("다시 한번 입력해주세요: ");
//			strPortname = portScanner.next();					
//		}else {
//			if(strPortList.equals(strPortname)) {
//					System.out.println(portName+"에 접속합니다");
//					System.out.println("4000번과의 접속이 끊겼습니다.");
//					System.out.println(portName+"에 접속하였습니다");						
//					// 일치할 경우 4000 접속을 끊는							
//			}
//		}
	}
}
		
//		System.out.print("접속하고자하는 포트 번호를 입력해주세요: ");
//		portName = portScanner.nextLine();
		// json에 들어가 있는 값(value)과 입력한 값이 일치하는지 확인


//		for(String str : List) {
//			System.out.println("8000: "+str.contains("8000"));
//			System.out.println("8001: "+str.contains("8001"));
//			System.out.println("8003: "+str.contains("8002"));
//			System.out.println("8003: "+str.contains("8003"));
//			System.out.println("8004: "+str.contains("8004"));
//			System.out.println("8005: "+str.contains("8005"));
//			System.out.println("8006: "+str.contains("8006"));
//			System.out.println("8007: "+str.contains("8007"));
//			System.out.println("8008: "+str.contains("8008"));
//			System.out.println("8009: "+str.contains("8009"));
//		}		                   