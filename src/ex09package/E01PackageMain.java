/*
 패캐지선언부: 현재 작성하는 클래스의 위치를 결정하기 위한 선언
 */
package ex09package;

/*
 임포트선언부: 현재 작성중인 클래스에서 다른 패키지에 있는 클래스를 가져다 쓰기위한 선언
 사용할 클래스의 위치를 지정하는 것으로 생각
 패키지명과 클래스명을 함께 기술
 만약 해당 패키지 하위에 선언된 모든 클래스를 한꺼번에 쓰고 싶다면 
 import ex09package.study.util.*와 같이 선언
 */
import java.util.Date;
import ex09package.study.util.CommonUtil;

//import java.util.*;
//import ex09package.study.util.*; 

public class E01PackageMain
{

	public static void main(String[] args)
	{
		//클래스를 import한 후 객체생성
		Date utilDate = new Date();
		System.out.println("utilDate= " + utilDate);

		//패키지의 풀경로를 이용해서 객체생성
		java.sql.Date sqlDate =
				new java.sql.Date(utilDate.getTime());
		System.out.println("sqlDate= " + sqlDate);

		String strValue = "987654321";
		
		boolean isNum = CommonUtil.isNumber(strValue);
		if(isNum==true)
			System.out.println("문자열은 숫자입니다.");
		else
			System.out.println("숫자가 아닙니다.");
		System.out.println(ex09package.study.util.CommonUtil.isNumber("백20"));
	}
}
