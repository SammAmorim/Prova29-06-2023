import java.time.LocalDate;

public class Diretor extends CargoDeConfianca implements Contratacao {

    private double PREMIO = 0.3;

    public Diretor(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario, EstadoCivil estadocivil, LocalDate dataNascimento, Bonificacao bonificacao, double PREMIO) {
        super(nome, cpf, rg, endereco, setor, genero, salario, estadocivil, dataNascimento, bonificacao);
        this.PREMIO = PREMIO;
    }

    @Override
    public String toString() {
        return  "DIRETOR" +
                "\n PREMIO: " + PREMIO +
                super.toString();
    }

    public double getSalarioFinal() {
        double salarioFinal = 0;
        salarioFinal = super.salario * PREMIO;
        salarioFinal += super.salario;
        return salarioFinal;
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo o Funcionario: " + funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo o Funcionario: " + funcionario);
    }
}
