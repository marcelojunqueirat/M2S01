package EX4;

import java.util.Scanner;

public class AdivinheONumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aleatorio = (int) Math.round(Math.random() * (5-1) + 1);
        System.out.println(aleatorio);

        System.out.println("Adivinhe qual número de 1 a 5 eu estou pensando:");
        int palpite = Integer.parseInt(sc.nextLine());

        while(palpite != aleatorio) {
            if(palpite > 5 || palpite < 1 ){
                System.out.println("Você deve digitar um número entre 1 a 5. Tente novamente:");
            } else {
                System.out.println("Você errou! Tente novamente:");
            }
            palpite = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Você acertou!");

    }
}
