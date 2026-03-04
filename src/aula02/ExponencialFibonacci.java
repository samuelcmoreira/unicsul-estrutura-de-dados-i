public class ExponencialFibonacci {
    static int iteracao = 0;

    public static void main(String[] args) {
        int n = 10; // Tente aumentar este número para 50 e veja o PC travar
        System.out.println("O Fibonacci de " + n + " é: " + calcularFibonacci(n));
    }

    private static int calcularFibonacci(int n) {
        // Casos base
        if (n <= 1) {
            return n;
        }

        // Chamada recursiva dupla: aqui nasce o O(2^n)
        // Para cada chamada, o programa se divide em 2 novas tarefas
        System.out.println("Calculando Iteração: " + iteracao++);
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    }
}
