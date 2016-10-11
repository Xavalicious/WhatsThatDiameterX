
public class Circle {
	private double radius;
	
	public Circle(double r){
		radius = r;
		
	}
	public double area(){
		double a=Math.PI*radius*radius;
		return a;
	}
	public double circumference(){
		double c=Math.PI*2*radius;
		return c;
	}
	public double diameter(){
		double dd=(2*radius);
		return dd;
	}
}