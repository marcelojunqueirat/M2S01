package M2S01;

import java.util.Scanner;

public class NomeDoUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu sobrenome:");
        String sobrenome = sc.nextLine();

        System.out.println("Informe seu nome:");
        String nome = sc.nextLine();

        System.out.printf("Nome completo: %s %s. %n", nome, sobrenome);
        int quantidadeLetras = nome.length();
        System.out.printf("O nome: %s, possui: %d letras. %n", nome, quantidadeLetras);
    }
}
