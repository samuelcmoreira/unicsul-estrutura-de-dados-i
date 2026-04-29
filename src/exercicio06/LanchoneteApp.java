package exercicio06;

import java.util.Scanner;

public class LanchoneteApp {
    private static Queue fila = new Queue();
    private static int contador = 1;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n1. NOVO PEDIDO | 2. VISUALIZAR FILA | 3. PRÓXIMO (ATENDER) | 0. SAIR");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1 -> criarPedido();
                case 2 -> System.out.println(fila);
                case 3 -> atenderPedido();
            }
        } while (opcao != 0);
    }

    private static void criarPedido() {
        System.out.print("Nome do Cliente: ");
        Pedido p = new Pedido(contador++, sc.nextLine());
        int itemOpcao;
        
        do {
            System.out.println("\n--- MENU ---");

            for (int i = 1; i <= 12; i++) {
                IItemPedido item = mapearItem(i, 1);
                System.out.printf("%2d. %-15s R$ %.2f\n", i, item.getNome(), item.getValorUnitario());
            }
            System.out.println("0. Finalizar Pedido");
            
            itemOpcao = Integer.parseInt(sc.nextLine());
            if (itemOpcao > 0) {
                System.out.print("Quantidade: ");
                int qtd = Integer.parseInt(sc.nextLine());
                p.adicionarItem(mapearItem(itemOpcao, qtd));
            }
        } while (itemOpcao != 0);

        fila.enqueue(p);
        System.out.println("Pedido adicionado com sucesso!");
    }

    
    private static void atenderPedido() {
        Pedido pedido = (Pedido) fila.dequeue();
        if (pedido != null) {
            System.out.println("Atendendo: " + pedido);
            System.out.println("Itens do Pedido:");
            for (IItemPedido item : pedido.getItens()) {
                System.out.println(" - " + item);
            }
            System.out.printf("Total: R$ %.2f\n", pedido.getValorTotal());
        } else {
            System.out.println("Nenhum pedido na fila.");
        }
    }


    private static IItemPedido mapearItem(int op, int qtd) {
        return switch (op) {
            case 1 -> new ItemPedido("X-Bacon", qtd, 25.0);
            case 2 -> new ItemPedido("X-Salada", qtd, 20.0);
            case 3 -> new ItemPedido("X-Burguer", qtd, 18.0);
            case 4 -> new ItemPedido("Hot Dog", qtd, 15.0);
            case 5 -> new ItemPedido("Combo Vegan", qtd, 30.0);
            case 6 -> new ItemPedido("Coca-Cola", qtd, 7.0);
            case 7 -> new ItemPedido("Guaraná", qtd, 6.0);
            case 8 -> new ItemPedido("Batata P", qtd, 10.0);
            case 9 -> new ItemPedido("Batata G", qtd, 15.0);
            case 10 -> new ItemPedido("Suco Laranja", qtd, 9.0);
            case 11 -> new ItemPedido("Suco Uva", qtd, 9.0);
            case 12 -> new ItemPedido("Suco Limão", qtd, 8.0);
            default -> new ItemPedido("Item Genérico", qtd, 0.0);
        };
    }
}