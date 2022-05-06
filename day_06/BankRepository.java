package day_06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankRepository {
	static List<ClientDTO> cList = new ArrayList<>();
	static List<BankDTO> bList = new ArrayList<>();

	public boolean save(ClientDTO newClient) {
		return cList.add(newClient);
	}

	public boolean save1(BankDTO newBank) {
		return bList.add(newBank);
	}

	public int findAll(String clientAcc) {
		int client = 0;
		for (int i = 0; i < cList.size(); i++) {
			if (clientAcc.equals(cList.get(i).getAccountNumber())) {
				client = cList.get(i).getBalance();
			}
		}
		return client;
	}

	public boolean check(String bankAcc) {
		boolean q = false;
		for (int i = 0; i < cList.size(); i++) {
			if (bankAcc.equals(cList.get(i).getAccountNumber())) {
				cList.get(i).getAccountNumber();
				q = true;
				return q;
			}
		}
		return q;

	}

	public ClientDTO check2(String pass) {
		ClientDTO q = null;
		for (int i = 0; i < cList.size(); i++) {
			if (pass.equals(cList.get(i).getClientPass())) {
				cList.get(i).getClientPass();
				q = cList.get(i);
			}
		}
		return q;

	}

	public ClientDTO deposit(int dep, String bank) {
		ClientDTO q = null;
		int dep1 = 0;
		for (int i = 0; i < cList.size(); i++) {
			if (bank.equals(cList.get(i).getAccountNumber())) {
				dep1 = cList.get(i).getBalance();
				dep1 = dep1 + dep;
				cList.get(i).setBalance(dep1);
				q = cList.get(i);

			}
		}
		return q;

	}

	public ClientDTO withdraw(String bankAcc, String pass, int wit) {
		int wit1 = 0;
		ClientDTO wit2 = null;
		for (int i = 0; i < cList.size(); i++) {
			if (bankAcc.equals(cList.get(i).getAccountNumber()) && pass.equals(cList.get(i).getClientPass())) {
				wit1 = cList.get(i).getBalance();
				wit1 = wit1 - wit;
				if(wit1 > 0) {
					cList.get(i).setBalance(wit1);
					wit2 = cList.get(i);
				}else {
					cList.get(i).getBalance();
					wit2 = cList.get(i);
				}
					
			}

		}
		return wit2;
	}
}