package ex06array;

/*
 Call by Value(값에 의한 호출)
 : 매개변수를 통해 값을 전달할 때 메모리의 "복사"를 통해 값이 전달된다.
 */
public class E03CallByValue
{

	public static void main(String[] args)
	{
		int first=100, second=200;
		
		System.out.println("[main메소드안-호출전]"+ "first=" + first + ", second=" + second);
		
		callByValue(first, second);
		
		System.out.println("[main메소드안-호출전]"+ "first=" + first + ", second=" + second);
	}
	
	public static void callByValue(int fNum, int sNum) {
		/*
		 Swap(교환): 두 개의 변수가 할당받은 값을 서로 교환하는 것
		 */
		int temp;
		temp=fNum;
		fNum=sNum;
		sNum=temp;
		
		System.out.println("[callByValue메소드안]" + "first=" + fNum+ ", second=" + sNum);
	}

}
