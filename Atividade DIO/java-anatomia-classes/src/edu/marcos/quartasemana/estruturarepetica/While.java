package edu.marcos.quartasemana.estruturarepetica;
import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.printf("Doce do valor %.2f adicionado ao carrinho \n", valorDoce);
            mesada -= valorDoce;            
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho maldito, gastou toda sua mesada com doces e morrera em breve de diabetes");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
