package day_07;


import java.util.Scanner;

import day_05.MemberDTO;

public class MemberService {
	MemberRepository mr = new MemberRepository();
	Scanner sc = new Scanner(System.in);
	static Long id = 0L;

	public void save() {

		System.out.print("아이디: ");
		String mid = sc.nextLine();
		System.out.print("비밀번호: ");
		String pass = sc.nextLine();
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("나이: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("전화번호: ");
		String phone = sc.nextLine();
		MemberDTO mem = new MemberDTO(++id, mid, pass, name, age, phone);
		mr.save(id, mem);
	}

	public void login() {
		System.out.println("아이디: ");
		String mid = sc.nextLine();
		System.out.println("비밀번호: ");
		String pass = sc.nextLine();
		boolean loginResult = mr.login(mid, pass);
		if(loginResult) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
		}
	}

	public void findAll() {
		MemberDTO a = mr.findAll();
	}
	public void findById() {
		//findAll();
		System.out.print("조회할 번호입력: ");
		Long findId = sc.nextLong();
		sc.nextLine();
		MemberDTO member = mr.findById(findId);
		if(member == null) {
			System.out.println("조회결과가 없습니다!!");
		} else {
			System.out.println(member);
		}
	}
	public void update() {
		System.out.print("아이디: ");
		String memberId = sc.nextLine();
		System.out.print("비밀번호: ");
		String memberPassword = sc.nextLine();
		Long loginId = mr.loginCheck(memberId, memberPassword);
		// 로그인 체크가 되면 그 다음.. 
		// loginId: 로그인을 시도한 회원의 관리번호(id)
		if(loginId != null) {
			System.out.print("변경할 전화번호: ");
			String updateMobile = sc.nextLine();
			MemberDTO updateMember = mr.update(loginId, updateMobile);
			System.out.println("수정 후 회원정보: " + updateMember);
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
		}
	}
	public void delete() {
		findAll();
		System.out.print("삭제할 번호입력: ");
		Long deleteId = sc.nextLong();
		mr.delete(deleteId);
		findAll();
	}
}
