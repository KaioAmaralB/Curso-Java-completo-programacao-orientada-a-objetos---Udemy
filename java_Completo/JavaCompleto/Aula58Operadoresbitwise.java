import java.util.Scanner;

public class Aula58Operadoresbitwise {

	public static void main(String args[]) {

		try (Scanner entrada = new Scanner(System.in)) {
			int mask = 0b100000;
			int n = entrada.nextInt();

			if ((n & mask) != 0) {
				System.out.println(" 6th bit is true!");
			} else {
				System.out.println("6th bit is false!");
			}
		}

	}

}
