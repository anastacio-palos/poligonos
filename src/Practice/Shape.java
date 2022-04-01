package Practice;

public abstract class Shape {
	protected int numLad;

	public Shape(int numLad) {
		super();
		this.numLad = numLad;
	}

	public int getNumLad() {
		return numLad;
	}

	public void setNumLad(int numLad) {
		this.numLad = numLad;
	}
	public abstract double area();

}
