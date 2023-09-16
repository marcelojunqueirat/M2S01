package EX6;

import java.util.Scanner;

public class PossibilidadeDeVoto {
    public static void main(String[] args) {
        int anoAtual = 2023;
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua data de nascimento? (dd/mm/aaaa)");
        String dataNascimento = sc.nextLine();

        int idade = anoAtual - Integer.parseInt(dataNascimento.substring(6));
        System.out.println(idade);

        if(idade < 16) {
            System.out.println("O voto é proibido");
        } else if (idade >= 18 && idade <= 59){
            System.out.println("O voto é obrigatório");
        } else {
            System.out.println("O voto é opcional");
        }
    }
}
