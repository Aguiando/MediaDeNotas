package br.com.bioparkedu.MediaDeNotas.model;

public class Aluno {

    private String nome;
    private Double nota1;
    private Double nota2;
    private Double nota3;


    public Aluno(String nome, Double nota1, Double nota2, Double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Aluno() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public double media(){
        return (nota1 + nota2+ nota3)/3;
    }

}
