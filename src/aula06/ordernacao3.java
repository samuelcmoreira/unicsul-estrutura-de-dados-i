
public class ordernacao3 {
    public static void main(String[] args) {
        new ordernacao3();
    }

    ordernacao3() {
        double v[] = {4.5, 45.8, 2.2, 99.9, 6.3, 2.3, -5.6, 1.2, 78.3, 39.4, 0.5, 4.3, 0.1, 54.7};       
        System.out.println("Vetor desordenado v[]:");
        visualizar(v);        
        selectionSort(v); 
        System.out.println("Vetor ordenado v[]:");
        visualizar(v);

        int[] numeros = {4, 5, 2, 9, 6, 2, -5, 1, 7, 3, 0, 4, 0, 5};
        System.out.println("Vetor desordenado numeros[]:");
        visualizar(numeros);
        selectionSortInvertido(numeros);
        System.out.println("Vetor ordenado numeros[]:");
        visualizar(numeros);
    }

    
    public void selectionSort(double vetor []) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < vetor.length; j++) {
                if ( vetor[j] < vetor[min] ) min = j;  //guardo a 'posição' do menor valor
            }            
            //troca o menor valor (que está na posição min) pelo vetor[i]
            double temp = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = temp;
        }
    }

    public void selectionSortInvertido(int vetor []) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int max = i;
            for (int j = i+1; j < vetor.length; j++) {
                if ( vetor[j] > vetor[max] ) max = j;  //guardo a 'posição' do maior valor
            }            
            //troca o maior valor (que está na posição max) pelo vetor[i]
            int temp = vetor[i];
            vetor[i] = vetor[max];
            vetor[max] = temp;
        }
    }

    void visualizar(double[] numeros) {
        for (double num: numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    void visualizar(int[] numeros) {
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

