import java.util.ArrayList;

public class Funcionario {
    String nome;
    String cargo;
    double salario;
    int idade;
    String departamento;
    private Funcionario(){

    }
    ArrayList<Funcionario> corpoFuncionarios = new ArrayList<>();
    private Funcionario(String nome,String cargo,double salario,int idade,String departamento){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.idade = idade;
        this.departamento = departamento;
    }

    Funcionario criarFuncionario(String nome,String cargo,int idade){
        int salarioF = salarioCargo();
        String departamentoF = departamentoCargo();
        return new Funcionario(nome,cargo,salarioF,idade,departamentoF);
    }

    private String departamentoCargo() {
        return "";
    }

    private int salarioCargo() {
        return 0;
    }
}
