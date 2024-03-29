package edu.marcos.quartasemana.estruturarepetica;

public class ForArray {
    public static void main(String[] args) {
        String alunos[] = {"João", "Maria", "Pedro", "Marcos"};
        for (int x = 0 ; x < alunos.length ; x++) {
            //System.out.println("O aluno no indice x:" + x + " é " + alunos[x]);
            System.out.printf("O aluno no indice x: %d é %s \n", x, alunos[x]);
        }
    }
}
