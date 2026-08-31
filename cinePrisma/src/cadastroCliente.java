import java.util.Scanner;
public class cadastroCliente {

    public static String lerCpf(Scanner scan) {
        System.out.println("Digite seu CPF: ");
        String cpf = scan.nextLine();

        String numcpf = cpf.replaceAll("[.\\-\\s]", "");

        if (!numcpf.matches("\\d{11}")) {
            System.out.println("CPF inválido! Digite novamente.");
            return lerCpf(scan);
        }
        return numcpf;
    }
    public static int lerIdade(Scanner scan) {
        System.out.println("Digite sua idade: ");
        String numidade = scan.nextLine();

        if (!numidade.matches("\\d{1,3}")) {
            System.out.println("Digite um número válido!");
            return lerIdade(scan);
        }
        int idade = Integer.parseInt(numidade);
        if (idade < 0 || idade > 120){
            System.out.println("\nDigite uma idade válida (0 a 120)");
            return lerIdade(scan);
        }
        return idade;
    }
    public static String lerNome(Scanner scan) {
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        if (!nome.matches("[\\p{L}\\s]+") || nome.trim().isEmpty()) {

            System.out.println("\nNome inválido! Use apenas letras.");
            return lerNome(scan);
        }
        return nome;
    }
     public static int lerOpcaoMenu(Scanner scan) {
        String opcao = scan.nextLine();

        if(!opcao.matches("\\d+")){
            System.out.println("\nOpção inválida! Escolha apenas 1 ou 2.");
            return lerOpcaoMenu(scan);
            }
        return Integer.parseInt(opcao);
     }

     public static void cadastro(Scanner scan){
        String cadastro = lerNome(scan);

        mensagemFinal.nome = cadastro;

        int idade = lerIdade(scan);

        String numCpf = lerCpf(scan);

        String novoCpf = numCpf.substring(0, 3) + "." +
                numCpf.substring(3, 6) + "." +
                numCpf.substring(6, 9) + "-" +
                numCpf.substring(9, 11);


        System.out.println("\n------- Dados Informados -------");
        System.out.println("Nome: "+cadastro);
        System.out.println("Idade: "+idade);
        System.out.println("CPF: "+novoCpf);
        System.out.println("\n 1 - Ver sessões 2 - Voltar");

        int irVerFilmes = lerOpcaoMenu(scan);

        if(irVerFilmes == 1){
            filmesEmCartaz.exibirfilmes(scan);
        }

        else if (irVerFilmes == 2){
            Main.exebirMenu(scan);
        }

        else{
            System.out.println("Opção invalida! Escolha apenas 1 ou 2");
            cadastroCliente.cadastro(scan);

        }

    }
}