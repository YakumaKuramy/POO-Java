package edu.marcos.terceirasemana.controlefluxo;

public class ResultadoEscolarEncadeada {
    public static void main(String[] args) {
     int nota = 10;
     
     if (nota >= 7) {
        System.out.println("Aprovado");
        }
     else if (nota < 7 && nota >= 5) { // Atribuições desse tipo sempre retornam true ou false
        System.out.println("Recuperação");
        }
     else {
        System.out.println("Reprovado");
        }
    }
}
