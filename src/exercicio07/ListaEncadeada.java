public class ListaEncadeada {

    private class No {
        String valor;
        No proximo;

        public No(String valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private No inicio;

    public ListaEncadeada() {
        inicio = null;
    }

    public void adicionar(String valor) {

        No novo = new No(valor);

        if (inicio == null) {
            inicio = novo;
            return;
        }

        No atual = inicio;

        while (atual.proximo != null) {
            atual = atual.proximo;
        }

        atual.proximo = novo;
    }

    public void listar() {

        if (inicio == null) {
            System.out.println("Fila vazia.");
            return;
        }

        No atual = inicio;

        while (atual != null) {
            System.out.println(atual.valor);
            atual = atual.proximo;
        }
    }

    public boolean buscar(String valor) {

        No atual = inicio;

        while (atual != null) {

            if (atual.valor.equalsIgnoreCase(valor)) {
                return true;
            }

            atual = atual.proximo;
        }

        return false;
    }

    public void remover(String valor) {

        if (inicio == null) {
            return;
        }

        if (inicio.valor.equalsIgnoreCase(valor)) {
            inicio = inicio.proximo;
            return;
        }

        No atual = inicio;

        while (atual.proximo != null &&
               !atual.proximo.valor.equalsIgnoreCase(valor)) {

            atual = atual.proximo;
        }

        if (atual.proximo != null) {
            atual.proximo = atual.proximo.proximo;
        }
    }
}