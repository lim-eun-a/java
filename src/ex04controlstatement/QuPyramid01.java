package ex04controlstatement;

public class QuPyramid01
{

	public static void main(String[] args)
	{
		int x=1;
		while(x<=5) {
			int y=1;
			while(y<=x) {
				System.out.print("* ");
				y++;
			}
			System.out.println();
			x++;
		}
	}
}
