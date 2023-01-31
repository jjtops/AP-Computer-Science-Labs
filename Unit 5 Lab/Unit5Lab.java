
/**
* This program uses if statements in order to calculate the perimeter/
* area of a 2d shape or the volume/surface area of a 3d shape
*  @JeetJagtap
*
*/
import java.util.Scanner; 
public class Unit5Lab {

	public static void main(String[] args) {
		
		//all variable definition 
		int dimension; 
		String operation;
		String Shape;
		double side;
		double height;
		double base;
		double length;
		double radius;
		double width;
		Scanner input = new Scanner(System.in); 
		
		
		//asks the user what dimension shape they need their calculation for 
		System.out.println("Enter 2 for 2D figures and 3 for 3D:");
		dimension = input.nextInt();
		

		// parent if statement of all 2d shapes 
		if (dimension == 2){
			System.out.println("Enter P if you are looking to compute the perimeter, A for area, or B for both: ");
			operation = input.next();
			
			// if statement that calculates the perimeter of 2d shapes (depending on the 2d shape) 
			if (operation.equals("P")) {
				System.out.println("Enter C for Circle, S for Square, and P for Parallelogram: ");
				Shape = input.next();
				if (Shape.equals("C")) {
					System.out.println("Enter the length of radius: ");
					radius = input.nextInt();
					System.out.println("Perimeter equals " + circlePer(radius) + " computed using the equation Perimeter = pi * radius * 2");
				}
				if (Shape.equals("S")) {
					System.out.println("Enter the length of a side: ");
					side = input.nextInt();
					System.out.println("Perimeter equals " + squarePer(side) + " computed using the equation Perimeter = 4 * side");
				}
				if (Shape.equals("P")) {
					System.out.println("Enter the length of height: ");
					height = input.nextInt();
					System.out.println("Enter the length of base: ");
					base = input.nextInt();
					System.out.println("Perimeter equals " + parallelPer(base, height) + " computed using the equation perimeter = 2 * (base + height)");
				}
			}
			
			// if statement that calculates the area of 2d shapes (depending on the 2d shape) 
			else if (operation.equals("A")) {
				System.out.println("Enter C for Circle, S for Square, and P for Parallelogram: ");
				Shape = input.next();
				if (Shape.equals("C")) {
					System.out.println("Enter the length of radius: ");
					radius = input.nextInt();
					System.out.println("Area equals " + circleArea(radius) + " computed using the equation Area = pi * radius^2");
				}
				else if(Shape.equals("S")){
					System.out.println("Enter the length of a side: ");
					side = input.nextInt();
					System.out.println("Area equals " + squareArea(side)+ " computed using the equation Area = side^2");
				}
				
				else if (Shape.equals("P")) {
					System.out.println("Enter the length of height: ");
					height = input.nextInt();
					System.out.println("Enter the length of base: ");
					base = input.nextInt();
					System.out.println("Area Equals " + parallelArea(base, height) +" computed using the equation Area = base * height");
				}
					
				}
			
			// if statement that calculates both the area and perimeter of a 2d shape (depending on the shape) 
			else if (operation.equals("B")) {	
				System.out.println("Enter C for Circle, S for Square, and P for Parallelogram: ");
				Shape = input.next();
				if (Shape.equals("C")) {
					System.out.println("Enter the length of radius: ");
					radius = input.nextInt();
					System.out.println("Area equals " + circleArea(radius) + " computed using the equation Area = pi * radius^2");
					System.out.println("Perimeter equals " + circlePer(radius) + "computed using the equation Perimeter = pi * radius * 2");
				}
				else if(Shape.equals("S")){
					System.out.println("Enter the length of a side: ");
					side = input.nextInt();
					System.out.println("Area equals " + squareArea(side) + " computed using the equation Area = side^2");
					System.out.println("Perimeter equals " + squarePer(side) + " computed using the equation Perimeter = 4 * side");
				}
				else if (Shape.equals("P")) {
					System.out.println("Enter the length of height: ");
					height = input.nextInt();
					System.out.println("Enter the length of base: ");
					base = input.nextInt();
					System.out.println("Area Equals " + parallelArea(base, height) +" computed using the equation Area = base * height");
					System.out.println("Perimeter equals " + parallelPer(base, height) + " computed using the equation perimeter = 2 * (base + height)");
				}
			
				}
		}
		//parent if statement for all the 3d shapes 
		if (dimension == 3) {
			System.out.println("Enter A if you are looking to compute the Surface Area, V for volume, or B for both: ");
			operation = input.next();
			
			// if statement that computes the surface area for 3d shapes (depending on the shape) 
			if (operation.equals("A")) {
				System.out.println("Enter C for Cyliner, S for Sphere, and R for Rectangular Solid: ");
				Shape = input.next();
				if (Shape.equals("C")) {
					System.out.println("Enter the length of radius: ");
					radius = input.nextInt();
					System.out.println("Enter the height: ");
					height = input.nextInt();	
					System.out.println("Surface Area equals " + cyllinderSA(radius, height) + " computed using the equation Surface Area = 2 * pi * radius(radius + height)");
				}
				if (Shape.equals("S")) {
					System.out.println("Enter the length of radius: ");
					radius = input.nextInt();
					System.out.println("Surface Area equals " + sphereSA(radius) + " computed using the equation Surface Area = 4 * pi * radius^2");
				}
				if (Shape.equals("R")) {
					System.out.println("Enter the length of height: ");
					height = input.nextInt();
					System.out.println("Enter the length of width: ");
					width = input.nextInt();
					System.out.println("Enter the length of the rectangular solid: ");
					length = input.nextInt();
					System.out.println("Surface Area equals " + rectangleSA(length, width, height) + " computed using the equation Surface Area = 2(width * length + height * length + height * width)");
				}
			}
			//if statement that computes just the volume for 3d shapes (depending on the shape)
			else if (operation.equals("V")) {
				System.out.println("Enter C for Cyliner, S for Sphere, and R for Rectangular Solid: ");
				Shape = input.next();
				if (Shape.equals("C")) {
					System.out.println("Enter the length of radius: ");
					radius = input.nextInt();
					System.out.println("Enter the height: ");
					height = input.nextInt();	
					System.out.println("Volume equals " + cyllinderVolume(radius, height) + " computed using the equation Volume = pi * radius^2 * height");
				}
				else if(Shape.equals("S")){
					System.out.println("Enter the length of a side: ");
					radius = input.nextInt();
					System.out.println("Volume equals " + sphereVolume(radius) + " computed using the equation Volume = 4/3 * pi * radius^3");
				}
				
				else if (Shape.equals("R")) {
					System.out.println("Enter the length of height: ");
					height = input.nextInt();
					System.out.println("Enter the length of width: ");
					width = input.nextInt();
					System.out.println("Enter the length of the rectangular solid: ");
					length = input.nextInt();
					System.out.println("Volume equals " + rectangleVolume(length, width, height) +" computed using the equation Volume = width * height * length");
				}
					
				}
			//if statement that computes both the volume and surface area of the 3d shape(depending on the shape)
			else if (operation.equals("B")) {	
				System.out.println("Enter C for Cyliner, S for Sphere, and R for Rectangular Solid: ");
				Shape = input.next();
				if (Shape.equals("C")) {
					System.out.println("Enter the length of radius: ");
					radius = input.nextInt();
					System.out.println("Enter the height: ");
					height = input.nextInt();	
					System.out.println("Surface Area equals " + cyllinderSA(radius, height) + " computed using the equation Surface Area = 2 * pi * radius(radius + height)");
					System.out.println("Volume equals " + cyllinderVolume(radius, height) + " computed using the equation Volume = pi * radius^2 * height");
				}
				else if(Shape.equals("S")){
					System.out.println("Enter the length of radius: ");
					radius = input.nextInt();
					System.out.println("Surface Area equals " + sphereSA(radius) + " computed using the equation Surface Area = 4 * pi * radius^2");
					System.out.println("Volume equals " + sphereVolume(radius) + " computed using the equation Volume = 4/3 * pi * radius^3");
				}
				else if (Shape.equals("R")) {
					System.out.println("Enter the length of height: ");
					height = input.nextInt();
					System.out.println("Enter the length of width: ");
					width = input.nextInt();
					System.out.println("Enter the length of the rectangular solid: ");
					length = input.nextInt();
					System.out.println("Surface Area equals " + rectangleSA(length, width, height) + " computed using the equation Surface Area = 2(width * length + height * length + height * width)");
					System.out.println("Volume equals " + rectangleVolume(length, width, height) +" computed using the equation Volume = width * height * length");
				}
			
				}
			
		}
	  	
	input.close();
	}
	
	//method for circle perimeter
	public static double circlePer(double radius) {
		return 2*radius * Math.PI  ;
	}
	//method for square perimeter 
	public static double squarePer(double side) {
		return side * 4 ;
	}
	//method for parallelogram perimeter 
	public static double parallelPer(double base, double height) {
		return 2 * (base + height) ;
	}
	
	//method for circle area 
	public static double circleArea(double radius) {
		return Math.PI * Math.pow(radius, 2) ;
	}
	//method for square area
	public static double squareArea(double side) {
		return side * side ;
	}
	//method for parallelogram area
	public static double parallelArea(double base, double height) {
		return base * height ;
	}
	
	// method for cyllinder surface area
	public static double cyllinderSA(double radius, double height) {
		return 2 * Math.PI * radius * (radius + height) ;
	}
	//method for sphere surface area 
	public static double sphereSA(double radius) {
		return 4 * Math.PI * Math.pow(radius , 2); 
	}
	// method for rectangle surface area
	public static double rectangleSA(double length, double width, double height) {
		return 2*(width * length + height*length + height * width);
	}
	
	// method for cyllinder volume
	public static double cyllinderVolume(double radius, double height) {
		return  Math.pow(radius, 2) * Math.PI * height ;
	}
	// method for sphere volume 
	public static double sphereVolume(double radius) {
		return (4/3) * Math.PI * Math.pow(radius, 3); 
	}
	// method for rectangle volume 
	public static double rectangleVolume(double length, double width, double height) {
		return width * height * length;
	}
	
	
	
		
	}


	



