public class Funcionario {

    private String nome;
    private String cpf;
    private String cargo;
    private double salario;
    private boolean ativo;

    public Funcionario(String nome, String cpf, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = true;
    }
    public Funcionario() {
        this.nome = "indefinido";
        this.cpf = "000.000.000-00";
        this.cargo = "indefinido";
        this.salario = 0.0;
        this.ativo = false;
    }
    public void alterarDados(String nome, String cpf, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }
    public void aplicarReajuste(double porcentagem) {
        this.salario = this.salario + (this.salario * porcentagem / 100);
    }
    public void demitir() {
        this.ativo = false;
    }
    public void exibirDados() {
        System.out.println("------------------------------");
        System.out.println("Nome:   " + nome);
        System.out.println("CPF:    " + cpf);
        System.out.println("Cargo:  " + cargo);
        System.out.printf("salario: R$ %.2f%n", salario);
        System.out.println("Status: " + (ativo ? "ATIVO" : "INATIVO"));
        System.out.println("------------------------------");
    }
    public boolean isAtivo() {
        return ativo;
    }
    public double getSalario() {
        return salario;
    }
}