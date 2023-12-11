import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Function;
import java.util.function.Predicate;

public class Cargos {
    private String nome;
    private double salario;
    private String departamento;
    private static HashSet <Cargos> cargosSet = new HashSet<>();
    Cargos(){

    }
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

    public String getCargo(String nome) {

        for(Cargos cargo: cargosSet){
            if(nome.equalsIgnoreCase(cargo.nome)){
                return "Cargo: "+cargo.nome+"| Salário: "+cargo.salario+"| Departamento: "+cargo.departamento;
            }
        }
        return "O Cargo "+nome +" não encontrado, verifique se digitou o nome corretamente";
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    ArrayList<Cargos> cargosOrdenadosSalario = new ArrayList<>();
    public void ordenarPorSalario() {
        for (Cargos cargo: cargosSet){

        }

    }
}
