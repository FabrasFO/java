package br.com.java;

import java.util.Scanner;

public class CalculadoraLucro {

	public static void main(String[] args) {
	     double custo, lucro, venda;
	     Scanner teclado = new Scanner(System.in);
         System.out.println("Calculadora do lucro");
	     System.out.println("");
	     System.out.println("pre�o de custo: ");
	     custo = teclado.nextDouble();
	     System.out.println("% de lucro :");
         lucro = teclado.nextDouble();
         // Processamento
         venda = custo + ((custo * lucro) / 100);
         //sa�da
         System.out.println("pre�o de venda: " + venda);
	}

}
