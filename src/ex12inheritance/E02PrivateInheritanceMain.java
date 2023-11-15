package ex12inheritance;

//class A{}
//class B extends A{}
/*
 	=> 이 경우 클래스 A, B에는 생성자를 정의하지 않았으므로 디폴트
 		생성자가 컴파일러에 의해 추가된다. 따라서 위 코드는 정상적으로
 		실행되고 객체 또한 문제없이 생성할 수 있다.
 		아래는 위의 코드를 컴파일했을 때의 모습이다.
 */
//class A{
//	public A() { }  // 생략된 디폴트 생성자
//}
//class B extends A{
//	public B()
//	{
//		super();	// 디폴트 생성자 및 부모클래스의 생성자를 호출하는 super()
//	}
//}
//
//class C{
//	public C(int x) {} // 개발자가 직접 정의한 인자 생성자
//}
//
//class D extends C{
//	public D(int y)
//	{
//		super(y);
//			/*
//		 	부모의 인자생성자를 호출하는 super()는 반드시 기술해야 한다.
//		 	개발자가 직접 생성자를 정의하게 되면 디폴트 생성자는 추가되지
//		 	않으므로 super(y)와 같이 반드시 부모의 인자 생성자를 
//		 	호출하는 문장을 삽입해야 한다.
//			 */
//	}
//}


class Account{
	private int money;
	public Account(int init) {
		money = init;
	}
	protected void depositMoney(int _money) {
		if(_money<0) {
			System.out.println("마이너스 금액은 입금처리 불가합니다.");
			return;
		}
		money += _money;
	}
	protected int getAccMoney() {
		return money;
	}
}

class SavingAccount extends Account{
	public SavingAccount(int initVal) {
		super(initVal);
	}
	public void saveMoney(int money) {
		depositMoney(money);
	}
	public void showAccountMoney() {
		System.out.println("지금까지의 누적금액:"+getAccMoney());
	}
}
public class E02PrivateInheritanceMain
{

	public static void main(String[] args)
	{
		SavingAccount sa = new SavingAccount(10000);
		
//		sa.money = 100000;
		sa.saveMoney(5000);
		sa.showAccountMoney();
		sa.saveMoney(-1000);
		sa.showAccountMoney();
		
		Account account = new Account(1000);
//		account.money = 1000;
	}

}
