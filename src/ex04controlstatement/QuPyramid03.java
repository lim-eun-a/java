package ex04controlstatement;

public class QuPyramid03
{

	public static void main(String[] args)
	{
		for(int x=1; x<=5; x++) {
			for(int y=1; y<=5-x; y++) {
				System.out.print(" ");
			}
			for(int y=1; y<=2*x-1; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
