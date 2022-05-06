package day_08;

import java.util.*;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			List<String> list = new ArrayList<>();
			list.add("안녕");
			list.add("하이");
			for (int i = 0; i <= list.size(); i++) {
				System.out.println(list.get(i));
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException 예외발생!!!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception 예외 발생!!!");
		} finally {
			System.out.println("여기는 예외 발생하든 안하든 실행");
		}
		System.out.println("리스트 출력 끝");

	}

}
