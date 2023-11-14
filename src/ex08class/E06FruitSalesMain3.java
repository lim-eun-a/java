package ex08class;
/*
 세번째 버전에서는 초기화 메서드를 생성자로 변경한다.
 */
//과일판매자를 추상화 한 클래스
class FruitSeller3{
	
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	
	public FruitSeller3(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
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
class FruitBuyer3{
	int myMoney;
	int numOfApple;
	
//	public FruitBuyer3(){}
	
	
	 //구매자가 판매자에게 사과를 구매하는 행위를 표현한 멤버메서드
	public FruitBuyer3(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	public void buyApple(FruitSeller3 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액:"+myMoney);
		System.out.println("[구매자]사과갯수:" + numOfApple);
	}
}
public class E06FruitSalesMain3
{

	public static void main(String[] args)
	{
		//판매자와 구매자 객체를 생성
		FruitSeller3 seller1 = new FruitSeller3(0,100,1000);
		FruitSeller3 seller2 = new FruitSeller3(0,80,500);
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
		
		System.out.println("구매행위가 일어나지 전의 상태");
		seller1.showSaleResult(); 
		seller2.showSaleResult(); 
		System.out.println();
		buyer.showBuyResult(); 
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		System.out.println();
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult(); 
		seller2.showSaleResult(); 
		System.out.println();
		buyer.showBuyResult(); 
	}
}
