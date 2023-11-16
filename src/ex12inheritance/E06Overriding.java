package ex12inheritance;
/*오버라이딩: 재정의, 오버라이딩되면 오버라이딩 된 자식쪽이 호출된다.*/
class Speaker{
	private int volumnRate;
	public void setVolumn(int vol) {
		volumnRate = vol;
	}
	public void showState() {
		System.out.println("스피커의 볼륨크기: " + volumnRate);
	}
}

class BaseSpeaker extends Speaker{
	private int baseRate;
	public void setBase(int bas) {
		baseRate = bas;
	}
	@Override
	public void showState() {
		super.showState();
		System.out.println("베이스의 볼륨크기: " + baseRate);
	}
}

public class E06Overriding
{

	public static void main(String[] args)
	{
		BaseSpeaker baseSpeaker = new BaseSpeaker();
		baseSpeaker.setVolumn(10);
		baseSpeaker.setBase(20);
		baseSpeaker.showState();
		
		System.out.println();
		
		Speaker speaker = new BaseSpeaker();
		speaker.setVolumn(30);
//		speaker.setBase(40);
		speaker.showState();
	}

}
