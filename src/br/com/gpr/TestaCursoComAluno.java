package br.com.gpr;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {
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

        System.out.println("Todos os alunos matriculados: ");

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();
        while (iterator.hasNext()){
            Aluno proximo = iterator.next();
            System.out.println(proximo);
        }

        Vector<Aluno> vetor = new Vector<>();


//        javaColecoes.getAlunos().forEach(a -> {
//            System.out.println(a);
//        });

        System.out.println("O aluno" + a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno adamastor = new Aluno("Adamastor", 34672);
        System.out.println("E esse Adamastor, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(adamastor));

        System.out.println("O a1 é equals ao Adamastor?");
        System.out.println(a1.equals(adamastor));

        // obrigatoriamente o seguinte é true:
        System.out.println(a1.hashCode() == adamastor.hashCode());
    }
}
