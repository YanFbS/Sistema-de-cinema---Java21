import java.util.Scanner;

public class QuantidadeIngresso {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_GREEN = "\u001B[32m";

    public static final String ANSI_BOLD = "\u001B[1m";

    public static final double VALOR_ENTRADA = 20.0;

    public static final double VALOR_CRIANCA = 10.0;

    public static final double VALOR_IDOSO = 14.0;

    public static final double VALOR_ESTUDANTE = 10.0;

    public static void selecionarTiposIngresso(Scanner scan, int totalAssentos) {

        int[] contagem = new int[4];

        selecionarTiposIngresso(scan, totalAssentos, contagem);

    }

    private static void selecionarTiposIngresso(Scanner scan, int restantes, int[] contagem) {

        exibirMenuIngressos(restantes, contagem);

        String opcao = scan.nextLine().trim();

        if (opcao.equals("0")) {

            if (restantes > 0) {

                System.out.println("\nAinda restam " + restantes + " ingresso(s) para selecionar antes de concluir.");

                selecionarTiposIngresso(scan, restantes, contagem);

                return;

            }

            exibirResumo(contagem);

            return;

        }

        if (!opcaoValida(opcao)) {

            System.out.println("\nOpção inválida.");

            selecionarTiposIngresso(scan, restantes, contagem);

            return;

        }

        if (restantes <= 0) {

            System.out.println("\nTodos os ingressos já foram selecionados. Digite 0 para concluir.");

            selecionarTiposIngresso(scan, restantes, contagem);

            return;

        }

        int tipo = Integer.parseInt(opcao);

        contagem[tipo - 1]++;

        selecionarTiposIngresso(scan, restantes - 1, contagem);

    }

    private static boolean opcaoValida(String texto) {

        return texto.length() == 1 && texto.charAt(0) >= '1' && texto.charAt(0) <= '4';

    }

    private static void exibirMenuIngressos(int restantes, int[] contagem) {

        System.out.println("\n=============================================");

        System.out.println("        " + ANSI_BOLD + "[ T I P O   D E   I N G R E S S O ]" + ANSI_RESET);

        System.out.println("=============================================\n");

        System.out.println("1 - Entrada: 20R$");

        System.out.println("2 - Desconto especial: Menores de 12 anos: 10R$");

        System.out.println("3 - Desconto especial: Idosos com 60 anos (ou mais): 14R$");

        System.out.println("4 - Desconto especial: Alunos e Professores: 10R$");

        System.out.println();

        if (restantes > 0) {

            System.out.println(ANSI_GREEN + "Ingressos Restantes: " + restantes + ANSI_RESET);

        } else {

            System.out.println(ANSI_GREEN + "Ingressos Restantes: 0 - pronto para concluir!" + ANSI_RESET);

        }

        System.out.println("0 - Concluir e prosseguir");

        System.out.print("\nEscolha uma opção: ");

    }

    private static void exibirResumo(int[] contagem) {

        double total = contagem[0] * VALOR_ENTRADA

                + contagem[1] * VALOR_CRIANCA

                + contagem[2] * VALOR_IDOSO

                + contagem[3] * VALOR_ESTUDANTE;

        int totalIngressos = contagem[0] + contagem[1] + contagem[2] + contagem[3];

        System.out.println("\n=============================================");

        System.out.println("              " + ANSI_BOLD + "[ R E S U M O ]" + ANSI_RESET);

        System.out.println("=============================================\n");

        System.out.println("Entrada: " + contagem[0]);

        System.out.println("Menores de 12 anos: " + contagem[1]);

        System.out.println("Idosos (60+): " + contagem[2]);

        System.out.println("Alunos/Professores: " + contagem[3]);

        System.out.println("---------------------------------------------");

        System.out.println("Total de ingressos: " + totalIngressos);

        System.out.printf(ANSI_BOLD + "Valor total: R$ %.2f" + ANSI_RESET + "%n", total);

        mensagemFinal.exibirMensagemFinal();

    }

}