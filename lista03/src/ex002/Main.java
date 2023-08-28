package ex002;

public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto(001, "Leite", "AAA", "Leite Longa Vida");

        prod1.setId(5);

        System.out.println("ID do Produto: " + prod1.getId());
    }
}
