package br.com.gpr;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Domindando as coleções do Java",
                "Guilherme Ramalho");

        javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com Coleções", 24));

        Aluno a1 = new Aluno("Adamastor", 34672);
        Aluno a2 = new Aluno("Alberto", 5617);
        Aluno a3 = new Aluno("KBones", 17645);


        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);


        System.out.println("Quem é o aluno com matricula 5617:");
        Aluno aluno = javaColecoes.buscaMatriculado(5617);
        System.out.println("aluno: " + aluno);
    }
}
