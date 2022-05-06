package project_ex;

import java.util.Random;

public class Azz {

	public static void main(String[] args) {
		Random r = new Random();
		String a = "묵찌빠";
		char b = a.charAt(r.nextInt(a.length()));
		System.out.println(b);
	}

}
