package project_ex;

public class Pj2DTO {
	public Long rank;
	public String uId;
	public double a;
	public Pj2DTO(String uId, double a) {
		super();
		this.uId = uId;
		this.a = a;
	}
	public Long getRank() {
		return rank;
	}
	public void setRank(Long rank) {
		this.rank = rank;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Pj2DTO [rank=" + rank + ", uId=" + uId + ", a=" + a + "]";
	}
	
	
}
