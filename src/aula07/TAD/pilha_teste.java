package aula07.TAD;

public class pilha_teste {
    public static void main(String[] args) {
      Pilha pilha = new Pilha();
  
      // Inserindo elementos na pilha
      pilha.push("A");
      pilha.push("B");
      pilha.push("C");
  
      // Exibindo o conteúdo da pilha
      pilha.print(); // Saída: P: [ A, B, C, ]
  
      // Removendo o topo da pilha
      Object topo = pilha.pop();
      System.out.println("Topo removido: " + topo); // Saída: Topo removido: C
  
      // Exibindo o conteúdo da pilha após remoção
      pilha.print(); // Saída: P: [ A, B, ]
  
      // Verificando se a pilha está vazia
      System.out.println("Pilha vazia? " + pilha.isEmpty()); // Saída: Pilha vazia? false
  
      // Obtendo o topo da pilha sem remover
      Object novoTopo = pilha.top();
      System.out.println("Topo da pilha: " + novoTopo); // Saída: Topo da pilha: B
    }
  }