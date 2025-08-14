package domain;

public class Jokenpo {
    private Algoritmo algoritmo;

    public void setAlgoritmo(Algoritmo algoritmo) {
        this.algoritmo = algoritmo;
    }

    public void jogar(TipoJogada tipoJogada) {
        String resultado = algoritmo.executar(tipoJogada);
        System.out.println(resultado);
    }

}
