package br.com.gpr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();

        alunos.add("Guilherme Ramalho");
        alunos.add("Alberto");
        alunos.add("Adamastor");
        alunos.add("Sebastiao");
        alunos.add("Sanfonero");
        alunos.add("Pyreana");
        alunos.add("Guilherme Ramalho");

        boolean pauloEstaMatriculado = alunos.contains("Paulo");
        alunos.remove("Pyreana");
        System.out.println(pauloEstaMatriculado);

        System.out.println(alunos.size());

        for (String aluno: alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos);

    }
}
