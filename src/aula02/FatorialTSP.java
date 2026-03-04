public class FatorialTSP {
    static int N = 16; // Número de cidades
    static int[][] distancias = new int[N][N];
    static int menorCustoTotal = Integer.MAX_VALUE;
    static long rotasTestadas = 0;

    public static void main(String[] args) {
        // Inicialização do mapa
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                distancias[i][j] = (i == j) ? 0 : (int) (Math.random() * 100 + 1);
            }
        }

        boolean[] visitadas = new boolean[N];
        visitadas[0] = true; // Começa na cidade 0

        long tempoInicio = System.nanoTime();
        procurar(0, 1, 0, visitadas);
        long tempoFim = System.nanoTime();

        double tempoMs = (tempoFim - tempoInicio) / 1_000_000.0;
        System.out.println("=== RESULTADO COM PODA ===");
        System.out.println("Menor custo: " + menorCustoTotal);
        System.out.println("Rotas COMPLETAS testadas: " + rotasTestadas);
        System.out.printf("Tempo: %.4f ms\n", tempoMs);
    }

    public static void procurar(int atual, int cont, int custoAtual, boolean[] visitadas) {
        if (cont == N) {
            rotasTestadas++;
            int custoFinal = custoAtual + distancias[atual][0]; // Volta para a cidade inicial
            if (custoFinal < menorCustoTotal) menorCustoTotal = custoFinal;
            return;
        }

        for (int proxima = 0; proxima < N; proxima++) {
            if(!visitadas[proxima]) {
                visitadas[proxima] = true;
                procurar(proxima, cont + 1, custoAtual + distancias[atual][proxima], visitadas);
                visitadas[proxima] = false; // Backtracking
            }
        }
    }
}
