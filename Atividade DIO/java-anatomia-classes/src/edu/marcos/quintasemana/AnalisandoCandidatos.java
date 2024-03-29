package edu.marcos.quintasemana;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class AnalisandoCandidatos {
    
    // metodo principal
    public static void main(String[] args) {
        System.out.println("Processo seletivo");
        String [] candidatos = {"Marcos", "Grazy", "Marcia", "Luiza", "Luzia"};
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

    // metodo que liga para o candidato
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas ++;
            }
            else {
                System.out.println("Contato realizado com sucesso");
            }
        }
        while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu) {
            System.out.printf("Conseguimos contato com o candidato %s na tentativa %d\n", candidato, tentativasRealizadas);
        }
        else {
            System.out.printf("Não conseguimos contato com o candidato %s número máximo %d realizadas\n", candidato, tentativasRealizadas);
        }
    }
    // metodo para saber se o candidato atendeu o telefone
    static boolean atender () {
        return new Random().nextInt(3)==1;
    }

    // metodo de seleção do candidato com base no salario pretendido
    static void selecaoCandidatos() {
        double salarioBase = 2000.0;
        String [] candidatos = {"Marcos", "Grazy", "Marcia", "Luiza", "Luzia", "Cremilda", "Paula", "Paulo", "João", "Paula"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.printf("O candidato %s solicitou este valor de salario %.2f\n", candidato,salarioPretendido);
            //System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido); 
            if (salarioBase >= salarioPretendido) {
                System.out.printf("O candidato %s foi selecionada para a vaga\n", candidato);
                //System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    } 

    // gera um valor de salario aleatorio
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // analise do salario do candidato
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        }
        else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        }
        else{
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"Marcos", "Grazy", "Marcia", "Luiza", "Luzia"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        // exemplo do for tradicional
        for (int indice = 0 ; indice < candidatos.length ; indice++) {
            System.out.printf("O candidato de nº %d é o %s\n", indice + 1, candidatos[indice]);
        }
        // uso quando o indice não é necessário
        System.out.println("Forma abreviada de interação for each");
        for (String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
}


