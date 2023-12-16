/*
Desenvolver um sistema que gerencie funcionários com diferentes níveis hierárquicos, como gerentes e analistas. Utilize uma abordagem de programação
orientada a objetos para modelar as classes de funcionários. Faça uso de coleções para armazenar e manipular esses funcionários. Implemente funcionalidades como
ordenação por salário e filtragem por departamento, fazendo uso de lambdas para operações específicas.
 */

public class Tarefa1 {
    public static void main(String[] args) {

        Cargos cargos = new Cargos();
        Funcionario funcionarios = new Funcionario();


        boolean criaCargo1 = Cargos.criaCargo("Desenvolvedor Front-end", 6.500,"Desenvolvimento de  Software");
        boolean criaCargo2 = Cargos.criaCargo("Desenvolvedor Back-end", 7.000,"Desenvolvimento de  Software");
        boolean criaCargo3 = Cargos.criaCargo("Arquiteto de Software", 6.500,"Desenvolvimento de  Software");
        boolean criaCargo4 = Cargos.criaCargo("Engenheiro de Testes", 6.800,"Desenvolvimento de  Software");
        boolean criaCargo5 = Cargos.criaCargo("Analista de Marketing Digital", 5.500,"Marketing");
        boolean criaCargo6 = Cargos.criaCargo("Especialista em SEO", 6.200,"Marketing");
        boolean criaCargo7 = Cargos.criaCargo("Engenheiro de Sistemas", 8.500,"Engenharia de Software");
        boolean criaCargo8 = Cargos.criaCargo("Engenheiro de Software Embarcado", 9.000,"Engenharia de Software");
        boolean criaCargo9 = Cargos.criaCargo("Arquiteto de Software", 1.000,"Engenharia de Software");
        boolean criaCargo10 = Cargos.criaCargo("Especialista em Recursos Humanos", 6.000,"Recursos Humanos");
        boolean criaCargo11 = Cargos.criaCargo("Analista de Treinamento", 5.800,"Recursos Humanos");
        boolean criaCargo12 = Cargos.criaCargo("Gerente de Vendas Regional", 9.500, "Vendas");
        boolean criaCargo13 = Cargos.criaCargo("Executivo de Contas", 7.800, "Vendas");
        boolean criaCargo14 = Cargos.criaCargo("Designer de Experiência do Usuário", 6.800, "Design");
        boolean criaCargo15 = Cargos.criaCargo("Designer Gráfico", 6.000, "Design");
        boolean criaCargo16 = Cargos.criaCargo("Analista Financeiro", 7.200, "Finanças");
        boolean criaCargo17 = Cargos.criaCargo("Controller Financeiro", 9.500, "Finanças");
        boolean criaCargo18 = Cargos.criaCargo("Auditor Financeiro", 8.000, "Finanças");
        boolean criaCargo19 = Cargos.criaCargo("Técnico de Suporte Técnico", 5.000, "Suporte Técnico");
        boolean criaCargo20 = Cargos.criaCargo("Especialista em Suporte ao Cliente", 5.800, "Suporte Técnico");
        boolean criaCargo21 = Cargos.criaCargo("Cientista de Dados", 10.500, "Ciência de Dados");
        boolean criaCargo22 = Cargos.criaCargo("Engenheiro de Dados", 9.800, "Ciência de Dados");

        boolean criaFuncionario01 = Funcionario.criarFuncionario("João Silva", "Desenvolvedor Front-end", 25);
        boolean criaFuncionario02 = Funcionario.criarFuncionario("Ana Oliveira", "Desenvolvedor Back-end", 30);
        boolean criaFuncionario03 = Funcionario.criarFuncionario("Carlos Rocha", "Arquiteto de Software", 35);
        boolean criaFuncionario04 = Funcionario.criarFuncionario("Mariana Costa", "Engenheiro de Testes", 28);
        boolean criaFuncionario05 = Funcionario.criarFuncionario("Lucas Santos", "Analista de Marketing Digital", 32);
        boolean criaFuncionario06 = Funcionario.criarFuncionario("Isabela Lima", "Especialista em SEO", 26);
        boolean criaFuncionario07 = Funcionario.criarFuncionario("Rafael Pereira", "Engenheiro de Sistemas", 33);
        boolean criaFuncionario08 = Funcionario.criarFuncionario("Fernanda Oliveira", "Engenheiro de Software Embarcado", 31);
        boolean criaFuncionario09 = Funcionario.criarFuncionario("Daniel Silva", "Arquiteto de Software", 36);
        boolean criaFuncionario10 = Funcionario.criarFuncionario("Camila Rodrigues", "Especialista em Recursos Humanos", 29);
        boolean criaFuncionario11 = Funcionario.criarFuncionario("Pedro Santos", "Analista de Treinamento", 27);
        boolean criaFuncionario12 = Funcionario.criarFuncionario("Giovanna Costa", "Gerente de Vendas Regional", 40);
        boolean criaFuncionario13 = Funcionario.criarFuncionario("Lucas Oliveira", "Executivo de Contas", 35);
        boolean criaFuncionario14 = Funcionario.criarFuncionario("Larissa Lima", "Designer de Experiência do Usuário", 34);
        boolean criaFuncionario15 = Funcionario.criarFuncionario("Guilherme Silva", "Designer Gráfico", 28);
        boolean criaFuncionario16 = Funcionario.criarFuncionario("Juliana Santos", "Analista Financeiro", 32);
        boolean criaFuncionario17 = Funcionario.criarFuncionario("Vinícius Rocha", "Controller Financeiro", 38);
        boolean criaFuncionario18 = Funcionario.criarFuncionario("Bianca Costa", "Auditor Financeiro", 33);
        boolean criaFuncionario19 = Funcionario.criarFuncionario("Ricardo Oliveira", "Técnico de Suporte Técnico", 26);
        boolean criaFuncionario20 = Funcionario.criarFuncionario("Amanda Lima", "Especialista em Suporte ao Cliente", 29);
        boolean criaFuncionario21 = Funcionario.criarFuncionario("Gabriel Silva", "Cientista de Dados", 42);
        boolean criaFuncionario22 = Funcionario.criarFuncionario("Lívia Rocha", "Engenheiro de Dados", 39);
        boolean criaFuncionario23 = Funcionario.criarFuncionario("Thiago Oliveira", "Desenvolvedor Front-end", 27);
        boolean criaFuncionario24 = Funcionario.criarFuncionario("Carolina Lima", "Desenvolvedor Back-end", 31);
        boolean criaFuncionario25 = Funcionario.criarFuncionario("Matheus Silva", "Arquiteto de Software", 36);
        boolean criaFuncionario26 = Funcionario.criarFuncionario("Larissa Costa", "Engenheiro de Testes", 29);
        boolean criaFuncionario27 = Funcionario.criarFuncionario("Ricardo Oliveira", "Analista de Marketing Digital", 33);
        boolean criaFuncionario28 = Funcionario.criarFuncionario("Amanda Pereira", "Especialista em SEO", 27);
        boolean criaFuncionario29 = Funcionario.criarFuncionario("Daniel Rocha", "Engenheiro de Sistemas", 34);
        boolean criaFuncionario30 = Funcionario.criarFuncionario("Isabela Santos", "Engenheiro de Software Embarcado", 32);
        boolean criaFuncionario31 = Funcionario.criarFuncionario("Lucas Oliveira", "Arquiteto de Software", 37);
        boolean criaFuncionario32 = Funcionario.criarFuncionario("Camila Rodrigues", "Especialista em Recursos Humanos", 30);
        boolean criaFuncionario33 = Funcionario.criarFuncionario("Pedro Santos", "Analista de Treinamento", 28);
        boolean criaFuncionario34 = Funcionario.criarFuncionario("Giovanna Costa", "Gerente de Vendas Regional", 41);
        boolean criaFuncionario35 = Funcionario.criarFuncionario("Lucas Oliveira", "Executivo de Contas", 36);
        boolean criaFuncionario36 = Funcionario.criarFuncionario("Larissa Lima", "Designer de Experiência do Usuário", 35);
        boolean criaFuncionario37 = Funcionario.criarFuncionario("Guilherme Silva", "Designer Gráfico", 29);
        boolean criaFuncionario38 = Funcionario.criarFuncionario("Juliana Santos", "Analista Financeiro", 33);
        boolean criaFuncionario39 = Funcionario.criarFuncionario("Vinícius Rocha", "Controller Financeiro", 39);
        boolean criaFuncionario40 = Funcionario.criarFuncionario("Bianca Costa", "Auditor Financeiro", 34);
        boolean criaFuncionario41 = Funcionario.criarFuncionario("Ricardo Oliveira", "Técnico de Suporte Técnico", 27);
        boolean criaFuncionario42 = Funcionario.criarFuncionario("Amanda Lima", "Especialista em Suporte ao Cliente", 30);
        boolean criaFuncionario43 = Funcionario.criarFuncionario("Gabriel Silva", "Cientista de Dados", 43);
        boolean criaFuncionario44 = Funcionario.criarFuncionario("Lívia Rocha", "Engenheiro de Dados", 40);
        boolean criaFuncionario45 = Funcionario.criarFuncionario("Thiago Oliveira", "Desenvolvedor Front-end", 27);
        boolean criaFuncionario46 = Funcionario.criarFuncionario("Carolina Lima", "Desenvolvedor Back-end", 31);
        boolean criaFuncionario47 = Funcionario.criarFuncionario("Matheus Silva", "Arquiteto de Software", 36);
        boolean criaFuncionario48 = Funcionario.criarFuncionario("Larissa Costa", "Engenheiro de Testes", 29);
        boolean criaFuncionario49 = Funcionario.criarFuncionario("Ricardo Oliveira", "Analista de Marketing Digital", 33);
        boolean criaFuncionario50 = Funcionario.criarFuncionario("Amanda Pereira", "Especialista em SEO", 27);
        boolean criaFuncionario51 = Funcionario.criarFuncionario("Daniel Rocha", "Engenheiro de Sistemas", 34);
        boolean criaFuncionario52 = Funcionario.criarFuncionario("Isabela Santos", "Engenheiro de Software Embarcado", 32);
        boolean criaFuncionario53 = Funcionario.criarFuncionario("Lucas Oliveira", "Arquiteto de Software", 37);
        boolean criaFuncionario54 = Funcionario.criarFuncionario("Camila Rodrigues", "Especialista em Recursos Humanos", 30);
        boolean criaFuncionario55 = Funcionario.criarFuncionario("Pedro Santos", "Analista de Treinamento", 28);
        boolean criaFuncionario56 = Funcionario.criarFuncionario("Giovanna Costa", "Gerente de Vendas Regional", 41);
        boolean criaFuncionario57 = Funcionario.criarFuncionario("Lucas Oliveira", "Executivo de Contas", 36);
        boolean criaFuncionario58 = Funcionario.criarFuncionario("Larissa Lima", "Designer de Experiência do Usuário", 35);
        boolean criaFuncionario59 = Funcionario.criarFuncionario("Guilherme Silva", "Designer Gráfico", 29);
        boolean criaFuncionario60 = Funcionario.criarFuncionario("Juliana Santos", "Analista Financeiro", 33);
        boolean criaFuncionario61 = Funcionario.criarFuncionario("Vinícius Rocha", "Controller Financeiro", 39);
        boolean criaFuncionario62 = Funcionario.criarFuncionario("Bianca Costa", "Auditor Financeiro", 34);
        boolean criaFuncionario63 = Funcionario.criarFuncionario("Ricardo Oliveira", "Técnico de Suporte Técnico", 27);
        boolean criaFuncionario64 = Funcionario.criarFuncionario("Amanda Lima", "Especialista em Suporte ao Cliente", 30);
        boolean criaFuncionario65 = Funcionario.criarFuncionario("Gabriel Silva", "Cientista de Dados", 43);
        boolean criaFuncionario66 = Funcionario.criarFuncionario("Lívia Rocha", "Engenheiro de Dados", 40);
        boolean criaFuncionario67 = Funcionario.criarFuncionario("Thiago Oliveira", "Desenvolvedor Front-end", 27);
        boolean criaFuncionario68 = Funcionario.criarFuncionario("Carolina Lima", "Desenvolvedor Back-end", 31);
        boolean criaFuncionario69 = Funcionario.criarFuncionario("Matheus Silva", "Arquiteto de Software", 36);
        boolean criaFuncionario70 = Funcionario.criarFuncionario("Larissa Costa", "Engenheiro de Testes", 29);
        boolean criaFuncionario71 = Funcionario.criarFuncionario("Ricardo Oliveira", "Analista de Marketing Digital", 33);
        boolean criaFuncionario72 = Funcionario.criarFuncionario("Amanda Pereira", "Especialista em SEO", 27);
        boolean criaFuncionario73 = Funcionario.criarFuncionario("Daniel Rocha", "Engenheiro de Sistemas", 34);
        boolean criaFuncionario74 = Funcionario.criarFuncionario("Isabela Santos", "Engenheiro de Software Embarcado", 32);
        boolean criaFuncionario75 = Funcionario.criarFuncionario("Lucas Oliveira", "Arquiteto de Software", 37);
        boolean criaFuncionario76 = Funcionario.criarFuncionario("Camila Rodrigues", "Especialista em Recursos Humanos", 30);





        //cargos.ordenarPorSalario();
        //cargos.ordernarPorCargo();
        //cargos.ordernarPorDepartamento();

    }
}
