package exercicio06;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements IPedido {

    private int numero;
    private String cliente;
    private double valorTotal;
    private List<IItemPedido> itens = new ArrayList<>();

    public Pedido(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    @Override public List<IItemPedido> getItens() { return itens; }
    
    @Override
    public void adicionarItem(IItemPedido item) {
        this.itens.add(item);
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public String getCliente() {
        return cliente;
    }

    @Override
    public double getValorTotal() {
        return itens.stream().mapToDouble(IItemPedido::getSubtotal).sum();
    }

    @Override
    public String toString() {
        return String.format("Pedido #%03d | Cliente: %-10s | Total: R$ %.2f", 
                             numero, cliente, getValorTotal());
    }


    public String gerarResumoDetalhado() {
        StringBuilder sb = new StringBuilder();
        sb.append("------------------------------------------\n");
        sb.append(String.format("RESUMO DO PEDIDO #%03d\n", numero));
        sb.append("Cliente: ").append(cliente).append("\n");
        sb.append("------------------------------------------\n");
        for (IItemPedido item : itens) {
            sb.append(item.toString()).append(" - Subtotal: R$ ")
            .append(String.format("%.2f", item.getSubtotal())).append("\n");
        }
        sb.append("------------------------------------------\n");
        sb.append(String.format("VALOR TOTAL: R$ %.2f\n", getValorTotal()));
        sb.append("------------------------------------------");
        return sb.toString();
    }    
}
