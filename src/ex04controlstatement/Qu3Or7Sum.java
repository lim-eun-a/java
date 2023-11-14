package ex04controlstatement;

public class Qu3Or7Sum
{

	public static void main(String[] args)
	{
		int x=1;
		int sum=0;
		while(x<=100) {
			if(x%3==0 || x%7==0) {
				if(x%(3*7) != 0) {
					sum += x;
					System.out.print(x);
					if(x<99) { 
						System.out.print(" + ");
					}
				}
			}
			x++;
		}
		System.out.println(" = " + sum);
		System.out.println("3의 배수이거나 7의 배수인 숫자의 합: " + sum);
	}

}
