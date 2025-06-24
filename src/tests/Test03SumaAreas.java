package tests;

import modelo.Circulo;
import modelo.Figura;
import modelo.Rectangulo;

public class Test03SumaAreas {
	
	public static double sumArea(Figura...figs) {
//		int suma = 0;
//		for(int i = 0; i < figs.length;i++) {
//			suma += figs[i].area();
//		}
//		return suma;
//		
		var suma = 0.0;
		for(int i=0; i < figs.length;i++) {
			suma +=figs[i].area();
		}
		return suma;
	}

	public static void main(String[] args) {
		Figura f1 = new Circulo(1, 2, 3);
		Circulo f2 = new Circulo(1, 3, 6);
		Rectangulo f3 = new Rectangulo(1, 2, 4, 98);
		System.out.println(sumArea(f1,f2,f3));
		
		var sumaTotal = sumArea(new Circulo(1,2,3), new Rectangulo(1, 1, 3, 5));
		System.out.println(sumaTotal);
		
		System.out.println(Figura.centroMasas(f1,f2,f3));
	}

}
