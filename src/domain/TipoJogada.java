package domain;

import java.util.stream.Stream;

public enum TipoJogada {
    PAPEL(1),
    TESOURA(2),
    PEDRA(3),
    LAGARTO(4),
    SPOCK(5);

    TipoJogada(Integer id) {
        this.id = id;
    }
    private final Integer id;

    public Integer getId() {
        return id;
    }

    public static TipoJogada getTipoJogada(Integer id) {
        for (TipoJogada tipoJogada : TipoJogada.values()) {
            if (tipoJogada.getId().equals(id)) {
                return tipoJogada;
            }
        }

        throw new IllegalArgumentException("Tipo de jogada inválido");
    }
}
