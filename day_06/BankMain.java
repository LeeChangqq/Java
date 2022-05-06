package day_06;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		boolean run = true;
		BankService bs = new BankService();
		while(run) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("1.신규 고객 등록 | 2.잔액조회 | 3.입금 | 4.출금 | 5.거래내역확인 | 6.종료 |");
			System.out.println("-----------------------------------------------------------------------");
			System.out.print("선택> ");
			int a = sc.nextInt();
			if(a == 1) {
				bs.save();
			}else if(a == 2) {
				bs.findAll();
			}else if(a == 3) {
				bs.deposit();
			}else if(a == 4) {
				bs.withdraw();
			}else if(a == 5) {
				
			}else if(a == 6) {
				
			}
		}

	}

}
