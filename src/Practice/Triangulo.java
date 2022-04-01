package Practice;

public class Triangulo extends Shape {
     private double lad1;
     private double lad2;
     private double lad3;
	public Triangulo(double lad1, double lad2, double lad3) {
		super(3);
		this.lad1 = lad1;
		this.lad2 = lad2;
		this.lad3 = lad3;
	}
	public double getLad1() {
		return lad1;
	}
	public void setLad1(double lad1) {
		this.lad1 = lad1;
	}
	public double getLad2() {
		return lad2;
	}
	public void setLad2(double lad2) {
		this.lad2 = lad2;
	}
	public double getLad3() {
		return lad3;
	}
	public void setLad3(double lad3) {
		this.lad3 = lad3;
	}
	@Override
	public String toString() {
		return "Triangulo [lad1=" + lad1 + ", lad2=" + lad2 + ", lad3=" + lad3 + "]";
	}
	@Override
     public double area() {
    	 return lad1+lad2+lad3/2;
     }
}
