package modelo;

public abstract class Figura { //concepto abstracta

	private double x;
	private double y;
	
	public Figura() {}
	
	public Figura(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public abstract double area(); //metodo abstracto: metodo que no tiene cuerpo, ni codigo, esta creado para obtener decendiente
	//consecuencia:exige que los decendiente tengan codigo;obliga al usuario a que meta los datos que que necesito ai o si 
	//hace que implemenete el metodo area y el metodo perimetro
		
	
	public abstract double perimetro();
	
	
	public boolean equals(Object otro) {
		if(otro == null) return false;
		if(this == otro) return true;
		if(this.getClass()!=otro.getClass())return false;
		Figura otra =(Figura) otro;
		return this.x == otra.x && this.y == otra.y;
		
	}

	@Override
	public String toString() {
		return "Figura [x=" + x + ", y=" + y + "]";
	}
	
}
