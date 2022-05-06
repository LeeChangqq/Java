package project_ex;

import java.util.*;

public class PjRepository {
	List<PjDTO> pl = new ArrayList<>();
	List<Pj1DTO> pl1 = new ArrayList<>();
	List<Pj2DTO> pl2 = new ArrayList<>();
	static Long id1 = 0L;

	public boolean checkId(String uid) {
		boolean check = false;
		for (int i = 0; i < pl.size(); i++) {
			if (uid.equals(pl.get(i).getuId())) {
				check = true;
			}
		}
		return check;
	}

	public boolean checkNum(String bNum) {
		boolean check = false;
		for (int i = 0; i < pl.size(); i++) {
			if (bNum.equals(pl.get(i).getbNum())) {
				check = true;
			}
		}
		return check;
	}

	public boolean save(PjDTO pj) {
		return pl.add(pj);
	}

	public void save1(Pj1DTO pj) {
		pl1.add(pj);
	}

	public void save2(Pj2DTO pj) {
		pl2.add(pj);
	}

	public void findAll() {
		for (int i = 0; i < pl.size(); i++) {
			System.out.println(pl.get(i));
		}
	}

	public boolean login(String uId, String uPass) {
		boolean result = false;
		for (int i = 0; i < pl.size(); i++) {
			if (uId.equals(pl.get(i).getuId()) && uPass.equals(pl.get(i).getuPass())) {
				result = true;
			}
		}
		return result;
	}

	public boolean deposit(String uId, String bName, String bNum, int bPass, Long money) {
		boolean run = false;
		for (int i = 0; i < pl.size(); i++) {
			if (uId.equals(pl.get(i).getuId()) && bName.equals(pl.get(i).getbName()) && bNum.equals(pl.get(i).getbNum())
					&& bPass == pl.get(i).getbPass()) {
				pl1.get(i).setuMon(pl1.get(i).getuMon() + money);
				run = true;
			}
		}
		return run;
	}

	public boolean cPoint(String uId, Long money) {
		boolean run = false;
		for (int i = 0; i < pl.size(); i++) {
			if (uId.equals(pl.get(i).getuId())) {
				pl1.get(i).setcMon(pl1.get(i).getcMon() + money);
				run = true;
			}
		}
		return run;
	}

	public void findAll1() {
		for (int i = 0; i < pl1.size(); i++) {

			System.out.println(pl1.get(i));
		}
	}

	public void findById(String uId) {
		for (int i = 0; i < pl1.size(); i++) {
			if (uId.equals(pl.get(i).getuId())) {
				System.out.println(pl1.get(i));
			}

		}
	}

	public int aa1(String uId) {
		int q = 0;
		for (int i = 0; i < pl.size(); i++) {
			if (pl1.get(i).getuMon() < 0 && pl1.get(i).getcMon() < 0) {
				return q;
			} else if (pl1.get(i).getuMon() > 0 && pl1.get(i).getcMon() < 0) {
				q = 1;
				return q;
			} else if (pl1.get(i).getuMon() < 0 && pl1.get(i).getcMon() > 0) {
				q = 2;
				return q;
			} else if (pl1.get(i).getuMon() > 0 && pl1.get(i).getcMon() > 0) {
				q = 3;
				return q;
			}

		}
		return q;
	}

	public char aa(String uId, Long money, char a) {
		Random r = new Random();
		String aaa = "묵찌빠";
		char b = aaa.charAt(r.nextInt(aaa.length()));
		if (b == '묵') {
			if (a == '묵') {
				for (int i = 0; i < pl.size(); i++) {
					if (uId.equals(pl.get(i).getuId()) && pl1.get(i).getuMon() < money
							&& pl1.get(i).getcMon() < money) {
						b = 0;
						return b;
					}

				}
				return b;
			} else if (a == '찌') {
				for (int i = 0; i < pl.size(); i++) {
					if (uId.equals(pl.get(i).getuId()) && pl1.get(i).getuMon() < money
							&& pl1.get(i).getcMon() < money) {
						b = 0;
						return b;
					} else if (uId.equals(pl.get(i).getuId()) && pl1.get(i).getuMon() > 0 && pl1.get(i).getcMon() > 0) {
						pl1.get(i).setuMon(pl1.get(i).getuMon() - money);
						pl1.get(i).setcMon(pl1.get(i).getcMon() + money);
						return b;
					}
				}
			} else if (a == '빠') {
				for (int i = 0; i < pl.size(); i++) {
					if (uId.equals(pl.get(i).getuId()) && pl1.get(i).getuMon() < money
							&& pl1.get(i).getcMon() < money) {
						b = 0;
						return b;
					} else if (uId.equals(pl.get(i).getuId()) && pl1.get(i).getuMon() > 0 && pl1.get(i).getcMon() > 0) {
						int win = pl1.get(i).getWin();
						win = win + 1;
						pl1.get(i).setWin(win);
						pl1.get(i).setuMon(pl1.get(i).getuMon() + money);
						pl1.get(i).setcMon(pl1.get(i).getcMon() - money);
						return b;
					}
				}
			}

		} else if (b == '찌') {
			if (a == '묵') {
				for (int i = 0; i < pl.size(); i++) {
					if (uId.equals(pl.get(i).getuId()) && pl1.get(i).getuMon() < money
							&& pl1.get(i).getcMon() < money) {
						b = 0;
						return b;
					} else if (uId.equals(pl.get(i).getuId()) && pl1.get(i).getuMon() > 0 && pl1.get(i).getcMon() > 0) {
						int win = pl1.get(i).getWin();
						win = win + 1;
						pl1.get(i).setWin(win);
						pl1.get(i).setuMon(pl1.get(i).getuMon() + money);
						pl1.get(i).setcMon(pl1.get(i).getcMon() - money);
						return b;
					}
				}
			} else if (a == '찌') {
				for (int i = 0; i < pl.size(); i++) {
					if (uId.equals(pl.get(i).getuId()) && pl1.get(i).getuMon() < money
							&& pl1.get(i).getcMon() < money) {
						b = 0;
						return b;
					}

				}
				return b;
			} else if (a == '빠') {
				for (int i = 0; i < pl.size(); i++) {
					if (uId.equals(pl.get(i).getuId()) && pl1.get(i).getuMon() < money
							&& pl1.get(i).getcMon() < money) {
						b = 0;
						return b;
					} else if (uId.equals(pl.get(i).getuId()) && pl1.get(i).getuMon() > 0 && pl1.get(i).getcMon() > 0) {
						pl1.get(i).setuMon(pl1.get(i).getuMon() - money);
						pl1.get(i).setcMon(pl1.get(i).getcMon() + money);
						return b;
					}
				}
			}
		} else if (b == '빠') {
			if (a == '묵') {
				for (int i = 0; i < pl.size(); i++) {
					if (uId.equals(pl.get(i).getuId()) && pl1.get(i).getuMon() < money
							&& pl1.get(i).getcMon() < money) {
						b = 0;
						return b;
					} else if (uId.equals(pl.get(i).getuId()) && pl1.get(i).getuMon() > 0 && pl1.get(i).getcMon() > 0) {
						pl1.get(i).setuMon(pl1.get(i).getuMon() - money);
						pl1.get(i).setcMon(pl1.get(i).getcMon() + money);
						return b;
					}
				}
			} else if (a == '찌') {
				for (int i = 0; i < pl.size(); i++) {
					if (uId.equals(pl.get(i).getuId()) && pl1.get(i).getuMon() < money
							&& pl1.get(i).getcMon() < money) {
						b = 0;
						return b;
					} else if (uId.equals(pl.get(i).getuId()) && pl1.get(i).getuMon() > 0 && pl1.get(i).getcMon() > 0) {
						int win = pl1.get(i).getWin();
						win = win + 1;
						pl1.get(i).setWin(win);
						pl1.get(i).setuMon(pl1.get(i).getuMon() + money);
						pl1.get(i).setcMon(pl1.get(i).getcMon() - money);
						return b;
					}
				}
			} else if (a == '빠') {
				for (int i = 0; i < pl.size(); i++) {
					if (uId.equals(pl.get(i).getuId()) && pl1.get(i).getuMon() < money
							&& pl1.get(i).getcMon() < money) {
						b = 0;
						return b;
					}

				}
				return b;
			}
		}
		return b;
	}

	public void hits(String uId) {
		for (int i = 0; i < pl.size(); i++) {
			if (uId.equals(pl.get(i).getuId())) {
				int hits = pl1.get(i).getHits();
				hits = hits + 1;
				pl1.get(i).setHits(hits);
			}
		}
	}

	public double bb(String uId) {
		double c = 0;
		for (int i = 0; i < pl.size(); i++) {
			if (uId.equals(pl.get(i).getuId())) {
				double a = pl1.get(i).getWin();
				double b = pl1.get(i).getHits();
				pl2.get(i).setA(a/b*100);
				c = a / b * 100;
			}

		}
		return c;

	}

	public void ranking() {
		System.out.println(pl2);
		int id = 0;
		for (int i = 0; i < pl.size(); i++) {
			pl2.get(i).setRank(0L);;
		}
		for (int i = 0; i < pl.size(); i++) {
			id = 0;
			for (int j = 0; j < pl.size(); j++) {
				if(pl2.get(j).getRank() == 0L) {
					if(id == 0) {
						id = j+1;
					}else if(pl2.get(id-1).getA() < pl2.get(j).getA()) {
						id = j+1;
					}
				}
			}
			pl2.get(id-1).setRank(i+1L);
			System.out.println(pl2.get(id-1));
		}

	}

}