package exercicio01;

import java.util.Scanner;

public class ListaItensMercado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lista = new String[20];

        System.out.println("""
                Bem-vindo ao programa de lista de itens para o mercado!
                Mínimo 10 itens e máximo 20 itens.
                A lista será ordenada em ordem alfabética.
                Não serão permitidos itens repetidos.
                Vamos começar:
                """);

        for (int i = 0; i < lista.length; i++) {
            if (i >= 10) {
                System.out.print("Deseja adicionar mais itens? (s/n): ");
                String resposta = scanner.nextLine().trim().toLowerCase();
                if (!resposta.equals("s")) {
                    break;
                }
            }
            System.out.print("Digite o nome do item " + (i + 1) + ": ");
            String item = scanner.nextLine().trim().toLowerCase();

            if (item.isEmpty() || itemJaAdicionado(lista, item)) {
                System.out.println("Item inválido ou já adicionado. Por favor, digite um nome de item válido.");
                i--;
                continue;
            }
            lista[i] = item;
            ordenaLista(lista, i + 1);
            System.out.println("Lista de compras atualizada:");
            visualizaLista(lista);
        }
        System.out.println("Lista final de compras:");
        visualizaLista(lista);

        scanner.close();
    }

    private static boolean itemJaAdicionado(String[] lista, String item) {
        for (String i : lista) {
            if (item.equals(i)) {
                return true;
            }
        }
        return false;
    }

    public static void visualizaLista(String[] lista) {
        for (String item : lista) {
            if (item != null) {
                System.out.print(item + " || ");
            }
        }
        System.out.println();
    }

    public static void ordenaLista(String[] lista, int qtdItens) {
        // 1 ou 0 itens, não há o que ordenar
        if (qtdItens <= 1) {
            return;
        }
        
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < qtdItens - 1; i++) {
                // Se o resultado for > 0, significa que lista[i] vem depois na ordem alfabética
                if (lista[i].compareTo(lista[i + 1]) > 0) {
                    String temp = lista[i];
                    lista[i] = lista[i + 1];
                    lista[i + 1] = temp;
                    
                    trocou = true;
                }
            }
        } while (trocou); // Continua até nenhuma troca ser feita
    }
}
