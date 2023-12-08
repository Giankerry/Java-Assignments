import java.util.*;
public class Polygon{
	static double side;
	static int polygon;
	public static double getArea(double side,int polygon ){
		double area = (1.0 / 4.0) * Math.sqrt(polygon * (polygon + 2.0 * Math.sqrt(polygon))) * side * side;
		return area;
	}
	
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input the number of sides : ");
    polygon = (int) input.nextDouble();
    System.out.print("Input the side : ");
    side = input.nextInt();
    double pentagon=getArea(side,polygon);
    System.out.print("The area of the pentagon is "+pentagon);
    
	}
}
