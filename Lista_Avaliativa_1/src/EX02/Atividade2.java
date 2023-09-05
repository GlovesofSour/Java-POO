package EX02;

import java.util.Locale;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String professor, aluno;
		double nota1, nota2, media;
		
		System.out.println("Informe o nome do professor: ");
		professor = sc.nextLine();
		System.out.print("Informe o nome do estudante: ");
		aluno = sc.nextLine();
		System.out.print("Digite a primeira nota do estudante: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota do estudante: ");
		nota2 = sc.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("Nome: "+ aluno);
		System.out.println("Nota 1: "+ nota1);
		System.out.println("Nota 2: "+ nota2);
		System.out.println("Média: " + media);
		
		sc.close();

	}

}
