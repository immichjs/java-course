package entities;

public class Retangulo {

	public double width, height;
	
	private double area () {
		return width * height;
	}
	
	private double perimeter () {
		return 2 * (width * height);
	}
	
	private double diagonal () {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public void showResult() {
		System.out.println("AREA = " + this.area());
		System.out.println("PERIMETER = " + this.perimeter());
		System.out.println("DIAGONAL = " + this.diagonal());
	}

}
