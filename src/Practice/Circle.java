package Practice;

public class Circle extends Shape{
	private double radio;
	private double pi=3.1416;
	
	

	public Circle(double radio, double pi) {
		super(0);
		this.radio = radio;
		this.pi = pi;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
		}

	@Override
	public String toString() {
		return "Circle [radio=" + radio + ", pi=" + pi + "]";
	}
	@Override
	public double area() {
		return pi*(radio*radio);
	}

}
