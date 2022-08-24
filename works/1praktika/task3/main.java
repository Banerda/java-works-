package main;
import java.util.Scanner; /* Третье задание */

public class main {
	public static void main(String[] args) {
	Scanner scan = 	new Scanner(System.in);
	int N = scan.nextInt(); /* Количество детей */
	int K = scan.nextInt(); /* Количество яблок */
	int a = K/N;
	
	
	System.out.println(a);
	}

}
