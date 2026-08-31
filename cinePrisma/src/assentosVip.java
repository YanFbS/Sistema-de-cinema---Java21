import java.util.Scanner;

public class assentosVip {

    public static final String ANSI_RESET = "\u001B[0m";

    public static final String ANSI_RED = "\u001B[31m";

    public static final String ANSI_GREEN = "\u001B[32m";

    public static final String ANSI_BOLD = "\u001B[1m";

    public static void selecaoAssentoVip(Scanner scan) {

        int fileiras = 8;

        int colunas = 12;

        boolean[][] assentos = new boolean[fileiras][colunas];

        assentos[3][10] = true;

        mensagemFinal.reiniciarAssentos();

        scan.nextLine();

        executarMenu(assentos, fileiras, colunas, scan, 0);

    }

    public static void executarMenu(boolean[][] assentos, int fileiras, int colunas, Scanner scan, int assentosSelecionados) {

        exibirMapa(assentos, fileiras, colunas);

        System.out.println("\nAssentos selecionados nesta compra: " + assentosSelecionados);

        System.out.println("\nDigite a fileira (A-H) e a coluna (1-12) ex: C5 (0 - Prossegir):");

        String entrada = scan.nextLine().toUpperCase();

        if (entrada.equals("0")) {

            if (assentosSelecionados == 0) {

                System.out.println("\nVocê precisa selecionar pelo menos um assento antes de prosseguir.");

                executarMenu(assentos, fileiras, colunas, scan, assentosSelecionados);

                return;

            }

            quantidadeIngressoVIP.selecionarTiposIngresso(scan, assentosSelecionados);

            return;

        }

        boolean reservado = processarReserva(entrada, assentos, fileiras, colunas);

        executarMenu(assentos, fileiras, colunas, scan, reservado ? assentosSelecionados + 1 : assentosSelecionados);

    }

    public static void exibirMapa(boolean[][] assentos, int fileiras, int colunas) {

        System.out.println("\n=============================================");

        System.out.println("                " + ANSI_BOLD + "[ T E L A ]" + ANSI_RESET);

        System.out.println("=============================================\n");

        System.out.print("    ");

        imprimirCabecalho(1, colunas);

        System.out.println("\n");

        imprimirFileiras(assentos, 0, fileiras, colunas);

        System.out.println("\nLegenda: " + ANSI_GREEN + "[L] Livre" + ANSI_RESET + " | " + ANSI_RED + "[X] Ocupado" + ANSI_RESET);

    }

    public static void imprimirCabecalho(int colunaAtual, int colunas) {

        if (colunaAtual > colunas) {

            return;

        }

        System.out.printf("%02d ", colunaAtual);

        imprimirCabecalho(colunaAtual + 1, colunas);

    }

    public static void imprimirFileiras(boolean[][] assentos, int fileiraAtual, int fileiras, int colunas) {

        if (fileiraAtual >= fileiras) {

            return;

        }

        char letraFileira = (char) ('A' + fileiraAtual);

        System.out.print(letraFileira + "   ");

        imprimirColunas(assentos, fileiraAtual, 0, colunas);

        System.out.println();

        imprimirFileiras(assentos, fileiraAtual + 1, fileiras, colunas);

    }

    public static void imprimirColunas(boolean[][] assentos, int fileiraAtual, int colunaAtual, int colunas) {

        if (colunaAtual >= colunas) {

            return;

        }

        String status = assentos[fileiraAtual][colunaAtual]

                ? ANSI_RED + "[X]" + ANSI_RESET

                : ANSI_GREEN + "[L]" + ANSI_RESET;

        System.out.print(status + " ");

        imprimirColunas(assentos, fileiraAtual, colunaAtual + 1, colunas);

    }

    public static boolean processarReserva(String entrada, boolean[][] assentos, int fileiras, int colunas) {

        if (entrada.length() < 2) {

            System.out.println("Entrada inválida.");

            return false;

        }

        char letraFileira = entrada.charAt(0);

        String parteNumero = entrada.substring(1);

        if (!ehNumero(parteNumero, 0)) {

            System.out.println("Formato de entrada inválido.");

            return false;

        }

        int fileiraIdx = letraFileira - 'A';

        int colunaIdx = Integer.parseInt(parteNumero) - 1;

        if (fileiraIdx >= 0 && fileiraIdx < fileiras && colunaIdx >= 0 && colunaIdx < colunas) {

            if (assentos[fileiraIdx][colunaIdx]) {

                System.out.println("Assento já ocupado!");

                return false;

            } else {

                assentos[fileiraIdx][colunaIdx] = true;

                mensagemFinal.adicionarAssento(entrada);

                System.out.println("Assento reservado com sucesso!");

                return true;

            }

        } else {

            System.out.println("Posição fora dos limites da sala!");

            return false;

        }

    }
    public static boolean ehNumero(String texto, int indice) {

        if (texto.isEmpty()) {

            return false;

        }

        if (indice >= texto.length()) {

            return true;

        }

        char c = texto.charAt(indice);

        if (c < '0' || c > '9') {

            return false;

        }
        return ehNumero(texto, indice + 1);
    }
}