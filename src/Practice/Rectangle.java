package Practice;

public class Rectangle extends Shape {
     private double lad1;
     private double lad2;
     
     	
	public Rectangle(double lad1, double lad2) {
		super(2);
		this.lad1 = lad1;
		this.lad2 = lad2;
	}
	public double getLad1() {
		return lad1;
	}
	public void setLad1(double lad1) {
		this.lad1 = lad1;
	}
	public double getLas2() {
		return lad2;
	}
	public void setLas2(double las2) {
		this.lad2 = las2;
	}
	@Override
	public String toString() {
		return "Rectangle [lad1=" + lad1 + ", las2=" + lad2 + "]";
	}
	@Override
     public double area() {
    	 return lad1*lad2;
    	 
     }
}
