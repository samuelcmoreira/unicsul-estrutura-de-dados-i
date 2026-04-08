package aula07.TAD;

public class Veiculo{
    private String placa;
    private String marca;
    private String modelo;
    private int anoFabricacao;

    public Veiculo(){
    }
      
    public Veiculo(String inPlaca, String inMarca, String inModelo, int inAnoFabricacao) {
      setPlaca(inPlaca);
      setMarca(inMarca);
      setModelo(inModelo);
      setAnoFabricacao(inAnoFabricacao);
   }
   
    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setPlaca(String inPlaca) {
        placa = inPlaca;
    }

    public void setMarca(String InMarca) {
        marca = InMarca;
    }

    public void setModelo(String inModelo) {
        modelo = inModelo;
    }

    public void setAnoFabricacao(int inAnoFabricacao) {
        anoFabricacao = inAnoFabricacao;
    }

       public String toString()  {
       return("Placa: " +getPlaca()+ ", Marca: " + getMarca()
       	    + ", Modelo: " + getModelo()
            + ", Ano de Fabricação: " +getAnoFabricacao());
   }
}


