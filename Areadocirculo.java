package br.com.java;

import java.util.Scanner;

public class Areadocirculo {

	public static void main(String[] args) {
		double area, pi, raio;
		pi = 3.14;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculo da área do circulo");
		System.out.println("");
		System.out.println("raio:");
		raio = teclado.nextDouble();
		//Calculo da área
		area = pi * raio * raio;
		System.out.println("Área: " + area);
		

	}

}
