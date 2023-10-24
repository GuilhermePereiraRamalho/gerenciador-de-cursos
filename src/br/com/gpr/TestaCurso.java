package br.com.gpr;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Domindando as coleções do Java",
                "Guilherme Ramalho");

        javaColecoes.adiciona(new Aula("Trabalhando com Arraylist", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));

        System.out.println(javaColecoes.getAulas());


    }
}
