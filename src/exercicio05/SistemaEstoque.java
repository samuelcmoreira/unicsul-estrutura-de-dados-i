// Nomes: 
// Samuel Correia Moreira 
// Daniel Robson Alexandre Silva

public class SistemaEstoque {
    public static void main(String[] args) {
        // Instancia a Pilha que você criou
        PilhaEncadeada prateleira = new PilhaEncadeada();
        double faturamento = 0.0;

        System.out.println("=== 🚚 ABASTECIMENTO DE ESTOQUE ===");

        // Adicionando produtos (Push)
        prateleira.push(new Produto("Caixa de Leite (Fardo)", 54.90));
        prateleira.push(new Produto("Saco de Arroz 20kg", 89.00));
        prateleira.push(new Produto("Lata de Óleo (Caixa)", 42.50));

        System.out.println("Estoque atualizado com " + prateleira.size() + " fardos.");

        System.out.println("\n=== 🔍 INSPEÇÃO DE SAÍDA ===");
        // Verificando o topo (Peek)
        Produto proximoASair = (Produto) prateleira.peek();
        System.out.println("O próximo item a ser retirado é: " + proximoASair.nome);

        System.out.println("\n=== 💰 PROCESSANDO VENDAS (POP) ===");

        for (int i = 0; i < 2; i++) {
            Produto vendido = (Produto) prateleira.pop();
            faturamento += vendido.preco;
            System.out.printf("Vendido: %s | R$ %.2f\n", vendido.nome, vendido.preco);
        }

        System.out.printf("Faturamento total gerado: R$ %.2f\n", faturamento);

        System.out.println("\n=== 📦 ESTADO FINAL DO ESTOQUE ===");

        System.out.println("Itens restantes no estoque: " + prateleira.size());

        if (prateleira.isEmpty()) {
            System.out.println("Status: A prateleira está VAZIA.");
        } else {
            System.out.println("Status: Ainda há produtos na prateleira.");
            Produto topoAtual = (Produto) prateleira.peek();
            System.out.println("Item atualmente no topo: " + topoAtual.nome);
        }
    }
}
