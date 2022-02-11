package vector;

public class Vector {
	private double x;
	private double y;
	
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector() {
		this(0, 0);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double value) {
		x = value;
	}
	
	public void setY(double value) {
		y = value;
	}
	
	public double lenght() {
		return Math.hypot(x, y);
	}
	
	public boolean equal(Vector other) {
		return x == other.getX() && y == other.getY();
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

}
