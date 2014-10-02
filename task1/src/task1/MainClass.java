package task1;

import java.io.IOException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(String.format("%d %d", a / 10, a % 10));
	}

}
