package br.com.java;

import java.util.Scanner;

public class ConversorDeMoeda {

	public static void main(String[] args) {
		double dolar,real, conversor;
		real = 3.73;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Conversor do dolar em real");
		System.out.println("");
		System.out.println("Valor do dol�r: 3.73");
		System.out.println("");
		System.out.println("real:");
		dolar = teclado.nextDouble();
		// Conversor
		conversor = dolar * real; 
		System.out.println("Real em d�lar : " + conversor);


	}

}
