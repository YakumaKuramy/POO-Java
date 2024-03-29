package edu.marcos.terceirasemana.escopo;

class CalcularDividaExponencial {

    public static void main(String[] args) {
        System.out.println();
    }

    public double calcularDividaExponencial(){
        double valorParcela = 50.0;
        double valorMontante = 0.0;

        for (int x = 1; x <= 5; x++) {
            double valorCalculado = valorParcela * x;
            valorMontante += valorCalculado;       
        }
        return valorMontante;
    }

}