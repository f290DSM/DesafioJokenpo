package domain;

public class Papel extends Algoritmo {
    @Override
    public String executar(TipoJogada tipoJogada) {
        return switch (tipoJogada) {
            case PAPEL -> "Empatou.";
            case TESOURA -> "Perdeu! A Tesoura corta o Papel.";
            case PEDRA -> "Ganhou! O Papel embrulha a Pedra!";
            case LAGARTO -> "Perdeu! A Lagarto come o Papel.";
            case SPOCK -> "Ganhou! O Papel refuta o Spock!";
            default -> "Tipo inválido!";
        };
    }
}
