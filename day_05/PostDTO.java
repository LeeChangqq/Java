package day_05;

public class PostDTO {
	private Long id;
	private String title;
	private String name;
	private String pass;
	private String cont;
	private int hits = 0;
	private String date;
	
	PostDTO(){
		
	}
	
	public PostDTO(Long id, String title, String name, String pass, String cont,int hits, String date) {
		super();
		this.id = id;
		this.title = title;
		this.name = name;
		this.pass = pass;
		this.cont = cont;
		this.hits = hits;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}

	public int getHits() {
		return hits;
	}

	public void setHits(int hits) {
		this.hits = hits;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "PostDTO [id=" + id + ", title=" + title + ", name=" + name + ", pass=" + pass + ", cont=" + cont
				+ ", hits=" + hits + ", date=" + date + "]";
	}
}