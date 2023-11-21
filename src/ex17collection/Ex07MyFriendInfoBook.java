package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//VO클래스
abstract class Friend{
	
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
	abstract public void showBasicInfo();
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

class FriendInfoHandler{
	// 멤버변수
//	private Friend[] lists;
//	private int numOfFriends;
	
	/* 
	 기존 객체 배열에 저장하던 방식을 list컬렉션으로 변경
	 우리는 배열과 동일한 특성을 가지고 있는 ArrayList<E>로 객체를 생성
	 해당 컬렉션에는 Friend타입의 객체를, 저장할 것이므로 상속 관계가 있는
	 하위 객체는 모두 저장할 수 있다. 또한 List컬렉션은 인덱스가 존재하긴 하나
	 자동 인덱싱을 지원하므로 인덱스 저장을 위한 변수는 필요하지 않다.
	 */
	private ArrayList<Friend> lists;
	
	//생성자
	public FriendInfoHandler()
	{
		lists = new ArrayList<Friend>();
	}
	
	public void addFriend(int choice) {
		Scanner scan = new Scanner(System.in);
		String iName, iPhone, iAddr, iNickname, iMajor;
		System.out.print("이름:"); iName = scan.nextLine();
		System.out.print("전화번호:"); iPhone = scan.nextLine();
		System.out.print("주소:"); iAddr = scan.nextLine();
		
		if(choice==1) {
			System.out.print("별명: "); iNickname = scan.nextLine();
			HighFriend high = new HighFriend(iName, iPhone, iAddr, iNickname);
			lists.add(high);
		}
		else if(choice==2) {
			System.out.print("전공: "); iMajor = scan.nextLine();
			lists.add(new UnivFriend(iName, iPhone, iAddr, iMajor));
		}
		System.out.println("친구정보 입력이 완료되었습니다.");
	}//end of addFriend
	
		/*
	 		일반 for문을 통해 접근할 때는 인덱스를 이용한다.
	 		인덱스를 통한 접근을 할 때는 get()메서드를 사용하면 된다.
		 */
	public void showAllData() {
		for(int i=0; i<lists.size(); i++) {
			lists.get(i).showAllData();
		}
		System.out.println("==전체정보가 출력되었습니다.==");
	}
	
	public void showSimpleData() {
		for(Friend fr : lists) {
			fr.showBasicInfo();
		}
		System.out.println("==간략정보가 출력되었습니다.==");
	}
	
	public void searchInfo() {
		boolean isFind = false;
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 이름을 입력하세요: ");
		String searchName = scan.nextLine();
		
		//이터레이터를 통한 검색기능 구현
		//1. 컬렉션을 통해 이터레이터 객체를 생성한다.
		Iterator<Friend> itr = lists.iterator();
		//2. 원소(객체)가 있는지 확인한다.
		while(itr.hasNext()) {
			//3. 있다면 next()를 통해 객체의 참조값을 추출한다.
			// 하지만 next()를 두 번 호출하면 그 다음 객체로 넘어가 버리게 되므로 
			// while문 루프네에서 한 번만 호출해야 정상적으로 출력됨
			Friend fr = itr.next();
			if(searchName.equals(fr.name))
			{
				fr.showAllData();
				System.out.println("**귀하가 요청하는 정보를 찾았습니다.**");
				isFind = true;
			}
		}
		if(isFind == false) {
			System.out.println("***찾는 정보가 없습니다.***");
		}
	}
	
	public void deleteInfo() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 이름을 입력하세요: ");
		String deleteName = scan.nextLine();
		
		boolean isDelete = false;
		for(Friend fr : lists) {
			if(deleteName.compareTo(fr.name)==0) {
				lists.remove(fr);
				isDelete = true;
				break;
			}
		}
		
		if(isDelete==false) {
			System.out.println("==삭제된 데이터가 없습니다.==");
		}
		else {
			System.out.println("==데이터가 삭제되었습니다.==");
		}
	}
	
}

public class Ex07MyFriendInfoBook
{
	public static void menuShow() {
		System.out.println("######## 메뉴를 입력하세요 ########");
		System.out.print("1. 고딩친구입력 ");
		System.out.println("2. 대딩친구입력 ");
		System.out.print("3. 전체정보출력 ");
		System.out.println("4. 간략정보출력 ");
		System.out.print("5. 검색 ");
		System.out.print("6. 삭제 ");
		System.out.println("7. 프로그램종료 ");
		System.out.print("메뉴선택>>>");
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		FriendInfoHandler handler = new FriendInfoHandler();
		
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