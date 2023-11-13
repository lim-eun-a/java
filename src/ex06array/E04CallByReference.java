package ex06array;
/*
 Call by Reference(참조에 의한 호출)
 */
public class E04CallByReference
{

	public static void main(String[] args)
	{
		int[] arr = {100, 200};
		System.out.println("[메인메소드]-Swap전 출력");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		callByReference(arr);
		
		System.out.println("[메인메소드]-Swap이후 출력");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	static void callByReference(int[] ref) { 
		int temp;
		temp = ref[0];
		ref[0] = ref[1];
		ref[1] = temp;
		
		System.out.println("[callByReference메소드]-Swap이후 출력");
		for(int i=0; i<ref.length; i++) {
			System.out.print(ref[i]+" ");
		}
		System.out.println();
	}

}
