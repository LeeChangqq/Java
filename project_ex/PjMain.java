package project_ex;

import java.util.Scanner;

public class PjMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		PjService ps = new PjService();
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.회원 등록 | 2.회원 조회 | 3.로그인 | 4.종료");
			System.out.println("------------------------------------------");
			System.out.print("선택> ");
			int a = sc.nextInt();
			if(a == 1) {
				ps.save();
			}else if(a == 2) {
				ps.findAll();
			}else if(a == 3) {
				ps.login();
			}else if(a == 4) {
				run = false;
			}
		}

	}

}
