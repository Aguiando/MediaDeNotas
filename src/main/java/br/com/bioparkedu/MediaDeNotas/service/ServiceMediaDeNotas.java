package br.com.bioparkedu.MediaDeNotas.service;

import br.com.bioparkedu.MediaDeNotas.model.Aluno;

public class ServiceMediaDeNotas {

    //Media de notas
    public double calcularMedia(Aluno aluno) {
        return (aluno.getNota1() + aluno.getNota2() + aluno.getNota3()) / 3;
    }

    //Validação da media de notas
    public String determinarStatus(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 4) {
            return "2ª Oportunidade";
        } else {
            return "Reprovado";
        }
    }

    //Validação da media de notas ate 10.00
    public String mediaAcimaDeDez(double media) {
        if (media > 10) {
            return "Erro, notas acima do valor máximo";
        } else
            return "Notas validadas";
    }
}

