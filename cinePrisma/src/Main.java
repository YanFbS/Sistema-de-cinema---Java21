import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("-".repeat(11) + " CinePrisma " + "-".repeat(11));

        System.out.println("\nBem vindos ao CinePrisma!");

        exebirMenu(scan);
    }

    public static void exebirMenu(Scanner scan){
        System.out.println("\nO que gostaria de fazer?: \n 1 - Ver sessões\n 2 - Sair");

        int menu = scan.nextInt();
        scan.nextLine();

        if (menu == 1){
            System.out.println("AQUI EXIBIR SESSÕES");

            System.out.println("-".repeat(11) + " CinePrisma " + "-".repeat(11));

            System.out.println("-".repeat(6) + " Cadastro CinePrisma " + "-".repeat(6));

            System.out.println("Digite seu nome: ");
            String cadastro = scan.nextLine();

            System.out.println("Digite Sua idade: ");
            int idade = scan.nextInt();
            scan.nextLine();

            System.out.println("Digite seu CPF: ");
            String cpf = scan.nextLine();

            String numcpf = cpf.replaceAll("[.\\-\\s]","");

            String novocpf = numcpf.substring(0, 3) + "." +
                    numcpf.substring(3, 6) + "." +
                    numcpf.substring(6, 9) + "-" +
                    numcpf.substring(9, 11);


            System.out.println("\n------- Dados Informados -------");
            System.out.println("Nome: "+cadastro);
            System.out.println("Idade: "+idade);
            System.out.println("CPF: "+novocpf);
            System.out.println("\nSaindo do programa...");

        }

        else if (menu == 2){
            System.out.println("Saindo do CinePrisma...");
        }

        else {
            System.out.println(("Ops! Digite apenas 1 ou 2"));
            exebirMenu(scan);
        }
    }
}
