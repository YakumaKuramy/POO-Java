package edu.marcos.quintasemana;

import java.util.Scanner;

public class DesafioControleFluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int paramentroDois = scanner.nextInt();

        try {
            // chamando o metódo contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        }

        catch () {
            // imprimir a mensagem: O segundo parâmetro deve ser aior que o primeiro
            
        }

    }  

    static void contar (int paramentroUm, int paramentroDois) throws ParametrosInvalidosException {
        // validar se o parametroUm é MAIOR que parametros e lançar a execeção
        
        int contagem = paramentroDois - paramentroUm;
        //realziar o for para imprimir os números com base na variável contagem

    }
}
