package ex06array;

public class E02ArrayAndMethod
{

	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5}; // 배열을 선언과 동시에 초기화
		int[] ref; // 선언만한 상태
		System.out.println("초기화 직후 출력");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		/*
		 배열객체의 참조값(주소값)이 출력. 즉, 배열 자체가 전달되지 않음
		 */
		System.out.println("arr변수: " + arr);
		
		/*
		 arr은 참조값이지만, 7은 기본자료형인 int이므로 값 자체가 전달된다.
		 */
		ref = addAllArray(arr, 7);
		System.out.println("ref변수: " + ref);
		
		System.out.println("메소드 호출 후 출력");
		for(int i=0; i<ref.length; i++) {
			System.out.print(ref[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	static int[] addAllArray(int[] ar, int addVal) {
		for(int i=0; i<ar.length; i++) {
			ar[i] += addVal;
		}
		return ar;
	}

}
