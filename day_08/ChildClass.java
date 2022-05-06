package day_08;

public class ChildClass extends ParentClass {

	ChildClass(){
		System.out.println("자식 기본생성자");
	}
	ChildClass(String name, String address){
		System.out.println("자식 매개변수 생성자");
		this.name = name;
		this.address = address;
	}
	
	// 메서드 오버라이딩(재정의)
	// 
	@Override
	public void hello() {
		System.out.println("자식 hello 메서드");
	}
}
