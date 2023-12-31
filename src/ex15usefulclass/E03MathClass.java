package ex15usefulclass;

public class E03MathClass extends Object
{

	public static void main(String[] args)
	{
		System.out.println("원주율: " + Math.PI);
		
		float f = -3.14f;
		double d = -100.9;
		int num = -10;
		
		System.out.println("### 절대값 ###");
		System.out.println("Math.abs: " + Math.abs(f));
		System.out.println("Math.abs: " + Math.abs(d));
		System.out.println("Math.abs: " + Math.abs(num));
		
		System.out.println("### 올림 ###");
		System.out.println("Math.ceil: " + Math.ceil(3.4));
		System.out.println("Math.ceil: " + Math.ceil(-3.4));
		System.out.println("Math.ceil: " + Math.ceil(3.9));
		
		System.out.println("### 내림 ###");
		System.out.println("Math.floor: " + Math.floor(3.4));
		System.out.println("Math.floor: " + Math.floor(-3.4));
		System.out.println("Math.floor: " + Math.floor(3.9));
		
		System.out.println("### 반올림 ###");
		System.out.println("Math.round: " + Math.round(3.49999));
		System.out.println("Math.round: " + Math.round(3.54444));
		System.out.println("Math.round: " + Math.round(-1.4));
		System.out.println("Math.round: " + Math.round(-1.5));
		System.out.println("Math.round: " + Math.round(-3.51));
		
		System.out.println("### 최대/최소 ###");
		System.out.println("Math.max: " + Math.max(100, 99));
		System.out.println("Math.min: " + Math.min(100, 99));
		
		System.out.println("### 난수 ###");
		System.out.println((int)(Math.random()*45)+1);
		
		System.out.println("### 거듭제곱 ###");
		System.out.println("2의 10승은? " + Math.pow(2, 10));
		
	}

}
