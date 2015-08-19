// Draw X row by Y column black and white checker board

import java.awt.Color;

import acm.graphics.*;
import acm.program.*;




public class Checkerboard extends GraphicsProgram {

	int xColumns = 8;   //store user defined vars for number of rows and columns
	int yRows = 9;
	int counterx = 0;
	int countery = 0;
	double dxIncrement = 0;
	double dyIncrement = 0;
	double displacement = 30;
	int colorSwitch = 1;  //counter that helps squares alternate color (fill/nofill)
	//make sure to check for non zero values for column and row, else nothing to draw
	
	public void run(){
		
		for (countery = 0; countery < yRows; countery++){
			while ( counterx < xColumns){
				Drawsquare(dxIncrement, dyIncrement); 
				counterx++;
				dxIncrement = dxIncrement + displacement;
			} //end while
		dyIncrement = dyIncrement + displacement;
		dxIncrement = 0;
		colorSwitch++; //ensures the checkerboard pattern is right on new rows
		counterx = 0; // reset counters for x and dyIncrement so we can draw another row
			 
		}	//end for stmt rows
	} //ends run
	
	void Drawsquare(double dx, double dy){
		GRect square = new GRect(dx, dy, 30, 30);
		square.setFillColor(Color.black);
		square.setColor(Color.black);
		square.setFilled(true);
		
		for(int i = 1;i < 20; i++){ 
			if( colorSwitch % 2 == 0){
			square.setFilled(true);
			
		} else {
			square.setFilled(false);
			
		} //ends else
	   colorSwitch++;
		add(square);
		} //ends for
	}//ends Drawsquare
	
	
} //ends Checkerboard
