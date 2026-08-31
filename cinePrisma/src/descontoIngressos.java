import java.util.Locale;
import java.util.Scanner;

public class descontoIngressos {
    public static boolean eCrinca(int idade){
        if (idade <12){
            return true;
        }   else {
            return false;
        }
    }
    public static boolean eIdoso(int idade){
        if (idade >= 60){
            return true;
        } else {
            return false;
        }
    }

    public static int validarCategoria(Scanner scan, int tipo, int idade){
        if (tipo == 2 && !eCrinca(idade)){
            System.out.println("\nA idade cadastrada não corresponde a 'Menor de 12 anos'.");

            boolean estudante = perguntarEstudante(scan);

            if (estudante){
                return 4;
            } else {
                return 1;
            }
        }

        if (tipo == 3 && !eIdoso(idade)){
            System.out.println("\nA idade cadastrada não corresponde a 'Idoso (60+)'.");

            boolean estudante = perguntarEstudante(scan);

            if (estudante){
                return 4;
            } else{
                return 1;
            }
        }
        return tipo;
    }
    private static boolean perguntarEstudante(Scanner scan) {
        System.out.println("Você é estudante ou professor? (s/n)");
        String resposta = scan.nextLine().trim().toLowerCase();
        if (resposta.equals("s")){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int idadeFalsa = 40; // simula uma idade, sem precisar do Cadastro
        int tipoEscolhido = 2; // simula "cliente escolheu criança"

        int resultado = validarCategoria(scan, tipoEscolhido, idadeFalsa);
        System.out.println("Tipo final aplicado: " + resultado);
    }
}
