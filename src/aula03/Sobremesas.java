package aula03;

import java.util.ArrayList;

public class Sobremesas {
    public static void main(String[] args) {
        ArrayList<String> sobremesas = new ArrayList<String>();
        sobremesas.add("banoffee");
        sobremesas.add("mousse de maracujá");
        sobremesas.add("bolo de chocolate");
        System.out.println(sobremesas);
        sobremesas.add(0, "brigadeiro");
        System.out.println(sobremesas);
        System.out.println(sobremesas.get(2));
        sobremesas.set(2, "mousse de limão");
        System.out.println(sobremesas);
    }
}
