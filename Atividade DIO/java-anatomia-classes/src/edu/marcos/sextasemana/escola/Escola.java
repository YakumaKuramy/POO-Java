package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        /*
        Forma inadequada de tratar atribultos de objetos, 
        pois não é permitido tratar deles diretamente 
        felipe.nome = "Felipe";
        felipe.idade = 18;
        System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos");
        A seguir a forma ideal
         */
        felipe.setNome("Felipe");
        felipe.setIdade(18);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");
    }
    
}