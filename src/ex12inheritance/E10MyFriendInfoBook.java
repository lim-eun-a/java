package ex12inheritance;

import java.util.Scanner;

//VO클래스
class Friend{
	
	String name;
	String phone;
	String addr;
	
	public Friend(String name, String phone, String addr) {
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	public void showAllData() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phone);
		System.out.println("주소: " + addr);
	}
	//추상메서드: 오버라이딩을 하기 위해서
	public void showBasicInfo() {}
}

class HighFriend extends Friend{
	
	String nickname;
	
	public HighFriend(String name, String phone, String addr, String nickname) {
		super(name, phone, addr);
		this.nickname = nickname;
	}
	@Override
	public void showAllData() {
		System.out.println("==고딩친구(전체정보)==");
		super.showAllData();
		System.out.println("별명: " + nickname);
	}
	@Override
	public void showBasicInfo() {
		System.out.println("==고딩친구==");
		System.out.println("별명: " + nickname);
		System.out.println("전번: " + phone);
	}
}

//ctrl + T : 상속관계 확인
class UnivFriend extends Friend{
	String major;
	
	public UnivFriend(String name, String phone, String addr, String major) {
		super(name, phone, addr);
		this.major = major;
	}
	@Override
	public void showAllData() {
		System.out.println("==대딩친구(전체정보)==");
		super.showAllData();
		System.out.println("전공: " + major);
	}
	@Override
	public void showBasicInfo() {
		System.out.println("==대딩친구==");
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phone);
	}
}


public class E10MyFriendInfoBook
{
	public static void menuShow() {
		System.out.println("######## 메뉴를 입력하세요 ########");
		System.out.println("1. 고딩친구입력 ");
		System.out.println("2. 대딩친구입력 ");
		System.out.println("3. 전체정보출력 ");
		System.out.println("4. 간략정보출력 ");
		System.out.println("5. 검색 ");
		System.out.println("6. 삭제 ");
		System.out.println("7. 프로그램종료 ");
		System.out.println("메뉴선택>>>");
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		FriendInfoHandler handler = new FriendInfoHandler(100);
		
		while(true) {
			menuShow();
			
			int choice = scan.nextInt();
			switch(choice) {
			case 1: case 2:
				handler.addFriend(choice);
				break;
			case 3:
				handler.showAllData();
				break;
			case 4:
				handler.showSimpleData();
				break;
			case 5:
				handler.searchInfo();
				break;
			case 6:
				handler.deleteInfo();
				break;
			case 7:
				System.out.println("프로그램종료");
				return;
			}//switch 끝
		}//while끝
	}//main끝
}//class끝

class FriendInfoHandler{
	
	private Friend[] myFriends;
	private int numOfFriends;
	
	public FriendInfoHandler (int num) {
		myFriends = new Friend[num];
		numOfFriends = 0;
	}
	
	public void addFriend(int choice) {
		
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.print("이름:"); iName = scan.nextLine();
		System.out.print("전화번호:"); iPhone = scan.nextLine();
		System.out.print("주소:"); iAddr = scan.nextLine();
		
	}
}