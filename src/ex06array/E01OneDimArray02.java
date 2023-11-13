package ex06array;

import java.util.Random;

public class E01OneDimArray02
{

	public static void main(String[] args)
	{
		double rndNumber = Math.random();
		System.out.println("생성된 난수[실수]:" + rndNumber);
		int intNumber = (int)(Math.random()*100);
		System.out.println("생성된 난수[정수]:" + intNumber);
		
		Random random = new Random();
		System.out.println("생성된난수: " + random.nextInt());
		System.out.println("================================");
		
		/*
		 로또번호처럼 1~45 사이의 난수를 생성하는 방법
		 1. 0.xxx 형태의 난수를 생성한 후 정수로 변경하기 위해 100을 곱한다.
		 2. 45로 %연산하여 나머지를 구한다. 특정 정수는 45로 나누면 나머지는 0~44까지만 나옴
		 3. 0은 구간에 포함되지 않으므로 2번의 결과에 1을 더한다.
		 4. 정수의 결과값을 구하기 위해 int로 강제형변환한다.
		 */
		
		System.out.println("1~45사이의 난수생성:" + ((int)((Math.random()*100) % 45)+1));
		System.out.println("================================");
		
		System.out.println("크기가 6인 배열에 난수 입력");
		int[] lottoNum = new int[6];
		for(int i=0; i<lottoNum.length; i++) {
			lottoNum[i] = (int)((Math.random()*100)%45)+1;
		}
		for(int i=0; i<lottoNum.length; i++) {
			System.out.printf("%d ", lottoNum[i]);
		}
	}
}
