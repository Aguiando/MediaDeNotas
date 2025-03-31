package br.com.bioparkedu.MediaDeNotas;

import br.com.bioparkedu.MediaDeNotas.model.Aluno;
import br.com.bioparkedu.MediaDeNotas.service.ServiceMediaDeNotas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.print.attribute.standard.Media;
import java.util.Scanner;

public class MediaDeNotasApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ServiceMediaDeNotas service = new ServiceMediaDeNotas();
		Aluno aluno = new Aluno();

		//Nome do aluno
		System.out.println("Digite o nome do aluno: ");
		String nome = scanner.nextLine();
		aluno.setNome(nome);

		//Primeira nota
		System.out.println("Digite o valor da primeira nota: ");
		double nota1 = scanner.nextDouble();

		//Validação da primeira nota
		while (nota1 < 0 || nota1 > 10) {
			System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
			nota1 = scanner.nextDouble();
		}
		aluno.setNota1(nota1);


		//Segunda nota
		System.out.println("Digite o valor da segunda nota: ");
		double nota2 = scanner.nextDouble();

		//Validação da segunda nota
		while (nota2 < 0 || nota2 > 10) {
			System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
			nota2 = scanner.nextDouble();
		}
		aluno.setNota2(nota2);


		//Terceira nota
		System.out.println("Digite o valor da terceira nota: ");
		double nota3 = scanner.nextDouble();
		aluno.setNota3(nota3);

		//Validação terceira nota
		while (nota3 < 0 || nota3 > 10) {
			System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
			nota3 = scanner.nextDouble();
		}
		aluno.setNota3(nota3);

		//Determina o status do aluno
		String status = service.determinarStatus(aluno.media());

		//Resultado
		System.out.println("Aluno: " + aluno.getNome() +
				"\nmédia: " + String.format("%.2f", aluno.media()) +
				"\nStatus: " + status);


		scanner.close();

	}

}


