package aula04;

import java.util.Scanner;

public class BuscaExercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdNumeros = 0;

        System.out.println("Informe quantos valores reais que deseja digitar: ");
        qtdNumeros = scanner.nextInt();
        double[] valoresReais = new double[qtdNumeros];
        double numero;
        
        for (int i = 0; i < qtdNumeros; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numero = scanner.nextDouble();
            if (i == 0) {
                valoresReais[i] = numero;
            } else if (numero >= valoresReais[i - 1]) {
                valoresReais[i] = numero;
            } else {
                System.out.println("Número inválido. Digite um número maior ou igual ao anterior.");
                i--;
            }
        }

        System.out.println("Digite o valor a ser buscado: ");
        double valorBuscado = scanner.nextDouble();

        int resultado = buscaBinaria(valoresReais, valorBuscado);
        if (resultado != -1) {
            System.out.println("Valor encontrado na posição: " + resultado);
        } else {
            System.out.println("Valor não encontrado.");
        }
    }

    public static int buscaBinaria(double[] vetor, double valorPesquisado) {
        int inicio = 0;
        int fim = vetor.length - 1;


        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == valorPesquisado) {
                return meio;
            }

            if (valorPesquisado < vetor[meio]) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1;
    }
}
