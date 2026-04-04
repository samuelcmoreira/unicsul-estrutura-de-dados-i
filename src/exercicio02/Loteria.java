package exercicio02;

import java.util.Random;
import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final double PREMIO_TOTAL = 1000000.00;
        final int NUM_APOSTADORES = 10;
        final int NUMEROS_POR_APOSTA = 4;
        final int QTD_NUMEROS_SORTEADOS = 3;
        
        String[] apostadores = new String[NUM_APOSTADORES];
        int[][] apostas = new int[NUM_APOSTADORES][NUMEROS_POR_APOSTA];
        int[] sorteados = new int[QTD_NUMEROS_SORTEADOS];
        int[] acertosPorApostador = new int[NUM_APOSTADORES];
        int qtdGanhadores = 0;

        System.out.println("""
                ===================================
                BEM-VINDO À LOTERIA
                Prêmio acumulado: R$ 1.000.000,00
                ===================================
                    Regras:
                    - Cada apostador escolhe 4 números diferentes entre 0 e 9.
                    - O sorteio irá sortear 3 números diferentes entre 0 e 9.
                    - Ganha quem acertar pelo menos 2 dos números sorteados.
                    - O prêmio é dividido igualmente entre os ganhadores.
                    - Se ninguém ganhar, o prêmio acumula para a próxima rodada.
                -----------------------------------
                Vamos começar as apostas!
                -----------------------------------
                """);
        

        for (int i = 0; i < NUM_APOSTADORES; i++) {
            System.out.print("Nome do apostador " + (i + 1) + ": ");
            apostadores[i] = scanner.nextLine().trim();

            System.out.println("Digite 4 números diferentes (entre 0 e 9):");
            for (int j = 0; j < NUMEROS_POR_APOSTA; j++) {
                int numEscolhido;
                
                while (true) {
                    System.out.print("Número " + (j + 1) + ": ");
                    numEscolhido = scanner.nextInt();

                    if (numEscolhido < 0 || numEscolhido > 9) {
                        System.out.println("Inválido! O número deve ser entre 0 e 9.");
                    } else if (jaExiste(apostas[i], j, numEscolhido)) {
                        System.out.println("Inválido! Você já apostou o número " + numEscolhido + ".");
                    } else {
                        break;
                    }
                }
                apostas[i][j] = numEscolhido;
            }
            scanner.nextLine();


            bubbleSort(apostas[i]);
            System.out.print("Aposta registrada com sucesso: ");
            visualizaVetor(apostas[i]);
            System.out.println("-----------------------------------");
        }


        System.out.println("\nREALIZANDO O SORTEIO...");

        for (int i = 0; i < QTD_NUMEROS_SORTEADOS; i++) {
            int numSorteado;
            do {
                numSorteado = random.nextInt(10);
            } while (jaExiste(sorteados, i, numSorteado));
            sorteados[i] = numSorteado;
        }
        
        bubbleSort(sorteados);
        System.out.print("Números sorteados: ");
        visualizaVetor(sorteados);
        System.out.println("===================================\n");

        // APURAÇÃO E PREMIAÇÃO
        for (int i = 0; i < NUM_APOSTADORES; i++) {
            int acertos = 0;
            for (int j = 0; j < NUMEROS_POR_APOSTA; j++) {
                int numApostado = apostas[i][j];
                if (jaExiste(sorteados, sorteados.length, numApostado)) {
                    acertos++;
                }
            }
            acertosPorApostador[i] = acertos;
            
            if (acertos >= 2) {
                qtdGanhadores++;
            }
        }

        System.out.println("RESULTADO FINAL:");
        if (qtdGanhadores == 0) {
            System.out.println("A loteria acumulou!!! Ninguém acertou pelo menos 2 números.");
        } else {
            double premioDividido = PREMIO_TOTAL / qtdGanhadores;
            System.out.printf("""
                Tivemos %d ganhador(es)!
                Levando uma bagatela de R$ %.2f (cada)
                
                """,
            qtdGanhadores, premioDividido);

            System.out.println("--- LISTA DE GANHADORES ---");
            for (int i = 0; i < NUM_APOSTADORES; i++) {
                if (acertosPorApostador[i] >= 2) {
                    System.out.print(apostadores[i] + " | Acertos: " + acertosPorApostador[i] + " | Prêmio: R$ " + premioDividido + " | Aposta: ");
                    visualizaVetor(apostas[i]);
                }
            }
        }

        scanner.close();
    }

    public static void bubbleSort(int[] vetor) {
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }


    public static void visualizaVetor(int[] vetor) {
        System.out.print("[ ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

    private static boolean jaExiste(int[] vetor, int tamanhoAtual, int valorBuscado) {
        for (int i = 0; i < tamanhoAtual; i++) {
            if (vetor[i] == valorBuscado) {
                return true;
            }
        }
        return false;
    }
}