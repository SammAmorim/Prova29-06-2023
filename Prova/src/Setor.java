public enum Setor {

    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Juridico"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");

    private String nome;

    Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
