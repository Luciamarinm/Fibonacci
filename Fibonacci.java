//LUCIA MARIN MARTINEZ
package es.fempa.dam.programacionjava;

import java.util.Scanner;

public class Fibonacci {
	public static void mostrarPosicion() {
		Scanner sc = new Scanner(System.in);
		int ultimo = 0;
		int penultimo = 1;
		int resultado = 0;
		int repeticion;
		
		System.out.println("Que posición de la sucesión de Fibonacci quieres conocer?");
		repeticion = sc.nextInt();

		for (int i = 1; i < repeticion; i++) {
			//System.out.println(ultimo);
			resultado = ultimo + penultimo;
			penultimo = ultimo;
			ultimo = resultado;
	}
		System.out.println("La posición " + repeticion + " En la sucesión de Fibonacci es: " + resultado);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		mostrarPosicion();
	
		
		
	}
	

}
