package aula05;

public class BubbleSortComFlag {
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
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    // Troca os elementos
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }

}
