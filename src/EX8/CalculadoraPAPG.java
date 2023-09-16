package EX8;

import java.util.Scanner;

public class CalculadoraPAPG {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[10];

        System.out.println("Digite o Valor Inciial");
        valores[0] = Integer.parseInt(sc.nextLine());

        System.out.println("Digite o Valor Raiz");
        int raiz = Integer.parseInt(sc.nextLine());

        do {
            System.out.println("1 - PA || 2 - PG");
            opcao = Integer.parseInt(sc.nextLine());
        } while (!(opcao == 1 || opcao == 2));


        for (int i = 1; i < valores.length; i++){
            if(opcao == 1){
                valores[i] = raiz + valores[i-1];
            } else {
                valores[i] = raiz * valores[i-1];
            }
        }

        for (int valor : valores){
            System.out.println(valor);
        }
    }
}
