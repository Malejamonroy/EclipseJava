package modelo;

public class Circulo extends Figura implements Dibujable{
		
	private double radio;
		
	public Circulo(double x,double y,double radio) {
		super(x,y);
		this.radio = radio;
			
	}

	public double getRadio() {
		return this.radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double getDiametro() {
		return this.radio * 2;
	}
	
	@Override
	public double area() {
		return Math.PI*Math.pow(this.radio,2);
	}
	
	@Override
	public double perimetro() {
		return 2*Math.PI*this.radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", getX()=" + getX() + ", getY()=" + getY() + "]";
	}
	
	@Override
	public boolean equals(Object otro) {
		if(!super.equals(otro))return false;
		Circulo circulo = (Circulo)otro;
		return this.radio == circulo.radio;
	}

	@Override
	public void dibujar() {
		System.out.println("dibujando el circulo");
		
	}
	


}
