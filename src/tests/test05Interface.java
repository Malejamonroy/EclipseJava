package tests;

import modelo.Circulo;
import modelo.Dibujable;
import modelo.Punto;
import modelo.Rectangulo;
import modelo.otro.Cliente;

public class test05Interface {
	public static void main(String[] args) {
		Circulo c = new Circulo(1, 3, 7);
		Cliente cli = new Cliente();
		Punto p = new Punto(4, 5.5);
		Cliente cl2 = new Cliente();
		
		Rectangulo r = new Rectangulo(1, 2, 3, 4);
		procesaDibs(c,cli,p,cl2);
		
		
	}
	
	public static void procesaDibs(Dibujable... dibujables) {
		for (int i=0; i<dibujables.length; i++) {
			dibujables[i].dibujar();
		}
		
	}

}
