package EX01;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int valor1, valor2;
		double divisao;
		
		System.out.print("Digite o seu nome: ");
		nome = sc.nextLine();
		System.out.print("Digite o primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = sc.nextInt();
		
		divisao = valor1 / (double)valor2;
		
		System.out.println("Cliente: "+ nome);
		System.out.println("Valor 1: "+ valor1);
		System.out.println("Valor 2: "+ valor2);
		System.out.println("A divisão dos valores é: " + divisao);
		
		sc.close();
	}

}
