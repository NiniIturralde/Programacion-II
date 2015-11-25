package ejerc1;

public class circulo {

	private double radio;
	
	public circulo(){
		
	}
	
	public circulo(double radioParam){
		this.radio=radioParam;
	}
	
	public void setradio(double radioParam){
	this.radio=radioParam;
	}
	
	public double getradio(){
		return this.radio;
	}
	
	public double getArea(){
		return Math.PI*radio*radio;
	}
}
