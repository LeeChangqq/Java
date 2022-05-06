package project_ex;
public class Pj1DTO {
	public Long id1;
	public String u;
	public Long uMon;
	public String c;
	public Long cMon;
	public int hits;
	public int win;
	public Pj1DTO(Long id1, String u, Long uMon, String c, Long cMon, int hits, int win) {
		super();
		this.id1 = id1;
		this.u = u;
		this.uMon = uMon;
		this.c = c;
		this.cMon = cMon;
		this.hits = hits;
		this.win = win;
	}
	public Long getId1() {
		return id1;
	}
	public void setId1(Long id1) {
		this.id1 = id1;
	}
	public String getU() {
		return u;
	}
	public void setU(String u) {
		this.u = u;
	}
	public Long getuMon() {
		return uMon;
	}
	public void setuMon(Long uMon) {
		this.uMon = uMon;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public Long getcMon() {
		return cMon;
	}
	public void setcMon(Long cMon) {
		this.cMon = cMon;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
	@Override
	public String toString() {
		return "Pj1DTO [id1=" + id1 + ", u=" + u + ", uMon=" + uMon + ", c=" + c + ", cMon=" + cMon + ", hits=" + hits
				+ ", win=" + win + "]";
	}
	
}
	
	
	
