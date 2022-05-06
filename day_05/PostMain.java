package day_05;

import java.util.Scanner;

public class PostMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PostService ps = new PostService();
		boolean run = true;
		
		while (run) {
			System.out.println("1. 글작성 2. 글목록 3. 글조회 4. 글수정 5. 글검색 6. 글삭제 7. 종료");
			int a = sc.nextInt();
			if(a == 1) {
				ps.save();
			}else if(a == 2) {
				ps.findAll();
			}else if(a == 3) {
				ps.view();
			}else if(a == 4) {
				ps.update();
			}else if(a == 5) {
				ps.findById();
			}else if(a == 6) {
				ps.delete();
			}else if(a == 7) {
				System.out.println("종료하겠습니다.");
				run = false;
			}
		}

	}

}
