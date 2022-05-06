package project_ex;
public class PjDTO {
	public Long id;
	public String uId;
	public String uPass;
	public String uName;
	public String bName;
	public String bNum;
	public int bPass;
	public PjDTO(Long id, String uId, String uPass, String uName, String bName, String bNum, int bPass) {
		super();
		this.id = id;
		this.uId = uId;
		this.uPass = uPass;
		this.uName = uName;
		this.bName = bName;
		this.bNum = bNum;
		this.bPass = bPass;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getuId() {
		return uId;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbNum() {
		return bNum;
	}
	public void setbNum(String bNum) {
		this.bNum = bNum;
	}
	public int getbPass() {
		return bPass;
	}
	public void setbPass(int bPass) {
		this.bPass = bPass;
	}
	@Override
	public String toString() {
		return "PjDTO [id=" + id + ", uId=" + uId + ", uPass=" + uPass + ", uName=" + uName + ", bName=" + bName
				+ ", bNum=" + bNum + ", bPass=" + bPass + "]";
	}
	
}
