package br.com.java;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		// a linha abaixo cria vari�veis do tipo real 
		float nota1, nota2, media;
        //entrada
        System.out.print("digite a nota1: ");
        //a linha abaixo cria um objeto de nome teclado usando o scanner
        Scanner teclado = new Scanner(System.in);
        //a linha baixo usa o objeto teclado para capturar o que foi
        //digitado no console e armazenar na vari�vel
        nota1 = teclado.nextFloat();
        System.out.print("digite a nota2: ");
        nota2 = teclado.nextFloat();
        //processamento 
        media = (nota1 + nota2) / 2;
        // saida 
        // junta um texto com o conte�do da vari�vel media
        System.out.println("M�dia final: " + media);
        // Estrutura condicional para verificar o status do aluno
        // menor ou igual a 2 - reprovado
        // entre 2 e 5 - recupera��o
        // maior ou igual a 5 - aprovado
        if (media <= 2) {
        	System.out.println("REPROVADO");
					} else if (media > 2 && media < 5 ) {
            System.out.println("RECUPERA��O");
            
		}     else   { 
			   System.out.println("APROVADO");
		}
	}
}