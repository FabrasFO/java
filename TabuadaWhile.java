package br.com.java;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		int x ;
		int i = 1; //Variável de apoio ao laço while
		Scanner teclado = new Scanner(System.in);
		System.out.println("_____________TABUADA_____________");
		System.out.println("");
		System.out.println("Digite o valor da tabuada: ");
		x = teclado.nextInt();
		while (i < 11) {
			System.out.println(x + " x " + i + " = " + (x * i));
			i++;
			
		}
		

	}

}
