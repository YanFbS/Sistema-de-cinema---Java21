import java.util.Scanner;

public class filmesEmCartaz {
    public static void exibirfilmes(Scanner scan){

        System.out.println("\nFilmes em cartaz:\n1 - Star Wars: Episodio 3 - A vingança dos Sith\n2 - Homem-Aranha: Um Novo Dia\n3 - Rocky, um Lutador\n4 - Harry potter e a Pedra Filosofal\n5 - Interestelar\n6 - Duna: Parte Dois\n7 - A Odisseia\n\n0 - Voltar");
        int filmesCartaz = scan.nextInt();

        if (filmesCartaz == 1) {
            System.out.println("Star Wars: Episodio 3 - A vingança dos Sith\n[14] 2 h 20 min | Ação, Aventura\n\nTrês anos após o início das Guerras Clônicas, Obi-Wan Kenobi persegue uma nova ameaça\nenquanto Anakin Skywalker é atraído pelo Chanceler Palpatine para uma conspiração sinistra para governar a galáxia.\n\n1 - Comprar ingreso\n2 - Voltar");
            int continuar = scan.nextInt();

            if (continuar == 1){
                sessoes.exibirsessoes(scan);
            }

            else if (continuar == 2){
                exibirfilmes(scan);
            }
        }

        else if (filmesCartaz == 2){
            System.out.println("Homem-Aranha: Um Novo Dia\n[12] 2 h 24 min | Ação, Aventura, Fantasia, Ficção Científica\n\nPeter Parker tenta se concentrar na faculdade e deixar o Homem-Aranha para trás. Mas quando uma nova ameaça surge\nele quebra sua promessa, veste o traje e se une a um aliado inesperado para protegê-los.\n\n1 - Comprar ingreso\n2 - Voltar");
            int continuar = scan.nextInt();

            if (continuar == 1){
                sessoes.exibirsessoes(scan);
            }

            else if (continuar == 2){
                exibirfilmes(scan);
            }
        }

        else if (filmesCartaz == 3){
            System.out.println("Rocky, um Lutador\n[12] 2h | Ação, Drama\n\nUm boxer pouco conhecido tem uma grande oportunidade de enfrentar o campeão dos pesos pesados\nem uma partida em que ele esperaele espera estar à altura da tarefa e divulgar seu nome.\n\n1 - Comprar ingreso\n2 - Voltar");
            int continuar = scan.nextInt();

            if (continuar == 1){
                sessoes.exibirsessoes(scan);
            }

            else if (continuar == 2){
                exibirfilmes(scan);
            }
        }

        else if (filmesCartaz == 4){
            System.out.println("Harry potter e a Pedra Filosofal\n[10] 2 h 42 min | Ação, Aventura, Fantasia\n\nHarry Potter é um garoto que, após a misteriosa morte dos pais, mora com os tios. Harry leva uma vida de privações\nmas sua história muda de rumo quando completa 11 anos e descobre ser um bruxo, ingressando na escola de magia de Hogwarts.\n\n1 - Comprar ingreso\n2 - Voltar");
            int continuar = scan.nextInt();

            if (continuar == 1){
                sessoes.exibirsessoes(scan);
            }

            else if (continuar == 2){
                exibirfilmes(scan);
            }
        }

        else if (filmesCartaz == 5){
            System.out.println("Interestelar\n[10] 2 h 51 min | Ficção\n\nUma equipe de exploradores viaja através de um buraco de minhoca no espaço, na tentativa de garantir a sobrevivência da humanidade.\n\n1 - Comprar ingreso\n2 - Voltar");
            int continuar = scan.nextInt();

            if (continuar == 1){
                sessoes.exibirsessoes(scan);
            }

            else if (continuar == 2){
                exibirfilmes(scan);
            }
        }

        else if (filmesCartaz == 6){
            System.out.println("Duna: Parte Dois\n[14] 2 h 46 min | Ação, Aventura, Fantasia, Ficção\n\nDiante da difícil escolha entre o amor de sua vida e o destino do universo conhecido, Paul Atreides\nagora ao lado de Chani e dos Fremen, dará tudo de si para evitar o futuro terrível que só ele pode prever.\n\n1 - Comprar ingreso\n2 - Voltar");
            int continuar = scan.nextInt();

            if (continuar == 1){
                sessoes.exibirsessoes(scan);
            }

            else if (continuar == 2){
                exibirfilmes(scan);
            }
        }

        else if (filmesCartaz == 7){
            System.out.println("A Odisseia\n [14] 2 h 52 min | Ação, Aventura, Épico, Fantasia\n\nApós a Guerra de Troia, o herói grego Odisseu retorna a Ítaca, na Grécia, enfrentando figuras\nda mitologia grega como o Ciclope Polifemo, as Sereias e Calipso.\n\n1 - Comprar ingreso\n2 - Voltar");
            int continuar = scan.nextInt();

            if (continuar == 1){
                sessoes.exibirsessoes(scan);
            }

            else if (continuar == 2){
                exibirfilmes(scan);
            }
        }

        else if (filmesCartaz == 0){
            Main.exebirMenu(scan);
        }

        else{
            System.out.println("\nOpa! Escolha apenas os filmes em cartaz");
            exibirfilmes(scan);
        }
    }
}
