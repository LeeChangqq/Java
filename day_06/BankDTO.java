package day_06;

import java.time.LocalDateTime;

public class BankDTO {
	private Long id;	// 거래내역 관리 번호
	private String accountNumber;	// 계좌번호
	private int deposit;	// 입금액
	private int withdraw;	// 출금액
	private String bankingDate;	// 거래일자
	public BankDTO(Long id, String accountNumber, int deposit, int withdraw, String bankingDate) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.bankingDate = bankingDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	public String getBankingDate() {
		return bankingDate;
	}
	public void setBankingDate(String bankingDate) {
		this.bankingDate = bankingDate;
	}
	@Override
	public String toString() {
		return "BankDTO [id=" + id + ", accountNumber=" + accountNumber + ", deposit=" + deposit + ", withdraw="
				+ withdraw + ", bankingDate=" + bankingDate + "]";
	}
     
}
