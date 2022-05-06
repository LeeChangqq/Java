package project_ex;

import java.util.Scanner;

public class PjService {
	Scanner sc = new Scanner(System.in);
	static Long id = 0L;
	static Long rank1 = 0L;
	PjRepository pr = new PjRepository();

	public void save() {
		System.out.print("아이디 입력: ");
		String uId = sc.nextLine();
		System.out.print("비밀번호 입력: ");
		String uPass = sc.nextLine();
		System.out.print("이름 입력: ");
		String uName = sc.nextLine();
		System.out.print("은행이름 입력: ");
		String bName = sc.nextLine();
		System.out.print("계좌번호 입력: ");
		String bNum = sc.nextLine();
		System.out.print("계좌 비밀번호 입력: ");
		int bPass = sc.nextInt();
		sc.nextLine();
		if (!checkId(uId) && !checkNum(bNum)) {
			PjDTO p = new PjDTO(++id, uId, uPass, uName, bName, bNum, bPass);
			boolean saveResult = pr.save(p);
			Pj1DTO pl1 = new Pj1DTO(id, uId, 0L, "c", 0L, 0, 0);
			Pj2DTO pl2 = new Pj2DTO(uId, 0);
			if (saveResult) {
				System.out.println("회원가입 축하드립니다");
				pr.save1(pl1);
				pr.save2(pl2);
			}
		} else if (checkId(uId) && !checkNum(bNum)) {
			System.out.println("중복된 아이디입니다. 처음부터 다시 진행해주세요");
		} else if (!checkId(uId) && checkNum(bNum)) {
			System.out.println("중복된 계좌입니다. 처음부터 다시 진행해주세요");
		} else {
			System.out.println("다시 진행해 주세요");
		}
	}

	public void findAll() {
		pr.findAll();
	}

	public void deposit(String uId) {
		System.out.print("은행 입력: ");
		String bName = sc.nextLine();
		System.out.print("계좌번호 입력: ");
		String bNum = sc.nextLine();
		System.out.print("계좌 비밀번호 입력: ");
		int bPass = sc.nextInt();
		sc.nextLine();
		System.out.print("입금액 입력: ");
		long money = sc.nextLong();
		boolean run = pr.deposit(uId, bName, bNum, bPass, money);
		if (run) {
			pr.findById(uId);
		} else {
			System.out.println("일치하는 계좌가 없습니다.");

		}

	}

	public void cPoint(String uId) {

		System.out.print("컴퓨터 포인트 입력: ");
		long money = sc.nextLong();
		boolean run = pr.cPoint(uId, money);
		if (run) {
			pr.findById(uId);
		} else {
			System.out.println("일치하는 아이디가 없습니다.");

		}
	}

	public void login() {
		System.out.print("아이디: ");
		String uId = sc.nextLine();
		System.out.print("비밀번호: ");
		String uPass = sc.nextLine();
		boolean loginResult = pr.login(uId, uPass);

		if (loginResult) {
			boolean run = true;
			while (run) {
				System.out.println("------------------------------------------------------------------------------");
				System.out.println("1.포인트 충전 | 2. 컴퓨터 포인트 설정 | 3.가위바위보 | 4.승률 보기 | 5. 랭킹 | 6.로그아웃 ");
				System.out.println("------------------------------------------------------------------------------");
				System.out.print("선택> ");
				int selectNumber = sc.nextInt();
				sc.nextLine();
				if (selectNumber == 1) {
					deposit(uId);

				} else if (selectNumber == 2) {
					cPoint(uId);
				} else if (selectNumber == 3) {
					int p = pr.aa1(uId);
					if (p == 0) {
						System.out.println("포인트가 없습니다.");
					} else if (p == 1) {
						System.out.println("컴퓨터 없습니다.");
					} else if (p == 2) {
						System.out.println(uId + "님의 " + "포인트가 없습니다.");
					} else if (p == 3) {
						System.out.println("배팅할 포인트를 입력하세요: ");
						long money = sc.nextLong();
						sc.nextLine();
						System.out.println("가위바위보!!!");
						char a = sc.next().charAt(0);
						char q = pr.aa(uId, money, a);
						pr.hits(uId);
						if (q == '묵') {
							if (a == '묵') {
								System.out.println(uId + "님은 " + a + "를 냈습니다");
								System.out.println("무승부");
								System.out.println("컴퓨터는 " + q + "를 냈습니다");
								pr.findById(uId);
							} else if (a == '찌') {
								System.out.println(uId + "님은 " + a + "를 냈습니다");
								System.out.println("짐");
								System.out.println("컴퓨터는 " + q + "를 냈습니다");
								pr.findById(uId);
							} else if (a == '빠') {
								System.out.println(uId + "님은 " + a + "를 냈습니다");
								System.out.println("이김");
								System.out.println("컴퓨터는 " + q + "를 냈습니다");
								pr.findById(uId);
							}

						} else if (q == '찌') {
							if (a == '묵') {
								System.out.println(uId + "님은 " + a + "를 냈습니다");
								System.out.println("이김");
								System.out.println("컴퓨터는 " + q + "를 냈습니다");
								pr.findById(uId);
							} else if (a == '찌') {
								System.out.println(uId + "님은 " + a + "를 냈습니다");
								System.out.println("무승부");
								System.out.println("컴퓨터는 " + q + "를 냈습니다");
								pr.findById(uId);
							} else if (a == '빠') {
								System.out.println(uId + "님은 " + a + "를 냈습니다");
								System.out.println("짐");
								System.out.println("컴퓨터는 " + q + "를 냈습니다");
								pr.findById(uId);
							}
						} else if (q == '빠') {
							if (a == '묵') {
								System.out.println(uId + "님은 " + a + "를 냈습니다");
								System.out.println("짐");
								System.out.println("컴퓨터는 " + q + "를 냈습니다");
								pr.findById(uId);
							} else if (a == '찌') {
								System.out.println(uId + "님은 " + a + "를 냈습니다");
								System.out.println("이김");
								System.out.println("컴퓨터는 " + q + "를 냈습니다");
								pr.findById(uId);
							} else if (a == '빠') {
								System.out.println(uId + "님은 " + a + "를 냈습니다");
								System.out.println("무승부");
								System.out.println("컴퓨터는 " + q + "를 냈습니다");
								pr.findById(uId);
							}
						} else if (q == 0) {
							System.out.println("배팅할 포인트가 부족합니다");
						}
						pr.bb(uId);
					}

				} else if (selectNumber == 4) {
					double a = pr.bb(uId);
					System.out.println(uId + "님의" + " 승률: " + a + "%");
				} else if (selectNumber == 5) {
					pr.ranking();
					
				} else if (selectNumber == 6) {
					run = false;
				}
			}

		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
		}
	}

	private boolean checkId(String uId) {
		return pr.checkId(uId);

	}

	private boolean checkNum(String bNum) {
		return pr.checkId(bNum);

	}
}
