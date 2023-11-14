package ex09package.study.util;

public class CommonUtil
{
	public static boolean isNumber(String strValue) {
		if(strValue.length()==0) //전달된 문자열이 빈 문자열인 경우
			return false;
		for(int i=0; i<strValue.length();i++) { //문자열의 길이만큼 반복
			int acode = strValue.codePointAt(i); // 각 인덱스에 해당하는 문자열 반환
			if(!(acode>='0' && acode<='9')) { //해당 문자가 숫자가 아니라면 false를 반환
				return false;
			}
		}
		return true;
	}
}
