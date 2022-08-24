package main;
import java.util.Scanner; /* Первое задание */

public class main {
	public static void main(String[] args) {
	Scanner scan = 	new Scanner(System.in);
	double a = scan.nextDouble();
	double b = scan.nextDouble();
	double d = a*a + b*b;
	double c = Math.sqrt(d);
	
	System.out.println(c);	
	}

}