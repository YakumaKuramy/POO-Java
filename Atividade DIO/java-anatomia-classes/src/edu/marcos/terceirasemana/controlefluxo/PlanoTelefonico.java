package edu.marcos.terceirasemana.controlefluxo;

public class PlanoTelefonico {
    /*
     * Perceba que não a uso do "break" nos casos porque os planos são crescentes,
     * ou seja, quem recebe "B" não recebe os anteriores a ele
     * e o default pega toda e qualquer situação diferente das aceitas e para o programa
     */
    public static void main(String[] args) {
        String plano = "G"; // T > M > B

        switch (plano) {
            case "T":
                System.out.println("5GB Youtube");
            case "M":
                System.out.println("Whats e Instagram grátis");
            case "B":
                System.out.println("100 minutos de ligação");
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}
