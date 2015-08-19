

import java.io.*;
//from Data structures text page 28 and 29. Assorted problems with control statements

public class CodeFragProblems {
	
	//problem 1
	public static void main(String[ ] args) throws IOException  {
		String name;
		int age;
		
		
	BufferedReader consoleInput = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("Please enter your name: ");
	name = consoleInput.readLine();
	
	System.out.print("Please enter your age: ");
	age = Integer.parseInt(consoleInput.readLine());
	age += 10;
	
	System.out.print("Your name is " + name );
	System.out.print(" and your age in 10 years will be: " + age );
	System.out.println("Next problem:   ");
	
	
	//////////////////////////////////////////
	//problem 1 page 28
	
	int x;
	System.out.print("Enter a number between -500 and 500: ");
	x = Integer.parseInt(consoleInput.readLine());
	
	
			if (x < 0){
				System.out.println("Your number is negative!");
			} else if (x >= 0 && x <= 50){
				System.out.println("Your number is [0,50]");
			} else if (x >=51 && x<= 100){
				System.out.println("Your number is [51,100]");
			} else if (x > 100 && x < 501){
				System.out.println(" Your number is greater than 100");
			} else {
				System.out.println("Your number is outside of the requested range!");
			} //end cascading if stmts
			
	/////////////////////////////////////////
			//problem 2 page 29
			int w;
			w = 390- 4 * 62 +3;
			if (w<100)
					System.out.println("w<100");
			else if (w> 100)
			{
				System.out.println("w> 100");
				if (w < 150)
						System.out.println("w < 150");
			}
			else
					System.out.println(" w out of range");
				
			////////////////////////////////
			//problem 3 pg 29
			
			int sideA; //longest side of triangle, confusingly named A instead of C
			int sideB;  // 1 leg of 2
			int sideC;  // 2 leg of 2
			
			System.out.println("Enter the longest side length of the triangle: ");
			sideA = Integer.parseInt(consoleInput.readLine());
			
			System.out.println("Enter the next side length of the triangle: ");
			sideB = Integer.parseInt(consoleInput.readLine());
			
			System.out.println("Enter the last side length of the triangle: ");
			sideC = Integer.parseInt(consoleInput.readLine());
			
			//test for the following cases: no triangle formed, right triangle, obtuse, and acute
			
			//if sideA >= sideB + sideC we don't have a triangle,
			int sideAdd = 0;
			sideAdd = sideB + sideC;
			if (sideA >= sideAdd){
				System.out.println("No triangle is formed, the sum of the legs is less than or equal to hypotenuse!");
			System.exit(0);
			}
			
			//if the square of sideA = the square of sideB + the square of side C we have a right triangle
			
			int sideSquare = (sideB * sideB) + (sideC * sideC);
			int squaresideA = sideA * sideA;
			if (squaresideA == sideSquare){
				System.out.println("Congratulations, it's a right triangle!");
			}
			
			//if the square of sideA is > the sum of the squares of sideB and sideC we have an obtuse triangle
			
			if (squaresideA > sideSquare){
				System.out.println("Triangle is obtuse!");
			}
			
			// lastly if the square of sideA is < the sum of the squares of sideB and sideC we have acute triangle
			
			if(squaresideA < sideSquare){
				System.out.println("The triangle is acute!");
			}
			
			
			
			
			
	}//end main function that contains a horrific hodgepodge of coding problems from chpt 2
}//end program