public enum Bonificacao {

    GERENTE(0.15),
    DIRETOR(0.25);

    private final double valor;


    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}