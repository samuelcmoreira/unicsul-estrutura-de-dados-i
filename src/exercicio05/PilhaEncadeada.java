public class PilhaEncadeada {

    // Classe interna que representa cada "caixa" ou nó da pilha
    private class Node {
        public Object valor; 
        public Node proximo; 

        public Node(Object valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private Node topo;    // Referência para o item que está no topo
    private int tamanho; // Contador de elementos

    // Construtor: Cria uma pilha vazia
    public PilhaEncadeada() {
        this.topo = null;
        this.tamanho = 0;
    }

    // PUSH: Adiciona um elemento no topo (O padrão da indústria para inserir)
    public void push(Object valor) {
        if (valor == null) {
            throw new IllegalArgumentException("Não é permitido adicionar null na pilha.");
        }
        Node novoNode = new Node(valor);
        
        // O novo nó aponta para quem era o antigo topo
        novoNode.proximo = topo;
        
        // O topo agora passa a ser este novo nó
        topo = novoNode;
        tamanho++;
    }

    // POP: Remove e retorna o elemento do topo (O padrão para retirar)
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia. Não é possível fazer pop.");
        }
        Object valorDoTopo = topo.valor;
        
        // O topo "pula" para o próximo elemento de baixo
        topo = topo.proximo;
        tamanho--;
        
        return valorDoTopo;
    }

    // PEEK: Apenas olha o que está no topo sem remover
    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia. Não é possível fazer peek.");
        }
        return topo.valor;
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return topo == null;
    }

    // Retorna a quantidade de itens
    public int size() {
        return tamanho;
    }

    // Limpa toda a estrutura
    public void clear() {
        topo = null;
        tamanho = 0;
    }
}