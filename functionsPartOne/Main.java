package functionsPartOne;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.print( "Ingresa tu nombre:  " );
        String name = console.next();
        printNameCharacters( name );
        printNameLength( name );
        
        System.out.println("Ingrese su apellido: ");
        String lastName = console.next();
        
        printFullName(name, lastName);
        
        console.close();
    }

    private static void printNameLength( String name )
    {
    	System.out.println("El tamaño de la cadena es: " + name.length());
    }

    private static void printNameCharacters( String name )
    {
    	for(int i = 0; i < name.length(); i++) {
    		System.out.println(name.charAt(i));
    	}
    }
    
    private static void printFullName(String name, String lastName) {
		System.out.println(name + " " + lastName);
	}


}