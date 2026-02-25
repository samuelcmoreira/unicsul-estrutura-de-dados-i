import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        String[] materias = {"Português", "Matemática"};
        String[] alunos = new String[4];
        double[][] notas = new double[4][2];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i] = scanner.nextLine();
            for (int j = 0; j < materias.length; j++) {
                System.out.print("Digite a nota de " + materias[j] + " para " + alunos[i] + ": ");
                notas[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); // Limpar o buffer
        }

        System.out.println("\nMédia das notas:");
        for (int i = 0; i < alunos.length; i++) {
            double media = (notas[i][0] + notas[i][1]) / materias.length;
            System.out.println(alunos[i] + ": " + media);
        }
        scanner.close();
    }
}
