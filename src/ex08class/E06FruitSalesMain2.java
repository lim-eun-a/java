package ex08class;

//과일판매자를 추상화 한 클래스
class FruitSeller2{
	
	//멤버변수: 보유한 사과의 개수(재고수량), 판매수익금
	int numOfApple;
	int myMoney;
	int apple_price;
	
	// 초기화 메서드를 선언하여 객체 생성 후 다양한 형태의 초기화가 가능
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}
	
	public int saleApple(int money) {
		int num = money / apple_price;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은사과갯수:" + numOfApple);
		System.out.println("[판매자]판매수익:" + myMoney);
	}
}

//구매자를 추상화한 클래스
class FruitBuyer2{
	//멤버변수: 보유금액, 구매한 사과의 개수
	int myMoney = 5000;
	int numOfApple = 0;
	
//	public FruitBuyer2(){}
	
	/*
	 구매자가 판매자에게 사과를 구매하는 행위를 표현한 멤버메서드
	 */
	
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	//구매자의 현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+myMoney);
		System.out.println("[구매자]사과갯수:" + numOfApple);
	}
}
public class E06FruitSalesMain2
{

	public static void main(String[] args)
	{
		//판매자와 구매자 객체를 생성
		FruitSeller2 seller1 = new FruitSeller2();
		seller1.initMembers(0,100,1000);
		
		FruitSeller2 seller2 = new FruitSeller2();
		seller2.initMembers(0,80,500);
		
		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.initMembers(10000, 0);
		
		System.out.println("구매행위가 일어나지 전의 상태");
		seller1.showSaleResult(); // 사과 100개, 금액 0원
		seller2.showSaleResult(); //사과 80개, 금액 0원
		System.out.println();
		buyer.showBuyResult(); //사과 0개, 금액 5000원
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		System.out.println();
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult(); //사과 95개, 금액 5000원
		seller2.showSaleResult(); //사과 70개, 금액 5000원
		System.out.println();
		buyer.showBuyResult(); //사과 15개, 금액 0원
		
	}

}
