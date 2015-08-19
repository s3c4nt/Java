
import acm.program.*;
import java.lang.Math;

public class Problems2dot6 extends ConsoleProgram {
	double y = 0;
	
public void run(){
	//problems 2.6 pg 24 #1 a and b
	//a
	double x = 59.2/4.0;
	println(Math.pow(x,4.0));
//b
boolean b;
 b = !(true && !(false || true));
 println(b);
	
//prob 2.6 #2
 //a
 	double a=1;
 	double bee = 2;
 	double result;
 	result = (a/bee) +1;
 	println(result);

//b
	double c = 4;
	double d = 3;
	double e = 3;
	double f = 3; 
	double eandf = e+f;
	println(result = (a + (bee/c))/(d - Math.pow(eandf,2)));
	
//c
	println(result = a + (bee/(c - d)));

	}
}
