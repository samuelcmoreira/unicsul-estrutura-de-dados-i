package exercicio08;

public class Principal {
    public static void main(String[] args) {
        CaixaEstoque<String> caixaString = new CaixaEstoque<String>("Peça A-300");
        String item = caixaString.getItem();
        System.out.println("Caixa Item: " + item);

        CaixaEstoque<Double> caixaDouble = new CaixaEstoque<Double>(25.50);
        Double preco = caixaDouble.getItem();
        System.out.println("Preço Item: " + preco);
    }
}
