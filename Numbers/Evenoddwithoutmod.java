package come.java.examples;

import java.io.IOException;
import java.util.Scanner;

public class Evenoddwithoutmod {
	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		int result = (number / 2) * 2;
		if (result == number) {
			System.out.println("no is even");
		} else
			System.out.println("no is odd");
	}
}
