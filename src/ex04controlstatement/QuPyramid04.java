package ex04controlstatement;

public class QuPyramid04
{

	public static void main(String[] args)
	{
		for(int x=1; x<=9; x++) {
			if(x<=5) {
				for(int y=1; y<=x; y++) {
					System.out.print("* ");
				}
				System.out.println();
			} else {
				for(int y=9; y>=x; y--) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}
