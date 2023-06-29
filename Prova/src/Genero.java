public enum Genero {

    MASCULINO("Masculino", "M"),
    FEMININO("Feminino", "F");

    private String texto;
    private String caractere;

    Genero(String texto, String caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }

    public String getTexto() {
        return texto;
    }

    public String getCaractere() {
        return caractere;
    }
}
