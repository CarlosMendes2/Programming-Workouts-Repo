/*
Desenvolver um sistema que gerencie funcionários com diferentes níveis hierárquicos, como gerentes e analistas. Utilize uma abordagem de programação
orientada a objetos para modelar as classes de funcionários. Faça uso de coleções para armazenar e manipular esses funcionários. Implemente funcionalidades como
ordenação por salário e filtragem por departamento, fazendo uso de lambdas para operações específicas.
 */

public class Tarefa1 {
    public static void main(String[] args) {

        Cargos cargos = new Cargos();

        boolean criaCargo1 = Cargos.criaCargo("Desenvolvedor Front-end", 6500,"Desenvolvimento de  Software");
        boolean criaCargo2 = Cargos.criaCargo("Desenvolvedor Back-end", 7000,"Desenvolvimento de  Software");
        boolean criaCargo3 = Cargos.criaCargo("Arquiteto de Software", 6500,"Desenvolvimento de  Software");
        boolean criaCargo4 = Cargos.criaCargo("Engenheiro de Testes", 6800,"Desenvolvimento de  Software");
        boolean criaCargo5 = Cargos.criaCargo("Analista de Marketing Digital", 5500,"Marketing");
        boolean criaCargo6 = Cargos.criaCargo("Especialista em SEO", 6200,"Marketing");
        boolean criaCargo7 = Cargos.criaCargo("Engenheiro de Sistemas", 8500,"Engenharia de Software");
        boolean criaCargo8 = Cargos.criaCargo("Engenheiro de Software Embarcado", 9000,"Engenharia de Software");
        boolean criaCargo9 = Cargos.criaCargo("Arquiteto de Software", 1000,"Engenharia de Software");
        boolean criaCargo10 = Cargos.criaCargo("Especialista em Recursos Humanos", 6000,"Recursos Humanos");
        boolean criaCargo11 = Cargos.criaCargo("Analista de Treinamento", 5800,"Recursos Humanos");
        boolean criaCargo12 = Cargos.criaCargo("Gerente de Vendas Regional", 9500, "Vendas");
        boolean criaCargo13 = Cargos.criaCargo("Executivo de Contas", 7800, "Vendas");
        boolean criaCargo14 = Cargos.criaCargo("Designer de Experiência do Usuário", 6800, "Design");
        boolean criaCargo15 = Cargos.criaCargo("Designer Gráfico", 6000, "Design");
        boolean criaCargo16 = Cargos.criaCargo("Analista Financeiro", 7200, "Finanças");
        boolean criaCargo17 = Cargos.criaCargo("Controller Financeiro", 9500, "Finanças");
        boolean criaCargo18 = Cargos.criaCargo("Auditor Financeiro", 8000, "Finanças");
        boolean criaCargo19 = Cargos.criaCargo("Técnico de Suporte Técnico", 5000, "Suporte Técnico");
        boolean criaCargo20 = Cargos.criaCargo("Especialista em Suporte ao Cliente", 5800, "Suporte Técnico");
        boolean criaCargo21 = Cargos.criaCargo("Cientista de Dados", 10500, "Ciência de Dados");
        boolean criaCargo22 = Cargos.criaCargo("Engenheiro de Dados", 9800, "Ciência de Dados");
        //
        cargos.ordenarPorSalario();
        //cargos.ordernarPorCargo();
        //cargos.ordernarPorDepartamento();


        String consulta = cargos.getCargo("desenvolvedor front-end");
        System.out.println(consulta);

    }
}
