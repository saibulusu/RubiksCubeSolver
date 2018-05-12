package console;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		RubiksCube cube = new RubiksCube();
		System.out.println(cube);
		cube.scramble();
		Scanner scan = new Scanner(System.in);
		if (scan.next().equals("solve")) {
			System.out.println("START SOLVING NOW\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			cube.solve();
		}
		cube.solve();
		System.out.println(cube);
	}
}
