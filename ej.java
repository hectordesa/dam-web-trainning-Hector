import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String cadena;
		int errores = 0;
		
		System.out.println("Introduce una cadena: ");
		cadena = in.nextLine();
		
			
		for(int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) < 'A' || cadena.charAt(i) > 'Z'|| cadena.charAt(i) == '$' || cadena.charAt(i) == '%') {			
			} else {
				System.out.println("Caracter incorrecto en la posicion " + (i+1));
				errores += 1;
			}	
		}
		if(errores == 0) {
			System.out.println("Resultado: CORRECTA.");
			System.out.println("Contador de errores: " + errores);
		} else {
			System.out.println("Resultado: INCORRECTA.");
			System.out.println("Contador de errores: " + errores);
		}
	}

}
