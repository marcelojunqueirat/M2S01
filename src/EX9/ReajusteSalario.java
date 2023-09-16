package EX9;

import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        double novoSalario = 0.00;
        double aumento = 0.00;
        int percentual = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Simulador de Reajuste");
        System.out.println("Informe o seu salário:");
        double salario = Double.parseDouble(sc.nextLine().replace(",", "."));

        if (salario <= 1200.00){
            novoSalario = salario * 1.2;
            aumento = salario * 0.20;
            percentual = 20;
        } else if (salario > 1200.00 && salario <= 1700){
            novoSalario = salario * 1.15;
            aumento = salario * 0.15;
            percentual = 15;
        } else if (salario > 1700.00 && salario <= 2500){
            novoSalario = salario * 1.10;
            aumento = salario * 0.10;
            percentual = 10;
        } else {
            novoSalario = salario * 1.05;
            aumento = salario * 0.05;
            percentual = 5;
        }

        System.out.printf("Salário Anterior R$%.2f. %n", salario);
        System.out.printf("Percentual de aumento aplicado: %d%%. %n", percentual);
        System.out.printf("Valor do aumento R$%.2f. %n", aumento);
        System.out.printf("Novo salário após reajuste R$%.2f. %n", novoSalario);
    }
}
