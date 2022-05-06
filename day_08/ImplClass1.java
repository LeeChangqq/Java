package day_08;
// TestInterface 의 구현클래스로 선언
public class ImplClass1 implements TestInterface{

	@Override
	public void hello() {
		System.out.println("ImplClass1의 hello()");
		
	}

	@Override
	public void hello2(String name) {
		System.out.println("ImplClass1의 hello2()" + name);
		
	}
	
}
