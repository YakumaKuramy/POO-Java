package edu.marcos.quartasemana.estruturarepetica;

import java.util.Random;

public class DoWhile {
    /*
     * Usamos o do while quando precisamos verificar que aquela condição pelo menos uma vez
     */
    public static void main(String[] args) {
        System.out.println("Discando... ");
        do {
            System.out.println("Telefone tocando... ");
        }
        // nesse caso usamos o ";" para executar 
        while ( tocando() ) ;

        System.out.println("Alô !!!");
    }

    private static boolean tocando( ) {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        // negando o ato de continuar tocando
        return ! atendeu;
    }

    
}
