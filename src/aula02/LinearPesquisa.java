public class LinearPesquisa {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5}; // Entrada de tamanho n
        int alvo = 4;

        // O algoritmo linear é apenas este "passeio" pela lista:
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Testando a posição " + i);

            if (numeros[i] == alvo) {
                System.out.println("Achei!");
                break; // Para assim que encontrar
            }
        }
    }
    
}
