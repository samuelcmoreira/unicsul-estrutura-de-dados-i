package exercicio08;

public class CaixaEstoque<T> {
    private T item;

    public CaixaEstoque(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
