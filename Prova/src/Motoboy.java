import java.time.LocalDate;

public class Motoboy extends Funcionario {

    private String carteiraDeHabilitacao;

    public Motoboy(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento, String carteiraDeHabilitacao) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadocivil, dataNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "\n Motoboy: " +
                "\n carteiraDeHabilitacao: " + carteiraDeHabilitacao +
                 super.toString();
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return super.salario;
    }
}
