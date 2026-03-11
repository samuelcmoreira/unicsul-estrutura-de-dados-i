package aula03;

public class Vetor {
    public static void main(String[] args) {
        new Vetor();
    }

    public Vetor() {
        double[] a = {10, 20, 30, 4.3, 3.2, -1, -2};
        String mensagem = "Vetor de valores reais";
        visualizaVetor(mensagem, a);
        // visualizaVetor(mensagem, a);
        calcularSomaDosElementos(a);

        calcularSomaDosElementosPositivos(a);
    }

    public void visualizaVetor(String mensagem, double[] vetor) {
        System.out.println(mensagem);
        mensagem = "abobrinha";
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " || ");
            // vetor[i] = vetor[i] * 2;
        }
        System.out.println();
    }

    private void calcularSomaDosElementos(double[] a) {
        double soma = 0;
        for (double valor : a) {
            soma += valor;
        }
        System.out.println("Soma dos elementos: " + soma);
    }

    private void calcularSomaDosElementosPositivos(double[] a) {
        double somaPositivos = 0;
        for (double valorVetor : a) {
            if (valorVetor > 0) {
                somaPositivos += valorVetor;
            }
        }
        System.out.println("Soma dos elementos positivos: " + somaPositivos);
    }
}
