package day_06;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Scanner;
public class BankService {
	BankRepository cld = new BankRepository();
	Scanner sc =new Scanner(System.in);
	static Long id = 0L;
	static Long id1 = 0L;
	public void save(){
		String clientName = sc.next();
		String clientPass = sc.next();
		LocalDateTime dateTime = LocalDateTime.now();
		String clienttime = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		String clientNum = sc.next();
		ClientDTO cld1 = new ClientDTO(++id, clientName, clientPass, clienttime, 0, clientNum);
		boolean savecld = cld.save(cld1);
		if(savecld) {
			System.out.println("가입완료");
		}else {
			System.out.println("가입실패");
		}
	}
	public void findAll() {
		String acc = sc.next();
		int client = cld.findAll(acc); 
		System.out.println(client);
	}
	
	
	public void deposit() {
		System.out.println("계좌번호 입력");
		String bankAcc = sc.next();
		boolean bank = cld.check(bankAcc); 
		System.out.println("입금금액");
		int dep = sc.nextInt();
		ClientDTO dep1 = cld.deposit(dep, bankAcc); 
		
		if(bank) {
			System.out.println(dep1);
		}else {
			System.out.println("계좌번호가 틀립니다.");
		}
		
	}
	public void withdraw() {
		
		System.out.println("계좌번호 입력");
		String bankAcc = sc.next();
		boolean bank = cld.check(bankAcc); 
		System.out.println("비밀번호 입력");
		String pass = sc.next();
		ClientDTO pass1 = cld.check2(pass); 
		System.out.println("출금금액");
		int wit = sc.nextInt();
		ClientDTO wit1 = cld.withdraw(bankAcc, pass, wit); 
		int find = cld.findAll(bankAcc);
		if(bank == false && pass1 == null) {
			System.out.println("계좌번호가 틀립니다.");
		}
		if(wit > find) {
			System.out.println("잔액이 부족합니다.");
		}else {
			System.out.println(wit1);
		}
	}
}

		
		
		





		
