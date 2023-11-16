package ex12inheritance;
/*
 가변인자
 */
public class E08VariableArgument
{
//	static int getTotal(int param) {
//		int total = 0;
//		total += param;
//		return total;
//	}
//	
//	static int getTotal(int param1, int param2) {
//		int total = 0;
//		total += (param1+param2);
//		return total;
//	}
//	static int getTotal(int param1, int param2, int param3) {
//		int total = 0;
//		total += (param1+param2+param3);
//		return total;
//	}
	
	static int getTotal(int ... param) {
		int total = 0;
		for(int i=0; i<param.length; i++) {
			total += param[i];
		}
		return total;
	}
	
	public static void main(String[] args)
	{
		System.out.println("getTotal(args1)호출:" + getTotal(10));
		System.out.println("getTotal(args1, args2)호출:" + getTotal(10,20));
		System.out.println("getTotal(args1, args2, args3)호출:" + getTotal(10,20,30));
		
		System.out.println("getTotal(매개변수6개)호출:" + getTotal(10,20,30,40,50,60));
//		System.out.println("getTotal(args1, args2)호출:" + getTotal(10,20.3));
	}

}
