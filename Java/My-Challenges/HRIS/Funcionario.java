import java.util.ArrayList;

public class Funcionario {
    String nome;
    String cargo;
    double salario;
    int idade;
    String departamento;
    Funcionario(){

    }
    static Cargos cargos = new Cargos();
    ArrayList<Funcionario> corpoFuncionarios = new ArrayList<>();
    private Funcionario(String nome,String cargo,double salario,int idade,String departamento){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.idade = idade;
        this.departamento = departamento;
    }

    public static boolean criarFuncionario(String nome,String cargo,int idade){
        double salarioF = salarioCargo(cargo);
        String departamentoF = departamentoCargo(cargo);
        new Funcionario(nome,cargo,salarioF,idade,departamentoF);
        return true;
    }

    private static String departamentoCargo(String cargo) {
        return cargos.getDepartamento(cargo);
    }

    private static double salarioCargo(String cargo) {
        return cargos.getSalario(cargo);
    }
}
