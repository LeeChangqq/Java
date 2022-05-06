package day_08;

public class ImplClass2 implements TestInterface{

	@Override
	public void hello() {
		System.out.println("ImplClass2의 hello()");
		
	}

	@Override
	public void hello2(String name) {
		System.out.println("ImplClass2의 hello2()" + name);
		
	}

}
