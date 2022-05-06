package day_07;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		// key: 정수(int), value: 문자(String)
		
		Map<Integer, String> map1 = new HashMap<>(); // Class이름만 선언가능 Map 인터페이스 HashMap 구현하는 Class
		// 저장
		map1.put(1,"안녕");
		map1.put(2,"안녕하세요");
		// 가져오기
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		
		// key: 문자(String), value: 문자(String)
		// map2 선언하고 data를 저장해봅시다.
		Map<String, String> map2 = new HashMap<>();
		map2.put("가","ㅎㅎㅎ");
		map2.put("나","ㅋㅋㅋ");
		map2.put("가","ㅠㅠㅠ"); // 덮어씀
		System.out.println(map2.get("가"));
		System.out.println(map2.get("나"));
		
		// 반복문에 활용 keySet();
		for(String s: map2.keySet()) {
			System.out.println(map2.get(s));
		}
		
		// 삭제
		map2.remove("가");
		
		/*
		 * StudentDTO를 만들어서
		 * 이름, 전화번호, 전공, 필드를 만들고
		 * 
		 * main 메서드에서 student객체를 담을 수 있는 studentMap을 선언하여
		 * 두 학생의 정보를 map에 저장하고 반복문으로 출력해보기
		 */
	}

}
