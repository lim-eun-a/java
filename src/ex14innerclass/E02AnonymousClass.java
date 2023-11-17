package ex14innerclass;

class Singer{
	String name;
	public Singer(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "이름:"+name;
	}
}
class GirlGroup extends Singer{
	String team;
	public GirlGroup(String name, String team) {
		super(name);
		this.team = team;
	}
	@Override
	public String toString() {
		return super.toString()+", 팀명:" + team;
	}
}

interface ISinger{
	public void dancing();
}

public class E02AnonymousClass
{

	public static void main(String[] args)
	{
		Singer s1 = new Singer("조용필");
		System.out.println(s1);
		
		Singer s2 = new GirlGroup("츄", "이달의소녀");
		System.out.println(s2);
		
		Singer s3 = new GirlGroup("아이린", "레드벨벳") {
			@Override
			public String toString() {
				return super.toString()+", 소속사:SM";
			}
		};
//		System.out.println(s3.mic);
		System.out.println(s3);
		
		ISinger s4 = new ISinger() {
			@Override
			public void dancing() {
				System.out.println("춤추는게 좋아");
			}
		};
		s4.dancing();
	}
}
