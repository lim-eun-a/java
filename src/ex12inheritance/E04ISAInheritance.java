package ex12inheritance;

/*
 Is-A관계
 	: X is a Y => X는 Y의 일종이라도 표현가능한 관계
 	- 노트북은 컴퓨터의 일종이다.
 	-휴대폰은 전화기의 일종이다.
 	이와같이 Is-A의 관계가 성립하는 개체를 상속으로 표현하기에 적합하다.
 */
//컴퓨터: 기본적인 컴퓨팅 환경을 제공하여 입력된 내용을 계산한다.
class Computer{
	
	String owner;
	
	//디폴트 생성자
	//public Computer(){} 
		// 개발자가 임의로 생성자를 추가하면 디폴트 생성자는 추가되지 않는다.
	
	public Computer(String name) {
		owner = name;
	}
	private void keyboardTouch() {
		System.out.println("키보드를 통해서 입력한");
	}
	private void calculate() {
		System.out.println("요청된 내용을 계산한다.");
	}
	public void calculateFunc() { //캡슐화
		keyboardTouch();
		calculate();
	}
}

class NotebookComputer extends Computer{
	
	int battary;
	
	public NotebookComputer(String name, int initCharge) {
		super(name); // 삭제하면 에러발생
		battary = initCharge;
	}
	public void charging() {
		battary +=5;
	}
	public void movigCal() {
		if(battary <1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		System.out.println("이동하면서 ");
//		keyboardTouch();
//		calculate();
		calculateFunc();
		
		battary -=1; //배터리 차감
	}
}

class TableNotebook extends NotebookComputer{
	
	String registPencil;
	
	public TableNotebook(String name, int initCharge, String pen) {
		super(name, initCharge);
		registPencil = pen;
	}
	public void write(String penInfo) {
		if(battary<1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		if(registPencil.compareTo(penInfo)!=0) {
			System.out.println("등록된 펜이 아닙니다.");
			return;
		}
		movigCal();
		System.out.println("스크린에 펜으로 그림을 그린다.");
		battary -=1;
	}
}
public class E04ISAInheritance
{

	public static void main(String[] args)
	{
		NotebookComputer noteBook = new NotebookComputer("공유", 5);
		TableNotebook tablet = new TableNotebook("이동욱", 5, "ISE-1234");
		
		System.out.println("==노트북컴퓨터사용==");
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		
		System.out.println("==ISE-1234 펜으로 테블릿사용==");
		tablet.write("ISE-1234");
		
		System.out.println("==XYZ-9876 펜으로 테블릿사용==");
		tablet.write("XYZ-9876");
	}

}
