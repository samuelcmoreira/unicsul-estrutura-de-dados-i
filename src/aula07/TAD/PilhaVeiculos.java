package aula07.TAD;

public class PilhaVeiculos {
    private Pilha p = null;  //atributo da classe
    
    public static void main(String[] args) {
        new PilhaVeiculos();
    }
    
    public PilhaVeiculos() {
       simulacaoLeituraDeDados();      
       System.out.println("Pilha inicial de VEICULOS:");
       System.out.println( p.toString());  
       
       System.out.println("Adicionamos mais um veículo");
       p.push(new Veiculo("FFL 0007", "Mercedes Benz", "GLA 200", 2017));
       System.out.println("e a pilha fica assim:");
       System.out.println( p.toString());  
       
       System.out.println("Retirando e esvaziando a pilha:");
       while ( !p.isEmpty() ) {
           System.out.println(p.pop());
       }
       if ( p.isEmpty() ) System.out.println("Pilha de veiculos totalmente vázia."); 
       
    }
    
    public void simulacaoLeituraDeDados() {
        //para efetuar teste rápidos, criamos uma pilha com dados fixos:
        p = new Pilha(15);
        p.push(new Veiculo("ABC 1234", "Fiat", "Fiat Mobi Drive", 2016));
        p.push(new Veiculo("DEF 5678", "Fiat", "Grande Punto", 2015));
        p.push(new Veiculo("GHI 9101", "Volkswagen", "Gol Trend", 2017));
        p.push(new Veiculo("FDa 2301", "Audi", "A4", 2018));
    }   
}
