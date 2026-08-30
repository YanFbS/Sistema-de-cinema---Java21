import java.util.Random;

public class mensagemFinal {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BOLD = "\u001B[1m";

    public static String nome;

    public static String filme;

    public static String tipoSessao;

    public static String horario;

    public static String assentos = "";

    public static void reiniciarAssentos() {

        assentos = "";

    }

    public static void adicionarAssento(String assento) {

        if (assentos.isEmpty()) {

            assentos = assento;

        } else {

            assentos = assentos + ", " + assento;

        }

    }

    public static void exibirMensagemFinal() {

        Random random = new Random();
        int sala = random.nextInt(9) + 1;

        System.out.println("\n=============================================");
        System.out.println("Otima escolha, " + nome + "! A CinePrisma agradece a preferência!");
        System.out.println("\nA sua sessão de " + ANSI_BOLD + filme + ANSI_RESET + " [" + tipoSessao + "] começa às " + horario + " na sala " + sala + "!");
        System.out.println("Seus assentos são: " + assentos);
        System.out.println("\nBom filme e volte sempre!");
        System.out.println("=============================================\n");

    }

}