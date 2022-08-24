package main;
import java.util.Scanner; /* Первое задание */

public class main {
	public static void main(String[] args) {
	Scanner scan = 	new Scanner(System.in);
	int a = scan.nextInt();
    int b = a + 1;
    int c = a - 1;
	
	System.out.println
	("The next number for the number" + " " + a + " " + "is"+ " " + b);
	
	System.out.println
	("The previous number for the number" + " " + a + " " + "is" + " " + c);
	}

}