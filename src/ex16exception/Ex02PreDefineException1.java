package ex16exception;

public class Ex02PreDefineException1
{

	public static void main(String[] args)
	{
		System.out.println("### ArrayIndexOutOfBOundsException ###");
		int[] intArr = new int[2];
		try {
			intArr[0] = 100;
			System.out.println("0번방은: " + intArr[0]);
			intArr[1] = 200;
			System.out.println("1번방은: " + intArr[1]);
			intArr[2] = 300;
			System.out.println("이방은: " + intArr[2]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 발생했어요");
			System.out.println("예외메세지: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("0번방 재출력: " + intArr[0]);
		System.out.println("### ArrayIndexOutOfObundsException발생 후 ###");
	}////end of main
}
