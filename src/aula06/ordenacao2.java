public class ordenacao2 {
    public static void main(String[] args) {
        new ordenacao2();
    }

    public ordenacao2() {
        int[] numeros = {5, 2 ,9, 1, 5, 6};
        System.out.println("Vetor desordenado - inteiro:");
        visualizar(numeros);
        insertionSort(numeros);
        double[] notas = {7.5, 8.0, 6.0, 9.5, 5.0};
        System.out.println("Vetor desordenado - double:");
        visualizar(notas);
        insertionSort(notas);
    }

    public void insertionSort(int[] vetor) {
        int numeroElementos = vetor.length;
        for (int i = 1; i < numeroElementos; i++) {
            int numeroEmOrdenacao = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > numeroEmOrdenacao) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = numeroEmOrdenacao;
            visualizar(vetor);
        }
    }

    public void insertionSort(double[] vetor) {
        int numeroElementos = vetor.length;
        for (int i = 1; i < numeroElementos; i++) {
            double numeroEmOrdenacao = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > numeroEmOrdenacao) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = numeroEmOrdenacao;
            visualizar(vetor);
        }
    }

    public void visualizar(int[] numeros) {
        for (int num : numeros) {
            System.out.print(num + "  ");
        }
        System.out.println();
    }

    public void visualizar(double[] numeros) {
        for (double num : numeros) {
            System.out.print(num + "  ");
        }
        System.out.println();
    }
}   
