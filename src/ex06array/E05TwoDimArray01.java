package ex06array;

public class E05TwoDimArray01
{

	public static void main(String[] args)
	{
		/*
		 행3, 열4인 배열 생성. 초기화할 원소가 없는 부분은 null(아무것도 없는 값)로 채워진다.
		 */
		int[][] arr= {
				{1,2}, 
				{3,4,5},
				{6,7,8,9}
		};
		
		int[] arr2 = new int[5];
		arr2[0] = 1;
		// 배열명을 출력했을 때 주소값이 나온다.
		System.out.println("arr2 배열명 출력: " + arr2);
		// 0번 인덱스는 1이 출력된다.
		System.out.println("arr2[0] 배열명 출력: " + arr2[0]);
		// 3번 인덱스(초기화 하지 않는 원소)는 0이 출력된다.		
		System.out.println("arr2[3] 배열명 출력: " + arr2[3]);
		
		
		System.out.println("배열의 세로크기: " + arr.length);
		//배열의 참조값 출력
		System.out.println("배열명이 가진값 출력(arr): " + arr);
		
		//각 행의 크기를 출력하기 위해 반복한다.
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d행의 크기: %d\n", i, arr[i].length);
			// 각 행의 참조값을 출력
			System.out.printf("%d행 출력: %s\n", i, arr[i]);
		}
		
		System.out.println("배열 출력하기");
		System.out.println("arr[0][1]=" + arr[0][1]);
//		System.out.println("arr[0][3]=" + arr[0][3]); //예외 발생(null이므로 출력할 수 없다.)
		/*
		 ArrayIndexOutOfDoundsException 예외가 발생한다.
		 즉, 배열의 index를 초과했다는 의미이다.
		 */
	}

}
