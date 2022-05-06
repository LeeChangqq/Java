package day_07;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MemberService ms = new MemberService();
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.회원가입 | 2.로그인 | 3.회원목록 | 4.상세조회 | 5.회원정보수정 | 6.회원삭제 | 7.종료");
			System.out.println("-----------------------------------------------------------------------");
			System.out.print("선택> ");
			int a = sc.nextInt();
			if(a == 1) {
				ms.save();
			}else if(a == 2) {
				ms.login();
			}else if(a == 3) {
				ms.findAll();
			}else if(a == 4) {
				ms.findById();
			}else if(a == 5) {
				ms.update();
			}else if(a == 6) {
				ms.delete();
			}else if(a == 7){
				System.out.println("종료");
			}
		}

	}

}
