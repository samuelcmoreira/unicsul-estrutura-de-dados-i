package aula04;

public class Buscas {
    public static void main(String[] args) {
        // Busca sequencial
        double[] vetorDesordenado = {4.3, 6.1, 0.1, 1.9, 2.4, 7.2, 5.5};
        int pos = buscaSequencial(vetorDesordenado, 2.4);

        System.out.println("Localizado na posição (índice): " + pos);

        // Busca binária
        double[] vetorOrdenado = {1, 2, 4, 8, 10, 11, 12};
        pos = buscaBinaria(vetorOrdenado, 1);
        System.out.println("Localizado no vetor ordenado na posição (índice): " + pos);
    }

    public static int buscaSequencial(double[] vetor, double valorPesquisado) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorPesquisado) {
                return i;
            }
        }
        return -1;
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
