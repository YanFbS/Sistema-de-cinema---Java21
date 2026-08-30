import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("-".repeat(11) + " CinePrisma " + "-".repeat(11));

        System.out.println("\nBem vindos ao CinePrisma!");

        exebirMenu(scan);
    }

    public static void exebirMenu(Scanner scan){
        System.out.println("\nO que gostaria de fazer?: \n 1 - Fazer cadastro\n 2 - Sair");

        int menu = scan.nextInt();
        scan.nextLine();

        if (menu == 1){
            Cadastro.cadastro(scan);
        }

        else if (menu == 2){
            System.out.println("Saindo do CinePrisma....");
        }

        else {
            System.out.println(("Ops! Digite apenas 1 ou 2."));
            exebirMenu(scan);
        }
    }
}