package ex12inheritance;

public class DeChild extends DeParent{

	String stNumber;
	
	public DeChild(String name, int age, String stNumber) {
		super(name, age);
		this.stNumber = stNumber;
	}
	public void study() {
		// Name은 Private멤버이므로 getName을 사용
		System.out.println(getName() + "이(가) 공부한다.");
	}
	//오버라이드가 아님
	private void eat() {
		System.out.println("학생이 먹는다.");
	}
	@Override
	public String sleep() {
		System.out.println("학생이 잔다.");
		return null;
	}
	
	//오버로딩
	public int walk(int age) {
		System.out.println("나이가 " + age + "살인 학생인 산책한다.");
		return 0;
	}
	@Override
	public void excecise() {
		System.out.println("학생이 운동한다.");
	}
	@Override
	public void printParent() {
		super.printParent();
		System.out.printf(", 학번: %s\n", stNumber);
	}
	
	public static void staticMethod() {
		System.out.println("학생의 정적메소드");
	}
}
