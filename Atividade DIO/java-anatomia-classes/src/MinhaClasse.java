public class MinhaClasse { // <- o nome da classe principal precisa ser o mesmo que o do projeto/arquivo
    public static void main(String[] args) { // <- metodo | "main" primeiro metodo a ser chamado
        System.out.println("Ola, seja bem-vindo ao meu codigo!"); // <- saida/impressão em tela da mensagem

        // Regra de anatomia de classes em java

        // Criação de variaveis constantes | para esses casos, deixamos o nome da variavel completamente MAIUSCULO e atribuimos a ela o tipo 'final'
        final String BR = "Brasil";
        final double PI = 3.14;
        final int ESTADOS_BRASILEIROS = 27;
        final int ANO_2000 = 2000;

        
        // Note que ao usar essa conversão, os valores se tornam imultaveis e a tentativa de o faze-lo retornara um erro 
        // Nomes de variaveis em java devem conter apenas e no maximo: letras, numeros de 0 a 9, '_' ou '$', obrigatoriamente começar com uma letra e jamais com outro elemento 
        
        
        String meuNome = "Marcos";
        // Perceba que ha sempre uma estrutura simples a seguir na declaração de variaveis, declare o tipo, o nome da variavel (de acordo com as convenções), e atribua um valor a ela, porém
        String sobrenome;
        // Você não é obrigado a fazer isso imediatamente, contudo os passos anteriores são obrigatorios
        sobrenome = "Sousa";
        // Chamada do metodo nomeCompleto, o mesmo pode ser feita declarando uma variavel e atribuindo os valores de nomeCompleto passando meuNome e sobrenome ao metodo como parametro
        System.out.println(nomeCompleto(meuNome, sobrenome));

        
        // O mesmo vale para outros tipos, exmplos abaixo
        int anoNascimento;
        boolean simNao;


        // Agora manipularemos os valores de acordo com nossa necessidade
        anoNascimento = 1997;

        // Anatomia de metodos em java

// Nesse caso parametros são opcionais/necessidade
//      TipoRetorno NomeObjetivoNoInfinitivo Parametro(s){ 
//          corpo }
    
    }
    // Exemplo 
    // Classe publica | Valor de retorno | Nome objetivo | Argumentos
    public int somar( int numeroUm, int numero2){
        return numeroUm + numero2;
    }
    // A depender do uso, você pode ter um valor de entrada de um tipo e um valor de saida de outro tipo por meio de converção do mesmo
    //public String formatarCep(long cep) {
        //return cep;
    //}

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        // Forma simples e errada de fazer
        // return primeiroNome + " " + segundoNome;
        // Forma robusta e certa
        return primeiroNome.concat(" ").concat(segundoNome);

    }
}
