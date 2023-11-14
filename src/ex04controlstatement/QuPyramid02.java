package ex04controlstatement;

public class QuPyramid02
{

	public static void main(String[] args)
	{
		int x=1;
		do {
			int y=5;
			do {
				System.out.print("* ");
				y--;
			} while(y>=x);
			System.out.println();
			x++;
		} while(x<=5);
	}
}
