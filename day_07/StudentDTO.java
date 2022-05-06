package day_07;

public class StudentDTO {
	private Long id;
	private String name;
	private String Num;
	private String ma;
	public StudentDTO(Long id, String name, String num, String ma) {
		super();
		this.id = id;
		this.name = name;
		Num = num;
		this.ma = ma;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return Num;
	}
	public void setNum(String num) {
		Num = num;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", Num=" + Num + ", ma=" + ma + "]";
	}
	
}
