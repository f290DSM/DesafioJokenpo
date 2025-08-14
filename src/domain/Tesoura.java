package domain;

public class Tesoura implements Algoritmo {

    @Override
    public String executar(TipoJogada tipoJogada) {
        return switch (tipoJogada) {
            case TESOURA -> "Empatou.";
            case PEDRA -> "Perdeu! A Pedra quebra a tesoura!";
            case PAPEL -> "Ganhou! A Tesoura corta o Papel!";
            case SPOCK -> "Perdeu! O Spock derrete a Tesoura!";
            case LAGARTO -> "Ganhou! A Tesoura decapta o Lagarto!";
            default -> "Tipo inválido!";
        };
    }

}
