package task1;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
		//int a = System.in.read();
		
	    System.out.print(a / 10);
		System.out.print(' ');
		System.out.println(a % 10);
	}

}
