package br.com.java;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
		double gas, alcool;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Digite o valor do �lcool:");
		alcool = teclado.nextDouble(); 
		System.out.println("Digite o valor da gasolina:");
		gas = teclado.nextDouble();
		// Divis�o
		gas= alcool / gas;
		
		
		if (gas < 0.7 ) {
			System.out.println("Compre o �lcool");
			
		} else {
            System.out.println("Compre a Gasolina ");
		}
	}

}
