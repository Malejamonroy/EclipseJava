package tests;

import modelo.Rectangulo;

public class Test02 {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo(1, 2, 3, 4);
		Rectangulo r2 = new Rectangulo(1, 2, 3, 4);
		
		System.out.println(r1.getX());
		System.out.println(r1.getLado1());
		System.out.println(r1.area());
		System.out.println(r1.toString());
		System.out.println(r1.equals(r2));

	}

}
