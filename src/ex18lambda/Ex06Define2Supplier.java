package ex18lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Ex06Define2Supplier
{

	public static void main(String[] args)
	{
		Supplier<Integer> sup = () -> {
			Random random = new Random();
			return random.nextInt(100);
		};
		int rNum = sup.get();
		System.out.println("생성된 난수= " + rNum);
		
		List<Integer> list = makeRandomNum(sup, 10);
		System.out.println(list);
		
		System.out.println("### foreach문으로 출력2");
		for (Integer i : list)
		{
			System.out.printf("%d ", i);
		}
		System.out.println("\n### 이터레이터로 출력3");
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext())
		{
			System.out.print(itr.next() + " ");
		}
	}
	public static List<Integer> makeRandomNum(Supplier<Integer> s, int cnt){
		List<Integer> li = new ArrayList<Integer>();
		for(int i=1; i<=cnt; i++) {
			li.add(s.get());
		}
		return li;
	}

}
