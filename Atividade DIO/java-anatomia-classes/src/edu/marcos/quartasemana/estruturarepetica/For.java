package edu.marcos.quartasemana.estruturarepetica;

public class For {
    /*
     * for (bloco de inicialização ;expressão boleana de validaão ; bloco de atualização ){
     *      comando a ser executado ate que a 
     *      expressão de validação torne-se falsa
     *}
     */
    public static void main(String[] args) {
        // "For" = "Para"
        //  criação da vaariavel de controle ; definição do limite ; encremento 
        for ( int carneirinhos = 1 ; carneirinhos <= 20 ; carneirinhos ++ ) {
            System.out.println("Contando carneirinhos: " + carneirinhos);
        }
    }
}
