public class Frutas {
    public static void main(String[] args) {
        String fruta1 = "Morango";
        String fruta2 = "Melão";

        if (fruta1.compareTo(fruta2) > 0) {
            System.out.println(fruta1);
        } else {
            System.out.println(fruta2);
        }

        System.out.println(fruta1.compareTo(fruta2));
        System.out.println(fruta1.compareTo(fruta1));
        System.out.println(fruta2.compareTo(fruta1));

        if (fruta1.equals(fruta2)) {
            System.out.println("As frutas são iguais.");
        } else {
            System.out.println("As frutas são diferentes.");
        }

        char a = 'C';
        char b = 'a';

        if (a > b) System.out.println(b + " vem primeiro, depois " + a);
        else if (a < b) System.out.println(a + " vem primeiro, depois " + b);
        else System.out.println("Os caracteres são iguais");
    }
}
