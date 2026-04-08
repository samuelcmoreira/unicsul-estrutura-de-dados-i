package aula07;

public class Maximo {
    public static void main(String[] args) {
        new Maximo();
    }

    public Maximo() {
        int[] a = {12, 11, 21, 89, 99, 45, 67, 34, 56, 78};
        System.out.println("Maior dos valores 1: " + maximoIterativo(a));
        System.out.println("Maior dos valores 2: " + maximoRecursivo(a, 0, a.length - 1, 0));
    }

    public int maximoIterativo(int[] vet) {
        int max = vet[0];
        for (int i = 1; i < vet.length; i++) {
            if (vet[i] > max) max = vet[i];
        }
        return max;
    }

    public int maximoRecursivo(int[] vet, int inicio, int fim, int nivel) {
        if (inicio == fim) return vet[inicio];
        int meio = (inicio + fim) / 2;
        int maxEsquerda = maximoRecursivo(vet, inicio, meio, nivel + 1);
        int maxDireita = maximoRecursivo(vet, meio + 1, fim, nivel + 1);
        System.out.println("Nivel " + nivel + ": " + maxEsquerda + " > " + maxDireita);
        return maxEsquerda > maxDireita ? maxEsquerda : maxDireita;
    }
}
