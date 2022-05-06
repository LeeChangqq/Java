package day_09;

import java.util.*;

public class MemberServiceMap implements MemberServiceInterface {
	Scanner scan = new Scanner(System.in);
	static Long id = 0L;
	MemberRepositoryMap mr = new MemberRepositoryMap();
	@Override
	public void save() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPassword = scan.next();
		System.out.print("이름: ");
		String memberName = scan.next();
		System.out.print("나이: ");
		int memberAge = scan.nextInt();
		System.out.print("전화번호: ");
		String memberMobile = scan.next();
		MemberDTO newMember = new MemberDTO(++id, memberId, memberPassword, memberName, memberAge, memberMobile);
		if (mr.save(newMember) == null) {
			System.out.println("가입을 축하합니다^^");
		} else {
			System.out.println("가입이 거절되었습니다.");
		}
	}
	@Override
	public void login() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPassword = scan.next();
		boolean loginResult = mr.login(memberId, memberPassword);
		if (loginResult) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
		}
	}
	@Override
	public void findAll() {
		Map<Long, MemberDTO> memberMap = mr.findAll();
		for (Long key : memberMap.keySet()) {
			System.out.println(memberMap.get(key));
		}
	}
	@Override
	public void findById() {
		findAll();
		System.out.print("조회할 번호입력: ");
		Long findId = scan.nextLong();
		MemberDTO member = mr.findById(findId);
		if (member == null) {
			System.out.println("조회결과가 없습니다!!");
		} else {
			System.out.println(member);
		}
	}
	@Override
	public void update() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPassword = scan.next();
		Long loginId = mr.loginCheck(memberId, memberPassword);
		if (loginId != null) {
			System.out.print("변경할 전화번호: ");
			String updateMobile = scan.next();
			MemberDTO updateMember = mr.update(loginId, updateMobile);
			System.out.println("수정 후 회원정보: " + updateMember);
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
		}
	}
	@Override
	public void delete() {
		findAll();
		System.out.print("삭제할 번호입력: ");
		Long deleteId = scan.nextLong();
		mr.delete(deleteId);
		findAll();
	}
}
