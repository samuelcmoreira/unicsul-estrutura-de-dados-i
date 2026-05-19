import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        FilaEspera fila = new FilaEspera();

        int opcao;

        do {

            System.out.println("\n=== SISTEMA DA CLÍNICA ===");
            System.out.println("1 - Adicionar paciente");
            System.out.println("2 - Listar pacientes");
            System.out.println("3 - Buscar paciente");
            System.out.println("4 - Remover paciente");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Nome do paciente: ");
                    String nomeAdicionar = scanner.nextLine();

                    fila.adicionarPaciente(nomeAdicionar);

                    break;

                case 2:

                    fila.listarPacientes();

                    break;

                case 3:

                    System.out.print("Nome do paciente: ");
                    String nomeBuscar = scanner.nextLine();

                    System.out.println(fila.buscarPaciente(nomeBuscar));
                    break;

                case 4:

                    System.out.print("Nome do paciente: ");
                    String nomeRemover = scanner.nextLine();

                    fila.removerPaciente(nomeRemover);

                    break;

                case 0:

                    System.out.println("Sistema encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}