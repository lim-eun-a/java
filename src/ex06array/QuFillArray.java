package ex06array;

import java.util.Scanner;

public class QuFillArray
{

	public static void main(String[] args)
	{
		int[] A = new int[10];
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<A.length; i++) {
			System.out.print(i+1 + "번째 정수를 입력하세요: ");
			A[i] = scanner.nextInt();
		}
		System.out.println("순서대로 입력된 결과");
		for(int i=0; i<A.length; i++) {
			System.out.print(A[i]+ " ");
		}
		/* 홀수/짝수 구분입력 */
		int[] B = new int[10];
		int temp;
		int first=0;
		int last=9;
		for(int i=0; i<A.length; i++) {
			if(A[i]%2 != 0) {
				B[first] = A[i];
				first++;
			} else {
				B[last] = A[i];
				last--;
			}
		}
		System.out.println();
		
		System.out.println("홀수/짝수 구분 입력 결과");
		for(int i=0; i<B.length; i++) {
			System.out.print(B[i] + " ");
		}
	}

}
