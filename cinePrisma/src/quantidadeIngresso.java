import java.util.Scanner;

public class quantidadeIngresso {

    private static void exibirSessoes(int sessao) {
        if (sessao > 10) {
            return;
        }

        System.out.println(
                sessao + " - Sessão " + sessao + " | Formatos disponíveis: 2D, 3D e VIP"
        );
        exibirSessoes(sessao + 1);
    }

    public static void iniciar(Scanner scan) {
        System.out.println("\nDigite a quantidade de ingressos para a sessão:");
        int ingressos = scan.nextInt();

        System.out.println("\nSessões disponíveis:");
        exibirSessoes(1);

        System.out.println("\nEscolha o número da sessão, de 1 a 10:");
        int sessaoEscolhida = scan.nextInt();

        System.out.println("\nEscolha o formato:");
        System.out.println("1 - 2D");
        System.out.println("2 - 3D");
        System.out.println("3 - VIP");

        int formatoEscolhido = scan.nextInt();
        String formato;

        if (formatoEscolhido == 1) {
            formato = "2D";
        } else if (formatoEscolhido == 2) {
            formato = "3D";
        } else if (formatoEscolhido == 3) {
            formato = "VIP";
        } else {
            System.out.println("Formato inválido.");
            return;
        }

        System.out.println("\nSessão selecionada: " + sessaoEscolhida);
        System.out.println("Formato escolhido: " + formato);
        System.out.println("Total de ingressos: " + ingressos);
    }
}
