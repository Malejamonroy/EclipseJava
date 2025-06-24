package tests;

import modelo.Circulo;
import modelo.Figura;
import modelo.Rectangulo;

public class Test01 {
	public static void main(String[] args) {
//		Figura f = new Figura();  //la dejamos porque no es logico y es una clase abtracta
//		System.out.println(f.toString());
//		
		Rectangulo r = new Rectangulo(-1.5, 3.74, 10, 5);
		
		System.out.println(r.area());
		
		System.out.println();
		
		Circulo c1 = new Circulo(3, 3, 3);
		Circulo c2 = new Circulo(3, 3, 3);
		System.out.println(c1.equals(c2));
		
	}
	

}
