package day_08;

public class ExceptionEx {

	public static void main(String[] args) {
		/*
		 * 숫자/0을 했을 때 발생하는 예외를 확인하여 이에 대한 예외처리 코드를 작성
		 */
		try {
			System.out.println(10 / 0);
			String a = null;
			System.out.println(a.length());
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누면 안돼요");
		} catch (NullPointerException e) {
			System.out.println("NPE 발생!!");
		} catch (Exception e) {
			System.out.println("요건 예측 못했지?");
		}
	}

}			
