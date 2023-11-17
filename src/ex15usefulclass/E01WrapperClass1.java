package ex15usefulclass;

public class E01WrapperClass1
{

	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 20;
		int result = num1 + num2;
		System.out.println("result=" + result);
		
		Integer n10Obj = new Integer(10);
		Integer n20Obj = new Integer(num2);
		int result2 = n10Obj.intValue() + n20Obj.intValue();
		System.out.println("result2=" + result2);
		
		Integer resultObj = new Integer(result2);
		System.out.println("결과값을 byte형 값으로 변경: " + resultObj.byteValue());
		System.out.println("결과값을 이진수로 변경: " + Integer.toBinaryString(result2));
		
		Integer numObj1 =100;
		Integer numObj2 = 200;
		int num3 = numObj1;
		int result3 = numObj1 - numObj2;
		System.out.println("오토언박싱 이후 연산결과:" + result3);
		
		System.out.println("int형의 최대값: " + Integer.MAX_VALUE);
		System.out.println("int형의 최소값: " + Integer.MIN_VALUE);
		System.out.println("10을 2진수로: " + Integer.toBinaryString(10));
		System.out.println("10을 8진수로: " + Integer.toOctalString(10));
		System.out.println("10을 16진수로: " + Integer.toHexString(10));
	}

}
