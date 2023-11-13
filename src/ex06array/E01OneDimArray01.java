package ex06array;

/*
 배열 : 여러개의 변수가 필요한 경우 사용
 -자바(객체 지향 프로그램)에서 배열을 객체를 통해 생성하므로 new를 사용
 -생성된 배열은 힙영역에 저장, 할당된 메모리의 주소값을 반환
 */
public class E01OneDimArray01
{

	public static void main(String[] args)
	{
		int[] numArr = new int[3];
		numArr[0] = 10;
		numArr[1] = 20;
		numArr[2] = 30;
		System.out.println("numArr의 0번방의 값:" + numArr[0]);
		System.out.println("numArr의 1번방의 값:" + numArr[1]);
		System.out.println("numArr의 2번방의 값:" + numArr[2]);
		System.out.println("배열명(numArr)=" + numArr); //반환된 주소값 출력
		System.out.println("=================================");
		
		int[] arrNumber = new int[40];
		for(int i=0; i<arrNumber.length; i++) { //배열의 각 원소를 초기화
			arrNumber[i] = i+10;
		}
		for(int i=0; i<40; i++) { // 디버깅
			System.out.println(i+"번방의 값=" + arrNumber[i]);
		}
		System.out.println("============================");
		
		/*
		 객체배열: 객체의 참조값을 저장할 목적으로 생성한 배열
		 */
		String[] strArr = new String[3];
		strArr[0] = "java";
		strArr[1] = "jsp";
		strArr[2] = "spring";
		for(int j=0; j<strArr.length; j++) {
			System.out.println(strArr[j]);
		}
		System.out.println("===========================");
		
		System.out.println("배열의 선언과 초기화");
		System.out.println("방법1: 배열의 선언 이후 초기화");
		int[] initArr = new int[1];
		initArr[0] = 100;
		System.out.println("initArr[0]=" + initArr[0]);
		
		System.out.println("방법2: 선언과 동시에 초기화1");
//		int[] initArr2 = new int[3] {1, 20, 300};
		int[] initArray2 = new int[] { 1, 20, 300};
		
		System.out.println("방법3: 초기값만으로 선언");
		int[] initArr3 = {11, 13, 17, 19, 23};
		int arrSum = 0;
		for(int x=0; x<initArr3.length; x++) {
			arrSum += initArr3[x];
		}
		System.out.println("배열요소의 합은="+ arrSum);
	}
}
