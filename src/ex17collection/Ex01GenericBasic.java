package ex17collection;

class Orange{
	int sugar;
	public Orange(int sugar) {
		this.sugar=sugar;
	}
	public void showInfo() {
		System.out.println("오렌지의 당도는 " + sugar+ " 입니다.");
	}
}

//오렌지 전용박스: 오렌지 객체만 저장할 수 있는 클래스
class OrangeBox{
	Orange item;
	//setter메서드
	public void store(Orange item) {
		this.item = item;
	}
	//getter메서드
	public Orange pullOut() {
		return item;
	}
}

//모든 과일 저장
class FruitBox{
	Object item;
	public FruitBox(Object item) {
		this.item = item;
	}
	//setter메서드
	public void store(Object item) {
		this.item= item;
	}
	//getter메서드
	public Object pullOut() {
		return item;
	}
}
public class Ex01GenericBasic
{

	public static void main(String[] args)
	{
		OrangeBox oBox1 = new OrangeBox();
		Orange orange1 = new Orange(10);
		oBox1.store(orange1);
		orange1 = oBox1.pullOut();
		orange1.showInfo();
		
//		oBox1.store("당도가 20인 오렌지");
		Orange orange2 = oBox1.pullOut();
		orange2.showInfo();
		
		FruitBox fBox1 = new FruitBox(new Orange(20));
		Orange orange3 = (Orange)fBox1.pullOut();
		orange3.showInfo();
		
		FruitBox fBox2 = new FruitBox("당도가 30인 오렌지");
		Orange orange4 = (Orange)fBox2.pullOut();
		orange4.showInfo();
	}
}
