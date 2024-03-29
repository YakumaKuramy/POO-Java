package edu.marcos.segundasemana.anatomiadasvariaveis;

public class SmartTv {
    // Atribultos mais básicos de uma TV 
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Criação dos principais métodos
    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--;
    }

    public void aumentarCanal() {
        this.canal++;
    }

    public void diminuirCanal() {
        this.canal--;
    }

    public void mudarCanal(int novoCanal) {
        this.canal = novoCanal;
    }

    public void imprimirEstado() {
        // Impressão dos principais atribultos
        System.out.println("TV ligada? " + this.ligada);
        System.out.println("Qual canal? " + this.canal);
        System.out.println("Volume: " + this.volume);
    }
}
