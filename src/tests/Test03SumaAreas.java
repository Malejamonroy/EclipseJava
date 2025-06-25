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

	

}
