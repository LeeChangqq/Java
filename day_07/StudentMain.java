package day_07;

import java.util.HashMap;
import java.util.Map;

public class StudentMain {

	public static void main(String[] args) {
		Map<Long, StudentDTO> map1 = new HashMap<>();
		
		Long id = 1L;
		String name = "학생1";
		String num = "010-7894-1234";
		String ma = "컴공";
		StudentDTO student = new StudentDTO(id, name, num, ma);
		map1.put(id, student);
		id = 2L;
		name = "학생2";
		num = "010-2222-1234";
		ma = "전자";
		student = new StudentDTO(id, name, num, ma);
		map1.put(id, student);
		for(Long i: map1.keySet()) {
			System.out.println(i);
			System.out.println(map1.get(i));
			System.out.println(map1.get(i).getName());
			
		}
		
	}

}
