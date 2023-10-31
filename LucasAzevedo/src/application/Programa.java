package application;

import entities.Monitores;
import entities.Impressoras;
import entities.Placavideos;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Monitores monitor = new Monitores();
        Impressoras impressora = new Impressoras();
        Placavideos placavideo = new Placavideos();

        while (true) {
            System.out.println("MENU de cadastro:");
            System.out.println("1. Monitores");
            System.out.println("2. Impressoras");
            System.out.println("3. Placavideos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = input.nextInt();

            if (opcao == 1) {
                System.out.print("Nome do monitor: ");
                String nomeMonitor = input.next();
                monitor.setNome(nomeMonitor);

                System.out.print("Quantidade de monitores: ");
                int quantidadeMonitores = input.nextInt();
                monitor.setQuantidade(quantidadeMonitores);

                System.out.print("Deseja alterar o nome do monitor (S/N)? ");
                String alterarNome = input.next();

                if (alterarNome.equalsIgnoreCase("S")) {
                    System.out.print("Novo nome do monitor: ");
                    String novoNomeMonitor = input.next();
                    monitor.setNome(novoNomeMonitor);
                }

                System.out.println("Informações do monitor:");
                monitor.imprimirInformacoes();
            } else if (opcao == 2) {
                System.out.print("Nome da impressora: ");
                String nomeImpressora = input.next();
                impressora.setNome(nomeImpressora);

                System.out.print("Quantidade de impressoras: ");
                int quantidadeImpressoras = input.nextInt();
                impressora.setQuantidade(quantidadeImpressoras);

                System.out.print("Deseja alterar o nome da impressora (S/N)? ");
                String alterarNome = input.next();

                if (alterarNome.equalsIgnoreCase("S")) {
                    System.out.print("Novo nome da impressora: ");
                    String novoNomeImpressora = input.next();
                    impressora.setNome(novoNomeImpressora);
                }

                System.out.println("Informações da impressora:");
                impressora.imprimirInformacoes();
            } else if (opcao == 3) {
                System.out.print("Nome da placa de vídeo: ");
                String nomePlacaVideo = input.next();
                placavideo.setNome(nomePlacaVideo);

                System.out.print("Quantidade de placas de vídeo: ");
                int quantidadePlacasVideo = input.nextInt();
                placavideo.setQuantidade(quantidadePlacasVideo);

                System.out.print("Deseja alterar o nome da placa de vídeo (S/N)? ");
                String alterarNome = input.next();

                if (alterarNome.equalsIgnoreCase("S")) {
                    System.out.print("Novo nome da placa de vídeo: ");
                    String novoNomePlacaVideo = input.next();
                    placavideo.setNome(novoNomePlacaVideo);
                }

                System.out.println("Informações da placa de vídeo:");
                placavideo.imprimirInformacoes();
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        input.close();
    }
}