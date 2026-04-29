package exercicio06;

public interface IItemPedido {
    String getNome();
    int getQuantidade();
    double getValorUnitario();
    double getSubtotal(); // O cálculo: qtd * valorUnitario
}