package edu.marcos.segundasemana.anatomiadasvariaveis;

public class Operadores {
    public static void main(String[] args) {
        // Operadores Ternarios
        int a, b;

        a = 5;
        b = 6;
        // Perceba essa é uma comparação boleana | true or false 
        String resultadoStr = a == b ? " verdadeiro" : "falso";

        int resultadoInt = a != b ? 1 : 0;

        System.out.println(resultadoStr);
        System.out.println(resultadoInt);

        // Operadores de atribuição
        int numero1 = 1;
        int numero2 = 2;

        // Criação e atribuição de um valor verdadeiro ou falso
        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        //Apenas atribuição de um valor de comparação
        simNao = numero1 < numero2;
        System.out.println("numeroUm é menor a numeroDois? " + simNao);

        //Apenas atribuição 
        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior a numeroDois? " + simNao);

        //Apenas atribuição 
        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente a numeroDois? " + simNao);


        String nomeUm = "MARCOS";
        String nomeDois = new String("MARCOS");
        System.out.println(nomeUm == nomeDois); // Forma inadequada de fazer a comparação entre Strings e Objetos, tendo em vista que são estruturas logicas diferentes
        System.out.println(nomeUm.equals(nomeDois)); // Metodos adequado de fazer essa comparação


        // Operadores lógicos 
        // - && = "E" - "AND"
        // - || = "OU" - "OR"
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) { // Se amabas as condições são verdadeiras
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2) { // Se pelo menos uma das condições é verdadeira
            System.out.println("Pelo menos umas das condições é verdadeiras");
        }
        if (condicao1 && (7 > 4)) { // Exemplo com operadores/condições relacionais
            System.out.println("Nesse caso ambas são verdadeiras");
        }
        System.out.println("FIM");

    }
}
