package ex08class;

/*
 시나리오] 은행계좌를 추상화 해보자.
 멤버변수: 예금주
 			계좌번호
 			잔고
 멤버메서드 : 입금하다
 			출금하다
 			계좌잔고조회
 조건1: 입금은 무제한으로 가능함
 조건2: 잔고가 부족한 경우에는 출금불능 처리
 */
//은행계좌를 추상화하여 만든 클래스
class Account {
	//멤버변수
	String name;
	//계좌번호는 연산의 대상이 아니므로 String으로 선언
	String accountNumber;
	//잔고의 경우 입출금을 위한 연산이 필요하므로 int로 선언
	int balance;
	
	//입금처리: 매개변수로 전달된 money원만큼 잔고에 합산한다.
	void deposit(int money) {
		balance += money;
		System.out.println(money + "원이 입금됨");
		System.out.println("잔액: " + balance);
	}
	
	//출금처리
	void withdraw(int money) {
		//출금을 위해 잔고와 출금액을 비교하여 처리
		if(balance >= money) {
			// 잔고가 충분하다면 money원만큼 차감
			balance -= money;
			System.out.println("계좌에서 " + money+ "원이 출금됨");
			System.out.println("잔액: " + balance);
		}
		else {
			//잔고보다 출금액이 크다면 출금할 수 없다.
			System.out.println("잔고부족으로 출금불능");
			System.out.println("잔액: " + balance);
		}
	}
	
	//계좌조회: 예금주와 현재 잔고 등을 출력
	void showAccount() {
		System.out.println("계좌주:" + name);
		System.out.println("계좌번호:" + accountNumber);
		System.out.println("잔고:" + balance);
	}
	
	//초기화메서드: 멤버변수를 매개변수로 전달된 값을 통해 초기화
	void init(String n, String a, int b) {
		name = n;
		accountNumber = a;
		balance = b;
	}
}

public class E04AccountMain
{

	public static void main(String[] args)
	{
		Account account = new Account();
		//초기화 메서드를 통해 객체를 초기화
		account.init("장동건", "111-21-8888", 1000);
		account.deposit(9000);
		account.withdraw(5000);
		account.showAccount();
		
		Account account2 = new Account();
		//멤버변수에 직접 접근하여 객체를 초기화
		account2.name="정우성";
		account2.accountNumber = "123-45-67890";
		account2.balance = 900000;
		account2.showAccount();
	}

}
