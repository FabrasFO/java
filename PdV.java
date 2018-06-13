package br.com.java;

import java.util.Scanner;

public class PdV {

	public static void main(String[] args) {
		 double total, desconto, troco, valor, totald ;
	     Scanner teclado = new Scanner(System.in);
         System.out.println("Calculadora do troco");
	     System.out.println("");
	     System.out.println("Total: ");
	     total = teclado.nextDouble();
	     System.out.println("Desconto :");
         desconto = teclado.nextDouble();
         // total com desconto
         totald = total - ((total * desconto) / 100);
         //saída
         System.out.println("Total com desconto: " + totald);
         System.out.println("============================== " );
         //dinheiro dado
         System.out.println("Dinheiro dado: ");
	     valor = teclado.nextDouble();
	     // Troco
	     troco = valor - totald;
	     System.out.println("Troco: " + troco);
	    
         

	}

}
