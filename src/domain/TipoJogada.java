package domain;

public enum TipoJogada {
    PAPEL(1),
    TESOURA(2),
    PEDRA(3),
    LAGARTO(4),
    SPOCK(5);

    TipoJogada(int id) {
        this.id = id;
    }
    private final Integer id;

    public Integer getId() {
        return id;
    }
}
