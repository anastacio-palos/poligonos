package Practice;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;

public class Main {
    static ArrayList<Shape> shape = new ArrayList<Shape>();	
    static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		fillShape();
		showRes();
		
	}
	public static void fillShape() {
		int option;
		char resp;
		
		do {
			do {
				System.out.println("Chose an Option to get Area: ");
				System.out.println("1. Circle");
				System.out.println("2. Rectangle");
				System.out.println("3. Triagle");
				System.out.println("4. Exit");
				option = input.nextInt();
			}while(option<1 || option>3);
			
			switch(option) {
			case 1: getCircle();
				break;
			case 2: getRectangle();
				break;
			case 3: getTriangulo();
			    break;
			}
			System.out.println("Do you want to more shape areas Y/N");
			resp = input.next().charAt(0);
			
		}while(resp == 's' || resp == 'S');
		
	}
	public static void getCircle() {
		double radio,pi=3.1416;
		radio = Float.parseFloat(JOptionPane.showInputDialog("Write radio:"));
		
		//System.out.println("Write radio: ");
		//radio = input.nextDouble();
				
		Circle circle = new Circle(radio, pi);
		shape.add(circle);
	}
	public static void getRectangle() {
		double lad1, lad2;
		lad1 = Float.parseFloat(JOptionPane.showInputDialog("Write side 1"));
		lad2 = Float.parseFloat(JOptionPane.showInputDialog("Write side 2"));
		/*System.out.println("Write side1");
		lad1 = input.nextDouble();
		System.out.println("Write side2");
		lad2 = input.nextDouble();*/
		
		
		Rectangle rectangle = new Rectangle(lad1,lad2);
		shape.add(rectangle);
		
	}
	
	public static void getTriangulo() {
		double lad1, lad2, lad3;
		lad1 = Float.parseFloat(JOptionPane.showInputDialog("Write side 1"));
		lad2 = Float.parseFloat(JOptionPane.showInputDialog("Write side 2"));
		lad3 = Float.parseFloat(JOptionPane.showInputDialog("Write side 3"));
		
		/*System.out.println("Write side1");
		lad1 = input.nextDouble();
		System.out.println("Write side2");
		lad2 = input.nextDouble();
		System.out.println("Write side3");
		lad3 = input.nextDouble();*/
		
		Triangulo triangulo = new Triangulo(lad1,lad2,lad3);
		shape.add(triangulo);
	}
	public static void showRes(){
		for(Shape sh:shape) {
			System.out.println(sh.toString());
			System.out.println("Area: "+sh.area());
			System.out.println("");
		}
	}


}
