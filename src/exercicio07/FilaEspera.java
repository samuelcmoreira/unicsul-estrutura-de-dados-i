public class FilaEspera {

    private ListaEncadeada pacientes;

    public FilaEspera() {
        pacientes = new ListaEncadeada();
    }

    public void adicionarPaciente(String nome) {
        pacientes.adicionar(nome);
    }

    // TODO:
    // implementar os outros métodos

    public void listarPacientes() {
        pacientes.listar();
    }

     public String buscarPaciente(String nome) {
        return pacientes.buscar(nome)? "Paciente encontrado: " + nome : "Paciente não encontrado";
    }

    public void removerPaciente(String nome) {
        pacientes.remover(nome);
    }
}