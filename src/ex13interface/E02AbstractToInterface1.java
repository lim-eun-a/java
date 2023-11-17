package ex13interface;

// 추상클래스를 인터페이스로 변경하기
interface IPersonalNumberStorageAbs
{
	void addPersonalInfo(String juminNum, String name);
	String searchPersonalInfo(String juminNum);
}

/*
	DTO(Data Transfer Object): 데이터를 저장하고 전송하기 위한 용도의 객체를 말한다. 
		VO(Value Object)로 표현하기도 한다.
		해당 프로그램에서는 한 사람의 정보를 저장하는 용도로 사용된다.
*/
class PersonalInfoVO{
	//이름과 주민번호를 멤버변수로 정의
	private String name;
	private String juminNum;
	
	// 멤버변수 선언 후 자동생성 하세요.
	// 여기서 마우스 오른쪽 클릭 후 source 선택 후 ~~~Field 선택하여 자동완성으로 설정
	public PersonalInfoVO(String name, String juminNum)
	{
		super();
		this.name = name;
		this.juminNum = juminNum;
	}

	/*
	  getter/setter 메서드
	  : DTO객체에서 private으로 선언된 멤버변수의 값을 설정하거나 반환할 때 사용한다.
	 */
	public String getName(){return name;}
	public String getJuminNum(){return juminNum;}
	public void setName(String name){this.name = name;}
	public void setJuminNum(String juminNum){this.juminNum = juminNum;}
}
/*
 클래스가 클래스를 상속할 때 -> extends
 클래스가 인터페이스를 상속할 때 -> implements
 */
class PersonalNumberStorageImpl implements IPersonalNumberStorageAbs{
	PersonalInfoVO[] personalArr;
	int numOfPerInfo;
	public PersonalNumberStorageImpl(int arrSize) {
		personalArr = new PersonalInfoVO[arrSize];
		numOfPerInfo = 0;
	}
	@Override
	public void addPersonalInfo(String juminNum, String name) {
		personalArr[numOfPerInfo] = new PersonalInfoVO(name, juminNum);
		numOfPerInfo++;
	}
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i=0; i<numOfPerInfo; i++) {
			if(juminNum.compareTo(personalArr[i].getJuminNum())==0) {
				return personalArr[i].getName();
			}
		}
		return null;
	}
}

public class E02AbstractToInterface1
{
	public static void main(String[] args)
	{
		PersonalNumberStorageImpl storage= new PersonalNumberStorageImpl(10);
		
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
	}

}
