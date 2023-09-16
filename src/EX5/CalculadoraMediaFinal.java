package EX5;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraMediaFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            System.out.printf("Digite a %dª nota: %n", (i+1));
            notas.add(Double.parseDouble(sc.nextLine().replace(",", ".")));
        }

        double result = 0;
        for (double nota: notas){
            result += nota;
        }
        System.out.printf("Sua média final é: %.2f%n.", (result/notas.size()));

    }
}
