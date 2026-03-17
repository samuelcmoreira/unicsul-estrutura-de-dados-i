package aula04;

import java.util.ArrayList;

public class Cidades {
    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<String>();
        cidades.add("São Paulo");
        cidades.add("Santos");
        cidades.add("Ribeirão Preto");

        cidades.add(0, "Campinas");

        System.out.println(cidades);

        System.out.println(cidades.get(2));

        cidades.set(3, "Mirassol");

        System.out.println(cidades);

        cidades.remove(1);
        System.out.println(cidades);

        System.out.println("Número de cidades: " + cidades.size());

        for(int i = 0; i < cidades.size(); i++) {
            System.out.println(cidades.get(i));
        }

        System.out.println("Lista de cidades com laço for-Each");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
    }
}
