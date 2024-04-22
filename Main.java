import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double primeiroDardo, segundoDardo, terceiroDardo;

		System.out.print("Primeiro dardo: ");
		primeiroDardo = scanner.nextDouble();
		System.out.print("Segundo dardo: ");
		segundoDardo = scanner.nextDouble();
		System.out.print("Terceiro dardo: ");
		terceiroDardo = scanner.nextDouble();

		if (primeiroDardo > segundoDardo && primeiroDardo > terceiroDardo) {
			System.out.printf("Dentre os três dardos, o primeiro foi mais longe com %.2f metros", primeiroDardo);
		} else if (segundoDardo > terceiroDardo) {
			System.out.printf("Dentre os três dardos, o segundo foi mais longe com %.2f metros", segundoDardo);
		} else {
			System.out.printf("Dentre os três dardos, o terceiro foi mais longe com %.2f metros", terceiroDardo);
		}
		scanner.close();
	}

}
