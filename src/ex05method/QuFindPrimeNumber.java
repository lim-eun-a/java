package ex05method;

public class QuFindPrimeNumber
{
	// 인수로 전달된 정수가 소수인지 판단하여 true/false를 반환한다.
	public static boolean isPrimeNumber(int num) {
		// 정수 1은 소수가 아니므로 무조건 false를 반환한다.
		if(num==1) {
			return false;
		} 
		/*
		 만약 7이라면 1과 7로는 무조건 나눠서 떨어지므로 
		 소수검사를 위해 2~6까지만 나눠보면 된다.
		 따라서 정수 n이라면 2부터 n-1까지만 검사하면 됨
		 */
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				/*
				 만약 숫자를 나누어 떨어지는 것이 발견되었다면 
				 이미 소수가 아니므로 뒷부분은 확인할 필요가 없다.
				 따라서 즉시 false를 반환하고 메서드를 종료한다.
				 */
				return false;
			}
//			return true; 
		}
		// 위 반복문을 벗어났다면 소수이므로 true를 반환한다.
		return true;
	}
	
	
	public static void main(String[] args)
	{
		for(int i=1; i<=100; i++) {
			boolean Number = isPrimeNumber(i);
			if(Number==true) {
				System.out.println(i);
			}
		}
	}

}
