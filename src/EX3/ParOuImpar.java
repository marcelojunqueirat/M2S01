package EX3;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = Integer.parseInt(sc.nextLine());

        String ehPar = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.printf("O número %d é: %s. %n", numero, ehPar);
    }
}
