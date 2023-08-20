// Exercício 10 - Lista 02 - POO

import java.util.Scanner;
public class CalculaDistancia {
    public static void main(String[] args) {
        double tempoViagem, velocidadeMedia, distancia, litros;
        Scanner r = new Scanner(System.in);

        System.out.println("Informe o tempo decorrido da viagem (em horas): ");
        tempoViagem = r.nextDouble();

        System.out.println("Informe a velocidade média (em Km/h): ");
        velocidadeMedia = r.nextDouble();

        distancia = tempoViagem * velocidadeMedia;
        litros = distancia / 12;

        System.out.println("\nDistância percorrida (em Km): " + distancia);
        System.out.println("Quantidade de combustível consumido (em L): " + litros);
    }
}
