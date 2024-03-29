package edu.marcos.quartasemana.estruturarepetica;

public class BreakContinue {
    public static void main(String[] args) {
        for (int numero = 1 ; numero <= 5 ; numero++) {
            if (numero == 3) {
                //break;
                continue;
            }
            System.out.println("Numero: " + numero);
        }
    }    
}
/*
 * Quando o java encontra um "break" ele mata a iteração, ou seja para ela
 * Quando ele encontra um "continue" ele pula a iteração atual mas não para ela
 */
