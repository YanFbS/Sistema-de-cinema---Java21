import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("-".repeat(11) + " CinePrisma " + "-".repeat(11));

        System.out.println("\nBem vindos ao CinePrisma!");

        System.out.println("\nO que gostaria de fazer?: \n 1 - Ver sessões\n 2 - Sair");
        int menu = scan.nextInt();

        if (menu == 1){
            System.out.println("AQUI EXIBIR SESSÕES");
        }

        else if (menu == 2){
            System.out.println("Saindo do CinePrisma...");
        }

        else {
            System.out.println(("Opa! Digite apenas 1 ou 2"));
        }
    }
}
