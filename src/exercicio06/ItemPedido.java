package exercicio06;

public class ItemPedido implements IItemPedido {
    
    private String nome;
    private int quantidade;
    private double valorUnitario;

    public ItemPedido(String nome, int quantidade, double valorUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public double getValorUnitario() {
        return valorUnitario;
    }

    @Override
    public double getSubtotal() {
        return quantidade * valorUnitario;
    }

    @Override
    public String toString() {
        return String.format("%dx %-15s (R$ %.2f cada)", quantidade, nome, valorUnitario);
    }
}