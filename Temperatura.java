package br.com.java;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		double f, c;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora de temperatura");
		System.out.println("");
		System.out.println("Valor da temp.fahrenheit: ");
		f = teclado.nextDouble();
		// Processamento
		c = 5* (f - 32)/9;
		// Saída
		System.out.println("Valor em Celsius: " + c);

	}

}
