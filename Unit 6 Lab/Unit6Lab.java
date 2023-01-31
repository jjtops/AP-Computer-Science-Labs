/**
* This program uses a while loop in order to allow
* the user to select a 2d shape to print
* with their selected character and dimensions
*  @JeetJagtap
*
*/

import java.util.Scanner;
public class Unit6Lab {

	//runs the function
	public static void main(String[] args) {
	
		
			fig();
		}
		
	
	//main method--> what the user sees 
	public static void fig() {
		//variable intiilization
		
		int figChoice;
		int rectLen;
		int height;
		String config;
		String type;
		char R;
		
		
		//creates the first input of what shape the user wants to see 
		Scanner keyboard = new Scanner(System.in);
		Scanner input = new Scanner(System.in); 
	

		//while loop to make sure this continues 
		while (true) {
			//series of nested conditionals based on the users prefernce 
			System.out.println("Welcome! This program will draw a geometry figure of your choice.\n"
					+ "Make your choice from the following:\n"
					+ "1 a square\n"
					+ "2 a rectangle\n"
					+ "3 a triangle\n"
					+ "4 a circle\n"
					+ "-1 to quit");
			figChoice = input.nextInt();
			
			
				
			if (figChoice == -1) {
				System.out.println("Thank you have a great day!");
			
				break;
			}
			
			
		while (figChoice != -1) {	
			//if statement for a triangle
			if (figChoice == 3) {
				//4
				System.out.println("Please enter a height of your triangle (number between 1 and 30) :");
				height = checkHeight(keyboard);
		
				System.out.println("Point up or down(enter up/down)");
				config = checkConfig(keyboard);
		
					if (config.equals("up")){
						System.out.println("Border-only or solid (enter border/solid)");
						type = checkType(keyboard);
		
							
							if (type.equals("border")) {
								System.out.println("Character to use for drawing?");
								R = input.next().charAt(0);
								HollowTriangle(height, R);
								break;
							}
							if (type.equals("solid")) {
								System.out.println("Character to use for drawing?");
								R = input.next().charAt(0);
								Triangle(height, R);
								break;
							}
					}
					
										
					if (config.equals("down")) {
						System.out.println("Border-only or solid (enter border/solid)");
						type = checkType(keyboard);
			
							
							if(type.equals("border")) {
								System.out.println("Character to use for drawing?");
								R = input.next().charAt(0);
								HollowUpsideDownTriangle(height, R);
								break;
							}
							if (type.equals("solid")) {
								System.out.println("Character to use for drawing?");
								R = input.next().charAt(0);
								UpsideDownTriangle(height, R);
								break;
							}	
					}
			
		}
		
			if(figChoice == 1) {
				System.out.println("Please enter a height of your square (number between 1 and 30) :");
				height = checkHeight(keyboard);
	
				System.out.println("Border-only or solid (enter border/solid)");
				type = checkType(keyboard);
	
				
				
				if (type.equals("border")) {
					System.out.println("Character to use for drawing?");
					R = input.next().charAt(0);
					HollowSquare(height, R);
					break;
				}
				if (type.equals("solid")) {
					System.out.println("Character to use for drawing?");
					R = input.next().charAt(0);
					Square(height, R);
					break;
				}
			break;
		}
			
			if (figChoice == 2) {
				System.out.println("Please enter a height of your rectangle (number between 1 and 30) :");
				height = checkHeight(keyboard);

				
				System.out.println("Please enter legnth of your rectangle (number between 1 and 30) :");
				rectLen = checkHeight(keyboard);
	
				System.out.println("Border-only or solid (enter border/solid)");
				type = checkType(keyboard);

				
				if (type.equals("border")) {
					System.out.println("Character to use for drawing?");
					R = input.next().charAt(0);
					HollowRectangle(height, rectLen, R);
					break;
				}
				if (type.equals("solid")) {
					System.out.println("Character to use for drawing?");
					R = input.next().charAt(0);
					Rectangle(height, rectLen, R);
					break;
				}
				
		}
			if (figChoice == 4) {
				System.out.println("Please enter a radius of your circle (number between 1 and 30) :");
				height = checkHeight(keyboard);
	
				
				System.out.println("Border-only or solid (enter border/solid)");
				type = checkType(keyboard);
	
				
				if (type.equals("border")) {
					System.out.println("Character to use for drawing?");
					R = input.next().charAt(0);
					HollowCircle(height, R);
					break;
				}
				if (type.equals("solid")) {
					System.out.println("Character to use for drawing?");
					R = input.next().charAt(0);
					Circle(height, R);
					break;
				}
				
				
		}
			else {
				while(true) {
					if (figChoice != 1 || figChoice != 2 || figChoice != -1 || figChoice != 3 || figChoice != 4) {
					System.out.println("Please print a valid option");
					figChoice = input.nextInt();
					}
					else {
						break;
					}
					break;
				}
				
			}
			
	
	}
		
	}
		input.close();
	}
	
	
	
	
		
	
	 public static int checkHeight(Scanner s) {
		   
		    int height = s.nextInt();
		    while(height>30 || height<1){
		      System.out.println("please print a valid option");
		      height = s.nextInt();
		    }
		    return height;
		  }
	 
	 public static String checkConfig(Scanner s) {
		 String config = s.next();
		 while(!config.equals("up") && !config.equals("down")) {
				System.out.println("Please print a valid answer");
				config = s.next();
			}
		 return config;
	 }	
	
	 
	 public static String checkType(Scanner s) {
		 String type = s.next();
		 while(!type.equals("border") && !type.equals("solid")) {
				System.out.println("Please print a valid answer");
				type = s.next();
			}
		 return type;
	 }
	
	
	
	
	//all the methods for the drawing of each type of shape 
	public static void Triangle(int height, char t) {
		for (int i=0; i<height; i++) {

            for (int j=height-i; j>1; j--){
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ ){
                System.out.print(t + " ");
            }
            System.out.println();
        }
	}
	
	public static void HollowTriangle(int height, char t) {
		for (int i = 1 ; i <= height; i++ ) 
		{
			for (int j = 1 ; j <= height - i; j++ ) 
			{
				System.out.print(" ");
			}
			if(i == 1 || i == height) {
				for (int k = 1 ; k <= (i * 2) - 1; k++ ) 
				{
					System.out.print(t);
				}
			}
			else {
				for (int k = 1; k <= (i * 2) - 1; k++ ) 
				{
					if(k == 1 || k == i * 2 - 1) {
						System.out.print(t);
					}
					else {
						System.out.print(" ");
					}
				}
			}		
			System.out.println();
		}
	}
	
	public static void UpsideDownTriangle (int height, char t) {
		for(int i=0; i<=height; i++) {
		      for(int j=0; j<i; j++) {
		        System.out.print(" ");
		      }
		      int count = (height - i) * 2 + 1;
		      for(int stars = 0; stars < count; stars++) {
		        System.out.print(t);
		      }
		      System.out.println(); 
		}
	}
	
	public static void HollowUpsideDownTriangle (int height, char t) {
		for (int i = height; i>0; i--) {
			for(int j = height-i; j>0; j--) {
				System.out.print(" ");
			}
			
			for(int u= 2*i-1; u>0; u--) {
				if(i == height || u == 2*i-1 || u ==1) {
					System.out.print(t);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void HollowSquare (int height, char t) {
		for (int i = 1; i <= height; i++)
		{
        for (int j = 1; j <= height; j++)
        {
            if (i == 1 || i == height ||
                j == 1 || j == height)           
                System.out.print(t);           
            else
                System.out.print(" ");           
        }
        System.out.println();
    }
  
}

	public static void Square(int height, char t) {
		for(int i = 1; i <= height; i++)
		{
			for(int j = 1; j <= height; j++)
			{
				System.out.print(t); 
			}
			System.out.print("\n"); 
		}	
	
	}
	
	public static void HollowRectangle (int height, int length, char t) {
		for (int i = 1; i <= height; i++)
		{
        for (int j = 1; j <= length; j++)
        {
            if (i == 1 || i == height ||
                j == 1 || j == length)           
                System.out.print(t);           
            else
                System.out.print(" ");           
        }
        System.out.println();
    }
	}
	
	public static void Rectangle(int height, int length, char t) {
		for(int i = 1; i <= height; i++)
		{
			for(int j = 1; j <= length; j++)
			{
				System.out.print(t); 
			}
			System.out.print("\n"); 
		}
	}
	
	public static void HollowCircle(int radius, char t) {
		   double dist;
		   
		    // for horizontal movement
		    for (int i = 0; i <= 2 * radius; i++) {
		 
		    // for vertical movement
		    for (int j = 0; j <= 2 * radius; j++) {
		        dist = Math.sqrt((i - radius) * (i - radius) +
		                         (j - radius) * (j - radius));
		 
		        // dist should be in the range (radius - 0.5)
		        // and (radius + 0.5) to print stars(*)
		        if (dist > radius - 0.5 && dist < radius + 0.5)
		        System.out.print(t);
		        else
		        System.out.print(" ");
		    }
		 
		    System.out.print("\n");
		    }
	}

	public static void Circle(int radius, char t) {
		for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                if (i*i + j*j <= radius*radius) System.out.print("* ");
                else                  System.out.print("  ");
            }
            System.out.println();
        }
	}

}	
	

