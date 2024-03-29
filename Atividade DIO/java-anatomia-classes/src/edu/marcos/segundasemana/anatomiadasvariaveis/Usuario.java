package edu.marcos.segundasemana.anatomiadasvariaveis;

public class Usuario {
    public static void main(String[] args) {
        // Criação do objeto smartTv
        SmartTv smartTv = new SmartTv();
        smartTv.imprimirEstado();
        smartTv.ligar();
        smartTv.imprimirEstado();
        smartTv.diminuirVolume();
        smartTv.imprimirEstado();
        smartTv.aumentarVolume();
        smartTv.imprimirEstado();
        smartTv.mudarCanal(13);
        smartTv.desligar();
        smartTv.imprimirEstado();
    }
}

