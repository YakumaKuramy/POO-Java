package edu.marcos.quartasemana.tratamentoexecoes;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            // Cep precisa ter 8 digitos
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        }
        catch (CepInvalidoExcepetion e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Cep não corresponde ao formato esperado");
        }
    }

    static String formatarCep (String cep) throws CepInvalidoExcepetion {
        if (cep.length() != 8) {
            throw new CepInvalidoExcepetion();
        }
        
        // simulando um cep formatado
        return "23.765-064";
    }
}
