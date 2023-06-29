import java.time.LocalDate;

public class Engenheiro extends Funcionario {


    private String crea;

    public Engenheiro(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento, String crea) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadocivil, dataNascimento);
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "\n Engenheiro: " +
                "\n crea: " + crea +
                 super.toString();
    }

    public double getSalarioFinal() {
        return super.salario;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
}
