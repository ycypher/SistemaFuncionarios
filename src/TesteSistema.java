public class TesteSistema {

    public static void main(String[] args) {

        Departamento dep = new Departamento("Tecnologia de Informacao");

        Funcionario f1 = new Funcionario("Victor", "111.222.333-44", "analista", 4500.00);
        Funcionario f2 = new Funcionario("Joao", "555.666.777-88", "desenvolvedor", 5200.00);
        Funcionario f3 = new Funcionario("Pedro", "999.000.111-22", "suporte", 3000.00);
        Funcionario f4 = new Funcionario();

        f4.alterarDados("Julia", "333.444.555-66", "designer", 3800.00);
        dep.adicionarFuncionario(f1);
        dep.adicionarFuncionario(f2);
        dep.adicionarFuncionario(f3);
        dep.adicionarFuncionario(f4);

        f1.aplicarReajuste(15.0);

        f3.demitir();

        dep.listarFuncionarios();

        double folha = dep.calcularFolhaSalarial();
        System.out.printf("%nTotal da folha salarial (ativos): R$ %.2f%n", folha);
    }
}