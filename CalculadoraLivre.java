package br.com.java;

import java.util.Scanner;

public class CalculadoraLivre {

	public static void main(String[] args) {
		double kelvin, celsius;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora de temperatura em kelvin");
		System.out.println("");
		System.out.println("Valor da temp.Celsius: ");
		celsius = teclado.nextDouble();
		// Processamento
		kelvin = celsius + 273;
		// Sa�da
		System.out.println("Valor em Kelvin: " + kelvin);


	}

}
