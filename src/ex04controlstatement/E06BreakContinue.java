package ex04controlstatement;

public class E06BreakContinue
{

	public static void main(String[] args)
	{
//		while (true)
//		{
//			System.out.println("출력문1");
//			System.out.println("출력문2");
//			
//			break;
//			
//			System.out.println("출력문3"); // error
//			System.out.println("출력문4");
//			
//		}
		
//		int num = 10;
//		while (true)
//		{
//			System.out.println("출력문1");
//			System.out.println("출력문2");
//			
//			if(num==10) continue;
//			
//			System.out.println("출력문3");
//			System.out.println("출력문4");
//			
//		}
		
		int i=0;
		// true를 사용하면 무한루프가 됨.
		while(true) {
			/*
			 반복문 내에서 break, continue문을 사용할때는 반드시 조건문과 같이 사용해야 한다.
			 그렇지 않으면 해당코드 하위는 실행되지 않는 쓰레기코드가 되기 때문이다.
			 */
			i++;
			System.out.printf("[i가 %d일때]\n", i);
			
			System.out.println("continue이전 출력문");
			if(i%2==0) continue;
			System.out.println("continue이후 출력문");
			
			System.out.println("break이전 출력문");
			if(i==3) break;
			System.out.println("break이후 출력문");
		}
		
		
		for (int x=1;x<=5;x++) {
			System.out.println("x="+x);
			for(int y=1; y<=5; y++) {
				System.out.println("y="+y);
				if(y==3)
					break;
			}
		}
	}

}
