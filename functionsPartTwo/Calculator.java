package functionsPartTwo;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) { //Main principal
		
		double numOne, numTwo;
		int option, repeat;
		
		Scanner enter = new Scanner(System.in);
		
		System.out.print("Ingresa el primer numero: ");
		numOne = enter.nextDouble();
		
		System.out.print("Ingresa el segundo numero: ");
		numTwo = enter.nextDouble();
		
		do {
			
			System.out.println("*********************************");
			System.out.println("Elige opcion\n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Raiz Cuadrada\n6. Cuadrado");
			System.out.println("*********************************");
			option = enter.nextInt();
			
			switch (option) {
				case 1:
					suma(numOne, numTwo);
				break;
				case 2:
					resta(numOne, numTwo);
				break;
				case 3:
					multi(numOne, numTwo);
				break;
				case 4:
					div(numOne, numTwo);
				break;
				case 5:
					square(numOne, numTwo);
				break;
				case 6:
					pow(numOne, numTwo);
				break;
				default:
					System.out.println("Opcion invalida");
				break;
			}
			
			System.out.println("¿Quieres realizar otra operacion?");
			repeat = enter.nextInt();
			
		}while(repeat == 1);
		
	} //Main principal
	

	private static void suma(double a, double b) {
		System.out.println("Suma: "+ (a+b));
	}
	
	private static void resta(double a, double b) {
		System.out.println("Resta: " + (a-b));
	}
	
	private static void multi(double a, double b) {
		System.out.println("Multiplicacion: " + (a*b));
	}
	
	private static void div(double a, double b) {
		System.out.println("Division: " + (a/b));
	}
	
	private static void square(double a, double b) {
		System.out.println("Raiz de " + a + " es: " + Math.sqrt(a));
		System.out.println("Raiz de " + b + " es: " + Math.sqrt(b));
	}
	
	private static void pow(double a, double b) {
		System.out.println(a + " elevado a la " + b + " es: " + Math.pow(a, b));
	}
	

}
