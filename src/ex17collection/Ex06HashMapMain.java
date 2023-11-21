package ex17collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex06HashMapMain
{

	public static void main(String[] args)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		
		//객체저장
		System.out.println("name이라는 키값으로 저장된 이전의 값: " + map.put("name", "홍길동"));
		
		int number = 20;
//		map.put("age", number);
		map.put("age", String.valueOf(number));
		map.put("gender","남자" );
		map.put("address", "가산디지털단지");
		System.out.println("저장된 객체수: " + map.size());
		
		//중복저장
		System.out.println("name이라는 키값으로 저장된 이전의 값: " +map.put("name", "최길동"));
		System.out.println("키값으로 중복 저장 후 객체수: " + map.size());
		
		//출력하기(키 값을 알 때)
		System.out.println("키 값을 알 때: " + map.get("name"));
		
		//출력하기(키 값을 모를 때)
		Set<String> keys = map.keySet();
		System.out.println("[확장for문 적용]");
		for(String key:keys) {
			String value = map.get(key);
			System.out.println(String.format("%s:%s", key, value));
		}
		
		//이터레이터를 통한 출력
		System.out.println("[이터레이터 사용하기]");
		Set<String> keys2 = map.keySet();
		Iterator<String> it = keys2.iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = map.get(key);
			System.out.println(String.format("%s:%s", key, value));
		}
		
		//Value만 얻어와야 할 때
		System.out.println("[value값들만 출력하기]");
		Collection<String> values = map.values();
		for(String value:values) {
			System.out.println(value);
		}
		
		//존재유무확인
		System.out.println(map.containsKey("name") ? "name키 값 있다." : "name 키 값 없다.");
		System.out.println(map.containsKey("account") ? "account키 값 있다." : "account 키 값 없다.");
		System.out.println(map.containsKey("남자") ? "남자 있다." : "남자 없다.");
		System.out.println(map.containsKey("여자") ? "여자 있다." : "여자 없다.");
		
		//삭제
		System.out.println("삭제된 객체: " + map.remove("age"));
		System.out.println("[age키값을 삭제 후 출력]");
		for(String key:keys) {
			System.out.println(String.format("%s:%s", key, map.get(key)));
		}
		
		//전체 삭제
		map.clear();
		System.out.println("전체삭제 후 객체 수: " + map.size());
	}

}
