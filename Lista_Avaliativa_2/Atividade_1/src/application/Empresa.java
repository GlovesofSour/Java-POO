package application;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empresa = 1;
		while (empresa != 0) {

			System.out.println("Digite o nome da empresa: ");
			String nome = sc.next();
			System.out.println("Digite o CNPJ da empresa: ");
			int cnpj = sc.nextInt();
			System.out.println("Informe a renda da empresa: ");
			double renda = sc.nextDouble();

			System.out.println("\nEmpresa:" + nome);
			System.out.println("CNPJ:" + cnpj);
			System.out.printf("Renda Bruta: %.2f", renda);

			System.out
					.println("\n\nDeseja cadastrar outra empresa? (digite um numero para continuar ou 0 para sair): ");
			empresa = sc.nextInt();

		}
		System.out.println("Programa finalizado!");

		sc.close();
	}

}
