package EX2;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua altura:");
        double altura = Double.parseDouble(sc.nextLine().replace(",", "."));

        System.out.println("Digite seu peso:");
        double peso = Double.parseDouble(sc.nextLine().replace(",", "."));

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f. %n", imc);
    }
}
