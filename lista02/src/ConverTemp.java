// Exercício 09 - Lista 02 - POO

import java.util.Scanner;
public class ConverTemp {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        double tempC, tempF;

        System.out.print("Informe a temperatura em graus celsius (ºC): ");
        tempC = r.nextDouble();

        tempF = ((9 * tempC) + 160) / 5;

        System.out.println("Temperatura em Fahrenheit: " + tempF);
    }
}
