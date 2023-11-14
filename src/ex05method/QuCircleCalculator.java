package ex05method;

import java.util.Scanner;

public class QuCircleCalculator
{

	static double circleArea(double r) {
		return (3.14 * r * r);
	}
	static double circleRound(double r) {
		return (2 * 3.14 * r);
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("원의 반지름을 입력하세요: ");
		double r = scanner.nextDouble();
		System.out.println("원의 넓이(" + r + "): " + circleArea(r));
		System.out.printf("원의 둘레(" + r + "): " + circleRound(r));
	}

}
