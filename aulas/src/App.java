import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();

        nomes.add("ADRIEL"); //ADICIONANDO ELEMENTO NA LISTA
        nomes.add("RAFAELA");
        nomes.add("ANDRE");

        for (String nome : nomes) {
            if (nome.equals("RAFAELA")) {
                System.out.println("Nome da Corna: " + nome);
            } else {
                System.out.println("Nome do Corno: " + nome);
            }
        }
    }
}
