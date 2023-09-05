package EX03;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String produto;
		int i, num, qtde;
		double valor, subtotal, total=0;
		
		for(i=0; i < 3; i++) {
			
			System.out.print("Digite o numero da mesa: ");
			num = sc.nextInt();
			System.out.print("Digite o nome do produto(Bebida ou comida): ");
			produto = sc.next();
			System.out.print("Digite o preço do produto: ");
			valor = sc.nextDouble();
			System.out.print("Digite a quantidade de produtos desejados: ");
			qtde = sc.nextInt();
			
			subtotal = valor * qtde;
			total += subtotal;
			
			System.out.println("\nPedido " + (i + 1) + ":");
            System.out.println("Número da Mesa: " + num);
            System.out.println("Produto: " + produto);
            System.out.println("Valor: R$" + valor);
            System.out.println("Quantidade: " + qtde);
            System.out.println("Subtotal: R$" + subtotal +"\n");
		}
		 System.out.println("Valor total: R$" + total);
		 
		sc.close();
	}

}
