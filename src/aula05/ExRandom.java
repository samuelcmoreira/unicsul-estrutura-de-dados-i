package aula05;

import java.util.Random;

public class ExRandom {
    
    public static void main(String[] args) {
        new ExRandom();
    }

    public ExRandom() {
        // Geração aleatória dos itens do vetor
        float[] vetor = new float[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = geraFloat();
        }
        visualizaVetor(vetor);
    }

    private float geraFloat() {
        Random random = new Random();
        float numero = random.nextFloat();
        return (numero * 10);
    }

    public void visualizaVetor(float[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " || ");
        }
        System.out.println();
    }
}
