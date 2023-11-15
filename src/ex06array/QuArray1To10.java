package ex06array;

import java.util.Arrays;

public class QuArray1To10
{

	public static void main(String[] args)
	{
		int[] A = new int[10];
		System.out.println("초기화된 배열 요소");
		for(int i=0; i<A.length; i++) {
			A[i] = i+1;
			System.out.print(A[i]+" ");
		}
		System.out.println();
		
		int Sum=0;
		for(int i=0; i<A.length; i++) {
			Sum += A[i];
		}
		System.out.println("배열 전체 요소의 합: " + Sum);
	}

}
