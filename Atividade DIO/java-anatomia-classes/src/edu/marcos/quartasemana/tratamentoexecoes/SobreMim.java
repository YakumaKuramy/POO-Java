package edu.marcos.quartasemana.tratamentoexecoes;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class SobreMim {
    public static void main(String[] args) {
        try {
            // bloco de codigo conforme o esperado
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
    
            System.out.println("Digite seu sobrenome: ");
            String sobreNome = scanner.next();
    
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
    
            System.out.println("Digite sua idade: ");
            double altura = scanner.nextDouble();
    
    
            System.out.println("Olá, me chamo " + nome.toUpperCase() + sobreNome.toUpperCase());
            System.out.println("Tenho " + idade + "anos");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        } 
        catch (InputMismatchException e ) {
            // bloco de codigo que captura as exeções que podem acontecer
            // em caso de um fluxo não previsto
            System.out.println("Os campos *idade e * altura precisam ser numericos");
        }
    }
}
