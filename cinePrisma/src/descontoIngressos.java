import java.util.Scanner;


public class descontoIngressos {
    public static void main(String[] args){

        System.out.println("\n" + "-".repeat(11) + " Política de Descontos CinePrisma " + "-".repeat(11) +"\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Menor de 12 anos (50% de desconto)\n" + "2 - Estudante/Professor (50% de desconto)\n" + "3 - Maior de 60 anos (30% de desconto)\n" + "4 - Nenhum desconto (sala VIP ou não se enquadra)\n" +"\n" + "Escolha sua opção:");

        int opcaoDesconto = scan.nextInt();

        if (opcaoDesconto == 1){

        }
    }
}
