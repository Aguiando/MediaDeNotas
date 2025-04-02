package br.com.bioparkedu.MediaDeNotas;

import br.com.bioparkedu.MediaDeNotas.model.Aluno;
import br.com.bioparkedu.MediaDeNotas.service.ServiceMediaDeNotas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MediaDeNotasApplicationTests {

	@Test
	public void testMediaAprovado() {
		// Cenário: aluno com notas para aprovação
		Aluno aluno = new Aluno("João", 8.0, 7.0, 7.0);
		ServiceMediaDeNotas service = new ServiceMediaDeNotas();

		// Ação
		double media = aluno.media();
		String status = service.determinarStatus(media);

		// Verificação
		assertEquals(7.33, media, 0.01); // Verifica a média com precisão de 0.01
		assertEquals("Aprovado", status); // Verifica se o status é "Aprovado"
	}

	@Test
	public void testMediaSegundaOportunidade() {
		// Cenário: aluno com notas para segunda oportunidade
		Aluno aluno = new Aluno("Maria", 5.0, 5.0, 6.0);
		ServiceMediaDeNotas service = new ServiceMediaDeNotas();

		// Ação
		double media = aluno.media();
		String status = service.determinarStatus(media);

		// Verificação
		assertEquals(5.33, media, 0.01); // Verifica a média com precisão de 0.01
		assertEquals("2ª Oportunidade", status); // Verifica se o status é "2ª Oportunidade"
	}

	@Test
	public void testMediaReprovado() {
		// Cenário: aluno com notas para reprovação
		Aluno aluno = new Aluno("Pedro", 2.0, 3.0, 3.0);
		ServiceMediaDeNotas service = new ServiceMediaDeNotas();

		// Ação
		double media = aluno.media();
		String status = service.determinarStatus(media);

		// Verificação
		assertEquals(2.67, media, 0.01); // Verifica a média com precisão de 0.01
		assertEquals("Reprovado", status); // Verifica se o status é "Reprovado"
	}

	@Test
	public void testMediaAcima(){
		//Cenário: Notas acima de 10.00
		Aluno aluno = new Aluno("Dante", 11.00, 11.00, 11.00);
		ServiceMediaDeNotas service = new ServiceMediaDeNotas();

		//Ação
		double media = aluno.media();
		String status = service.mediaAcimaDeDez(media);

		//Verificação
		assertEquals(11.00, media, 0.01);
	}
}