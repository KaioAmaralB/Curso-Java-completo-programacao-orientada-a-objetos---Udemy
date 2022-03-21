import java.util.Scanner;

public class Aula61Funcoes {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();

		int higher = max(a, b, c);

		showResult(higher);

		entrada.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}

		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
