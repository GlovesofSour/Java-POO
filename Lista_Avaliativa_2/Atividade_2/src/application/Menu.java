package application;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int senha = 0;

        while(senha != 123) {
        	System.out.println("Digite a senha para entrar: ");
        	senha = sc.nextInt();
        	
        	if(senha != 123) {
        		System.out.println("\nERRO DE SENHA");
        	}
        }

        System.out.println("\nSENHA CORRETA");

        int opcao;
        do {
            System.out.println("\nMenu Principal");
            System.out.println("1- Cadastro cliente");
            System.out.println("2- Compra de carro");
            System.out.println("3- Compra de acessório");
            System.out.println("4- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite o nome do cliente: ");
                    String nomeCliente = sc.nextLine();
                    System.out.print("Digite o telefone do cliente: ");
                    String telefoneCliente = sc.nextLine();
                    System.out.print("Digite o endereço do cliente: ");
                    String enderecoCliente = sc.nextLine();
                    System.out.println("Cliente cadastrado com sucesso!\n");
                    break;
                case 2:
                	int escolhaCarro, formaPagamentoCarro;
                    System.out.println("\nOpções de carros:");
                    System.out.println("1- Fiat Uno");
                    System.out.println("2- Volkswagen Gol");
                    System.out.println("3- Honda Civic");
                    System.out.print("Escolha um carro: ");
                    escolhaCarro = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Digite a cor do carro: ");
                    String corCarro = sc.nextLine();
                    System.out.print("Formas de pagamento: ");
                    System.out.println("1- Debito");
                    System.out.println("2- Credito");
                    System.out.println("3- Pix");
                    System.out.print("Escolha: ");
                    formaPagamentoCarro = sc.nextInt();
                    System.out.println("Compra de carro realizada com sucesso!\n");
                    break;
                case 3:
                    System.out.print("\nDigite o nome do acessório: ");
                    String nomeAcessorio = sc.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidadeAcessorio = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Compra de acessório realizada com sucesso!\n");
                    break;
                case 4:
                    System.out.println("\nSaindo do programa. Obrigado!");
                    break;
                default:
                    System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.\n");
            }
        } while (opcao != 4);

        sc.close();
	}

}
