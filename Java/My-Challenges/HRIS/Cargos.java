import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Cargos {
    private String nome;
    private double salario;
    private String departamento;
    private static HashSet <Cargos> cargosSet = new HashSet<>();
    static Funcionario funcionario = new Funcionario();
    Cargos(){}
    private Cargos(String nome,double salario, String departamento){
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public static boolean criaCargo( String nome,double salario, String departamento){
        Cargos novoCargo = new Cargos(nome,salario,departamento);
        cargosSet.add(novoCargo);
        return true;
    }


    public String buscaFuncionariosPorCargo(String cargo){
        ArrayList<String> buscaFuncionarioCargo = new ArrayList<>();
        for (Cargos c: cargosSet){
            if(cargo.equalsIgnoreCase(c.nome)){
                //funcionario.
            }
        }
        return "";
    }

    public double getSalario(String cargo) {
        double salario = 0;
        for(Cargos carg: cargosSet){
            if(cargo.equalsIgnoreCase(carg.nome)){
                salario = carg.salario;
                return salario;
            }
        }
        return salario;
    }

    public String getDepartamento(String cargo) {
        String departamento;
        for(Cargos car: cargosSet){
            if(cargo.equalsIgnoreCase(car.nome)){
                departamento = car.departamento;
                return departamento;
            }
        }
        return "Departamento não encontrado";
    }

    public String getCargo(String nome) {

        for(Cargos cargo: cargosSet){
            if(nome.equalsIgnoreCase(cargo.nome)){
                return "Cargo: "+cargo.nome+"| Salário: "+cargo.salario+"| Departamento: "+cargo.departamento;
            }
        }
        return "O Cargo "+nome +" não encontrado, verifique se digitou o nome corretamente";
    }

}
