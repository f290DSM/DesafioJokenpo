import java.util.Random;
import java.util.Scanner;

import domain.Algoritmo;
import domain.Jokenpo;
import domain.Papel;
import domain.Tesoura;
import domain.TipoJogada;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha uma das opções [ 1-PAPEL, 2-TESOURA, 3-PEDRA, LAGARTO-LAGARTO, 5-SPOCK ]\n");
        int jogada = in.nextInt();
        int computador = new Random().nextInt(2) + 1;
        
        TipoJogada jogadaUsuario = TipoJogada.getTipoJogada(jogada);
        TipoJogada jogadaComputador = TipoJogada.getTipoJogada(computador);
        Algoritmo algoritmo = getAlgoritmo(jogadaUsuario);

        System.out.println("O COMPUTADOR escolheu: " + TipoJogada.getTipoJogada(computador));

        Jokenpo jokenpo = new Jokenpo();
        jokenpo.setAlgoritmo(algoritmo);
        jokenpo.jogar(jogadaComputador);

        in.close();
    }

    private static Algoritmo getAlgoritmo(TipoJogada tipoJogada) {
        Algoritmo algoritmo = null;
        switch (tipoJogada) {
            case PAPEL -> algoritmo = new Papel();
            case TESOURA -> algoritmo = new Tesoura();
            default -> throw new IllegalArgumentException("Tipo inválido!");
        }
        return algoritmo;
    }
}