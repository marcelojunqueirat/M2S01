package EX7;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int opcao = 0;
        double resultado = 0;
        String operacao = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("**** Calculadora Amadora ****");
        System.out.println("Digite o primeiro valor:");
        double primeiroValor = Double.parseDouble(sc.nextLine().replace(",","."));
        System.out.println("Digite o segundo valor:");
        double segundoValor = Double.parseDouble(sc.nextLine().replace(",","."));

        do {
            System.out.println("Digite um número referente a operação desejada:");
            System.out.println("1 para SOMAR.");
            System.out.println("2 para SUBTRAIR.");
            System.out.println("3 para MULTIPLICAR.");
            System.out.println("4 para DIVIDIR.");
            opcao = Integer.parseInt(sc.nextLine());
        } while (!(opcao > 0 && opcao < 5));

        switch (opcao){
            case 1:
                resultado = primeiroValor + segundoValor;
                operacao = "+";
                break;
            case 2:
                resultado = primeiroValor - segundoValor;
                operacao = "-";
                break;
            case 3:
                resultado = primeiroValor * segundoValor;
                operacao = "*";
                break;
            case 4:
                resultado = primeiroValor / segundoValor;
                operacao = "/";
                break;
            default:
                operacao ="invalida";
        }

        if (operacao == "invalida"){
            System.out.println("Erro de processamento. Tente novamente mais tarde.");
        } else {
            System.out.printf("O resultado do calculo %.2f %s %.2f é: %.2f", primeiroValor, operacao, segundoValor, resultado);
        }

    }
}
