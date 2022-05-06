package day_05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class PostService {
	Scanner sc = new Scanner(System.in);
	PostRepository pr = new PostRepository();
	
	static Long id = 0L;
	
	void save(){
		String title = sc.next();
		String name = sc.next();
		String pass = sc.next();
		String cont = sc.next();
		LocalDate date = LocalDate.now();
		LocalDateTime dateTime = LocalDateTime.now();
		String time = dateTime.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss"));
		PostDTO pd = new PostDTO(++id, title, name, pass, cont, 0, time);
		pr.save(pd);
		System.out.println("글등록 완료");
	}
	public void findAll() {
		List<PostDTO> postList = pr.findAll();
		for(PostDTO m : postList) {
			System.out.println(m);
		}
	}
	public void view() {
		System.out.println("조회하기");
		Long aId = sc.nextLong();
		pr.view(aId);
		// 조회수처리
		pr.aupdateHits(aId);
	}
	
	
	public void update() {
		System.out.println("글번호");
		Long id = sc.nextLong();
		System.out.println("비밀번호");
		String pass = sc.next();
		Long qq = pr.chek(id, pass);
		if(qq != null) {
			System.out.println("제목과 내용을 수정하세요");
			System.out.println("제목수정");
			String title = sc.next();
			System.out.println("내용수정");
			String cont = sc.next();
			PostDTO updatePost = pr.update(id, title, cont);
			System.out.println("변경 후 제목 " + title);
			System.out.println("변경 후 내용 " + cont);
		}else {
			System.out.println("정보가 틀립니다");
		}
		
	}
	public void findById() {
		System.out.println("보고싶은 작성자 입력");
		String name = sc.next();
		List<PostDTO> findByIdList = pr.findById(name);
		if(findByIdList.size() > 0) {
			for(PostDTO p: findByIdList) {
				System.out.println(p);
			}
		}else {
			System.out.println("검색결과가 없습니다.");
		}
	}
	public void delete() {
		/*
		 * 1. 글번호, 비밀번호 입력 받아서 검증
		 * 2. 정보 맞으면 삭제처리
		 * 3. 목록 출력 메서드 호출
		 */
		System.out.println("삭제할 글번호 입력");
		Long id = sc.nextLong();
		System.out.println("비밀번호 입력");
		String pass = sc.next();
		pr.delete(id, pass);
		findAll();
		
	}
}








		
