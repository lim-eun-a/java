package ex10accessmodifier;
/*
 캡슐화: 여러가지 업무로직을 하나로 묶음(관련있는 로직을 하나로)
 */
class MemberRegist {
	void doMemberRegist() {
		System.out.println("1. 회원가입을 진행합니다.");
	}
}
class CongratulationPoint {
	void doCongratulationPoint() {
		System.out.println("3. 가입축하 10포인트를 지급합니다.");
	}
}
class AutoLogin {
	void doAutoLogin() {
		System.out.println("2. 자동로그인");
	}
}
class FirstLoginEvent {
	void doFirstLoginEvent() {
		System.out.println("4. 첫 로그인 이벤트 페이지로 이동합니다.");
	}
}

class EncapsulLogic {
	MemberRegist memberRegist = new MemberRegist();
	FirstLoginEvent firstLoginEvent = new FirstLoginEvent();
	AutoLogin autoLogin = new AutoLogin();
	CongratulationPoint congratulationPoint = new CongratulationPoint();
	
	void doProcess() {
		memberRegist.doMemberRegist();
		autoLogin.doAutoLogin();
		congratulationPoint.doCongratulationPoint();
		firstLoginEvent.doFirstLoginEvent();
	}
}
public class E05Encapsulation
{

	public static void main(String[] args)
	{
		System.out.println("캡슐화 전 코드");
		/*
		 업무의 진행순서가 중요하다고 가정했을 때 
		 캡슐화 이전의 코드에서는 업무의 차질이 발생
		 */
		MemberRegist memberRegist = new MemberRegist();
		FirstLoginEvent firstLoginEvent = new FirstLoginEvent();
		AutoLogin autoLogin = new AutoLogin();
		CongratulationPoint congratulationPoint = new CongratulationPoint();
		
		memberRegist.doMemberRegist();
		firstLoginEvent.doFirstLoginEvent();
		autoLogin.doAutoLogin();
		congratulationPoint.doCongratulationPoint();
		
		System.out.println("=======================================");
		
		System.out.println("캡슐화 이후 코드");
		new EncapsulLogic().doProcess();
		
	}

}
