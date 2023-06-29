import java.time.LocalDate;

public class Gerente extends CargoDeConfianca {

    public Gerente(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento, Bonificacao bonificacao) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadocivil, dataNascimento, bonificacao);
    }

    @Override
    public String toString() {
        return
                "" + bonificacao +
                super.toString();
    }

    public double getSalarioFinal() {
        return salario * Bonificacao.GERENTE.getValor();
    }
}
