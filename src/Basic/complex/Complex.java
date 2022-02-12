package complex;

public class Complex {
	
	private double real;
	private double imaginary;
	
	public Complex( double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public Complex() {
		this(0, 0);
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginary() {
		return imaginary;
	}
	
	public boolean equal(Complex other) {
		return real == other.getReal() && imaginary == other.getImaginary();
	}
	
	public String toString() {
		if (imaginary < 0 ) {
			return real +" - "+ imaginary*-1 + "i";
		} else {
			return real + " + " + imaginary + "i";
		}
		
	}

}
