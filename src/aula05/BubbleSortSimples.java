package aula05;

public class BubbleSortSimples {
    public static void main(String[] args) {
        int numeros[] = {5, 3, 8, 4, 2};
        // Exibindo o vetor antes da ordenação
        System.out.println("Vetor antes da ordenação:");
        visualizaVetor(numeros);

        bubbleSort(numeros);

        // Exibindo o vetor após a ordenação
        System.out.println("Vetor após a ordenação:");
        visualizaVetor(numeros);
    }

    public static void visualizaVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " || ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] vetor) {
        // Loop para percorrer o vetor
        for (int i = 0; i < vetor.length - 1; i++) {
            // Loop para comparar elementos adjacentes
            for (int j = 0; j < vetor.length - i - 1; j++) {
                // Comparando elementos adjacentes
                if (vetor[j] > vetor[j + 1]) {
                    // Troca os elementos
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
                visualizaVetor(vetor); // Exibe o vetor a cada troca
            }
        }
    }
}
