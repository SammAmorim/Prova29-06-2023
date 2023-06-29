import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

      Diretor diretor = new Diretor("Sam", "123.456.789-33", "1233143443", new Endereco("Casa", "28", "Próximo á Praia", "2333443-343", "Salvador", UnidadeFederativa.BAHIA),Setor.OPERACOES, Genero.MASCULINO, 3500.20, EstadoCivil.DIVORCIADO, LocalDate.of(1998, Month.MARCH, 15), Bonificacao.DIRETOR, 0.3);
       Gerente gerente = new Gerente("Omestro", "231.432.342.45", "223321124", new Endereco("Apartamento", "45", "Próximo ao Hotel", "21323-342", "Salvador", UnidadeFederativa.BAHIA), Setor.OPERACOES, Genero.MASCULINO, 2500.40, EstadoCivil.CASADO, LocalDate.of(1998, Month.JULY, 19), Bonificacao.GERENTE);
       Motoboy motoboy = new Motoboy("Maria", "223.342.235-34", "23352253", new Endereco("Casa", "23", "Próximo á Igreja católica", "2133214", "São Paulo",UnidadeFederativa.SAO_PAULO), Setor.OPERACOES, Genero.FEMININO, 1800.80, EstadoCivil.SOLTEIRO, LocalDate.of(2000, Month.APRIL, 9), "34235");


        System.out.println("");
        System.out.println(gerente.toString());
        System.out.println("");
        System.out.println("---------");
        System.out.println(diretor.toString());
        System.out.println("");
        System.out.println("");
        diretor.demitir(motoboy);
    }


}