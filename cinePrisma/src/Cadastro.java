import java.util.Scanner;
public class Cadastro {

    public static String lerCpf(Scanner scan) {
        System.out.println("Digite seu CPF: ");
        String cpf = scan.nextLine();

        String numcpf = cpf.replaceAll("[.\\-\\s]", "");

        if (numcpf.length() != 11) {
            System.out.println("CPF inválido! Digite novamente.");
            return lerCpf(scan);
        }
        return numcpf;
    }
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

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
}