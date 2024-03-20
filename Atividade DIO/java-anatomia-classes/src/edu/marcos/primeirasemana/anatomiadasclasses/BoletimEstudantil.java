package edu.marcos.primeirasemana.anatomiadasclasses;

// Criação da classe principal
public class BoletimEstudantil {
    // Criação da classe de leitura 
    public static void main(String[] args){
        int mediaFinal = 8; // Criação de uma variavel contendo a media final do aluno
    
    // Entenda a estrutura do 'if' no java
    // if (condição de comparação) {
    // corpo/calculo do 'if'
    //} 

        if (mediaFinal < 6) { // Comparação de valores  
            System.out.println("REPROVADO"); // -> Sistema, encontre uma saida e mostre isso "mensagem"
        }
        else if (mediaFinal == 6) {
            System.out.println("PROVA MINERVA");
        }
    // Estrutura levemente diferente, mas com o mesmo siginificado
        else {
            System.out.println("APROVADO");
        }

    }
}

