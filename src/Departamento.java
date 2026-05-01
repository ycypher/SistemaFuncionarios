public class Departamento {

    private String nomeDepartamento;
    private Funcionario[] funcionarios;
    private int contador;

    public Departamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
        this.funcionarios = new Funcionario[5];
        this.contador = 0;
    }
    public void adicionarFuncionario(Funcionario f) {
        if (contador == funcionarios.length) {
            System.out.println("Departamento cheio, nao e possivel adicionar mais funcionarios.");
            return;
        }
        funcionarios[contador] = f;
        contador++;
    }
    public void listarFuncionarios() {
        System.out.println("\n=== Funcionarios do departamento: " + nomeDepartamento + " ===");
        for (int i = 0; i < contador; i++) {
            funcionarios[i].exibirDados();
        }
    }
    public double calcularFolhaSalarial() {
        double total = 0.0;
        for (int i = 0; i < contador; i++) {
            if (funcionarios[i].isAtivo()) {
                total = total + funcionarios[i].getSalario();
            }
        }
        return total;
    }
}