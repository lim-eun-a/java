package ex04controlstatement;

public class E05For
{

	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++) {
			System.out.println("i=" + i);
		}

		/*
		 시나리오] 1~100까지의 합을 구하는 프로그램을 for문을 이용하여 작성하시오.
		 */
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합: " + sum);
		
		/*
		 시나리오] for문을 이용하여 1~10까지의 정수중 2의 배수의 합을 
		 구하는 프로그램을 작성하시오.
		 */
		/*
		 방법: : 1~10까지 10번 반복해서 if문을 통해 2의 배수를 찾은 후 누적해서 더한다.
		 */
		int total = 0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				total += i;
			}
		}
		System.out.println("1~10 사이 2의 배수의 합(방법1):" + total);
		
		/*
		 방법2: if문 없이 초기값을 0부터 시작하여 2씩 증가시킨다.
		 */
		total=0;
		for(int i=0; i<=10; i+=2) {
			total += i;
		}
		/*
		 for문에서는 대부분 증감연산자(++,--)를 사용하지만, 필요에 따라 
		 복합대입연산자를 통해 수치를 증감시킬수도 있다.
		 */
		System.out.println("1~10사이 2의 배수의 합(방법2):" + total);
		
		
		/*
		for문으로 무한루프를 만들때는 아래와 같이 ;;으로 표현한다.
		 */
		int a=1;
		for(;;) {
			System.out.println("나는 for문으로 만든 무한루프입니다." + a);
			a++;
			// 만약 탈출조건이 없으면 무한루프이므로 오류가 발생한다.
			if(a==100) break;
		}
		
		for(int j=0; j<=5; j++){
			System.out.println("어랏...나는 누구? 여긴 어디?");
		}
		
		//j는 지역변수(해당 지역을 벗어나면 즉시 소멸되는 특징을 가지고 있다.)이다.
//		System.out.println("위 for문에서 선언한 변수 j="+j);
		System.out.println("위 main함수 지역에서 선언한 변수 total="+total);
		
		
		int i=0; //전체변수
		for(; i<=5 ; i++) {
			System.out.println("for문 안에서의 i값="+i);
		}
		System.out.println("for문 밖에서의 i값="+i);
		
		
		/*
		 연습문제1] 구구단을 출력하는 프로그램을 for문으로 작성하시오.
		 */

		System.out.println("행방향의 구구단 출력하기");
		//단에 해당하는 for문(2~9단까지 증가한다.)
		for(int dan=2; dan<=9; dan++) {
			for(int su=1; su<=9; su++){
				System.out.printf("%-2d*%-2d=%2d ", dan, su, (dan*su));
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 연습문제1-2] 구구단을 출력하는 프로그램을 for문으로 작성하시오.
		 */
		for(int su=1; su<=9; su++)  {
			for(int dan=2; dan<=9; dan++){
				System.out.printf("%-2d*%-2d=%2d ", dan, su, (dan*su));
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*
		 연습문제2] 다음의 출력결과를 보이는 for문을 작성하시오
		 출력결과
		   0 0 0 1
		   0 0 1 0
		   0 1 0 0
		   1 0 0 0
		 해법: x와 y를 더해서 5가 될 때 1을 출력한다.
		 */
		
		for(int x=1; x<=4; x++) {
			for(int y=1; y<=4; y++) {
				if(x+y==5) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
	}

}







