package ex05method;

import java.util.Scanner;

public class QuTemperature
{

	static double Celsius(double F) {
		return((F - 32) / 1.8);
	}
	
	static double Fahrenheit(double C) {
		return(1.8*C +32);
	}
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("섭씨를 입력하세요: ");
		double Cel = scanner.nextDouble();
		System.out.println("화씨 = " + Fahrenheit(Cel));
		System.out.print("화씨를 입력하세요: ");
		double Fah = scanner.nextDouble();
		System.out.println("섭씨 = " + Celsius(Fah));
	}

}
