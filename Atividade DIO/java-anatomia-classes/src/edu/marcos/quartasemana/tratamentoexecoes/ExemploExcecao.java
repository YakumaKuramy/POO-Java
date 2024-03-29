package edu.marcos.quartasemana.tratamentoexecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");
        try {
            valor = NumberFormat().getInstance().parse("a1.75");
            System.out.println(valor); 
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static NumberFormat NumberFormat() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'NumberFormat'");
    }

    @Override
    public String toString() {
        return "ExemploExcecao []";
    }
}
