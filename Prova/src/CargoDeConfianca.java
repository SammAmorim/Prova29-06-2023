import java.time.LocalDate;

public abstract class CargoDeConfianca extends Funcionario {

    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento, Bonificacao bonificacao) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadocivil, dataNascimento);
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {

                return super.toString() +
        "\n Cargo de Confiança; Bonificação: " + bonificacao.getValor();
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}
