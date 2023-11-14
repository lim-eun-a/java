package ex07string;

public class E03StringBuilderBuffer
{

	public static void main(String[] args)
	{
		StringBuffer strBuf = new StringBuffer("AB");
		strBuf.append(25); //문자열의 끝에 새로운 문자열 연결
		strBuf.append("Y").append(true);
		System.out.println("strBuf= " + strBuf);
		
		strBuf.insert(2, false); //지정한 인덱스 위치에 문자열 삽입
		strBuf.insert(strBuf.length(), 'Z');
		System.out.println("strBuf= " + strBuf);
		
		System.out.println("String과 StringBuffer의 " + "참조값 비교");
		String str1 = "Java&JSP";
		String str2 = "Java&JSP";
		if(str1==str2)
			System.out.println("연결전: 주소값동일");
		else
			System.out.println("연결전: 주소값다름");
		
		str1 = str1 + "&Spring";
		if(str1==str2)
			System.out.println("연결후: 주소값동일");
		else
			System.out.println("연결후: 주소값다름");
		
		/*
		 문자열을 저장할 기본메모리는 16이지만 
		 저장할 문자열이 많아지면 자동으로 메모리를 확장
		 */
		StringBuffer buf = new StringBuffer();
		System.out.println("buf=" + buf);
		System.out.println("저장된 문자열크기:"+buf.length());
		System.out.println("기본버퍼크기:" + buf.capacity());
		
		buf.append("JAVA 공부중..");
		System.out.println("buf=" + buf);
		System.out.println("저장된 문자열크기:"+buf.length());
		System.out.println("기본버퍼크기:" + buf.capacity());
		
		buf.append("금일은 StringBuffer 학습중..!!");
		System.out.println("buf=" + buf);
		System.out.println("저장된 문자열크기:"+buf.length());
		System.out.println("기본버퍼크기:" + buf.capacity());
	}

}
