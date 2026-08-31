import java.util.Scanner;

public class sessoes {
    public static void exibirsessoes(Scanner scan){

        System.out.println(" 1 - [HOJE]    2 - [TERÇA]     3 - [QUARTA]     4 - [QUINTA]     5 - [SEXTA]     6 - [SABADO]     7 - [DOMINGO]     0 - Voltar");
        System.out.println("     [31/08]       [01/09]         [02/09]          [03/09]          [04/09]         [05/09]          [06/09]");
        int escolherDia = scan.nextInt();

        if (escolherDia == 1){
            System.out.println("\n1 - [VIP][DUBLADO]");
            System.out.println("[18:00] [20:00]");
            System.out.println("\n2 - [DUBLADO]");
            System.out.println("[18:30] [19:20] [20:00]");
            System.out.println("\n3 - [3D] [DUBLADO]");
            System.out.println("[19:30] [21:30] [22:30]");
            System.out.println("\n4 - [LEGENDADO]");
            System.out.println("[20:30]");
            System.out.println("\n0 - voltar");

            int selecaoDeHorarios = scan.nextInt();

            if (selecaoDeHorarios == 1) {
                System.out.println("\n1 - [18:00] 2 - [20:00] 0 - Voltar");
                int selecaoDeAssentos = scan.nextInt();

                String[] horariosVipHoje = {"18:00", "20:00"};

                if (selecaoDeAssentos == 1){
                    mensagemFinal.tipoSessao = "VIP DUBLADO";
                    mensagemFinal.horario = horariosVipHoje[selecaoDeAssentos - 1];
                    assentosVip.selecaoAssentoVip(scan);
                }
                else if(selecaoDeAssentos == 2){
                    mensagemFinal.tipoSessao = "VIP DUBLADO";
                    mensagemFinal.horario = horariosVipHoje[selecaoDeAssentos - 1];
                    assentosVip.selecaoAssentoVip(scan);
                }
                else if (selecaoDeAssentos == 0){
                    exibirsessoes(scan);
                }
                else {
                    System.out.println("\nOpa! Escolha uma opção válida");
                    exibirsessoes(scan);
                }
            }

            else if(selecaoDeHorarios == 2){
                System.out.println("\n1 - [18:30] 2 - [19:20] 3 - [20:00] 0 - Voltar");
                int selecaoDeAssentos = scan.nextInt();
                String[] horariosDubladoHoje = {"18:30", "19:20", "20:00"};

                if (selecaoDeAssentos == 1){
                    mensagemFinal.tipoSessao = "DUBLADO";
                    mensagemFinal.horario = horariosDubladoHoje[selecaoDeAssentos - 1];
                    assentos.selecaoAssento(scan);
                }
                else if(selecaoDeAssentos == 2){
                    mensagemFinal.tipoSessao = "DUBLADO";
                    mensagemFinal.horario = horariosDubladoHoje[selecaoDeAssentos - 1];
                    assentos.selecaoAssento(scan);
                }
                else if(selecaoDeAssentos == 3){
                    mensagemFinal.tipoSessao = "DUBLADO";
                    mensagemFinal.horario = horariosDubladoHoje[selecaoDeAssentos - 1];
                    assentos.selecaoAssento(scan);
                }
                else if (selecaoDeAssentos == 0){
                    exibirsessoes(scan);
                }
                else {
                    System.out.println("\nOpa! Escolha uma opção válida");
                    exibirsessoes(scan);
                }
            }

            else if(selecaoDeHorarios == 3){
                System.out.println("\n1 - [19:30] 2 - [21:30] 3 - [22:30] 0 - Voltar");
                int selecaoDeAssentos = scan.nextInt();
                String[] horarios3DHoje = {"19:30", "21:30", "22:30"};

                if (selecaoDeAssentos == 1){
                    mensagemFinal.tipoSessao = "3D DUBLADO";
                    mensagemFinal.horario = horarios3DHoje[selecaoDeAssentos - 1];
                    assentos3D.selecaoAssento3D(scan);
                }
                else if(selecaoDeAssentos == 2){
                    mensagemFinal.tipoSessao = "3D DUBLADO";
                    mensagemFinal.horario = horarios3DHoje[selecaoDeAssentos - 1];
                    assentos3D.selecaoAssento3D(scan);
                }
                else if(selecaoDeAssentos == 3){
                    mensagemFinal.tipoSessao = "3D DUBLADO";
                    mensagemFinal.horario = horarios3DHoje[selecaoDeAssentos - 1];
                    assentos3D.selecaoAssento3D(scan);
                }
                else if (selecaoDeAssentos == 0){
                    exibirsessoes(scan);
                }
                else {
                    System.out.println("\nOpa! Escolha uma opção válida");
                    exibirsessoes(scan);
                }
            }

            else if(selecaoDeHorarios == 4){
                System.out.println("\n1 - [20:30] 0 - Voltar");
                int selecaoDeAssentos = scan.nextInt();

                if (selecaoDeAssentos == 1){
                    mensagemFinal.tipoSessao = "LEGENDADO";
                    mensagemFinal.horario = "20:30";
                    assentos.selecaoAssento(scan);
                }
                else if (selecaoDeAssentos == 0){
                    exibirsessoes(scan);
                }
                else {
                    System.out.println("\nOpa! Escolha uma opção válida");
                    exibirsessoes(scan);
                }
            }

            else if (selecaoDeHorarios == 0){
                exibirsessoes(scan);
            }

            else {
                System.out.println("\nOpa! Escolha uma opção válida");
                exibirsessoes(scan);
            }
        }

        else if(escolherDia == 2 || escolherDia == 3 || escolherDia == 4 || escolherDia == 5 || escolherDia == 6 || escolherDia == 7){
            System.out.println("\n1 - [VIP][DUBLADO]");
            System.out.println("[09:00] [10:30] [12:40] [14:00] [16:30] [18:00] [21:30]");
            System.out.println("\n2 - [DUBLADO]");
            System.out.println("[08:30] [10:00] [13:00] [15:30] [17:00] [20:30]");
            System.out.println("\n3 - [3D][DUBLADO]");
            System.out.println("[09:30] [11:00] [12:00] [14:30] [16:00] [19:30] [21:30] [23:00]");
            System.out.println("\n4 - [LEGENDADO]");
            System.out.println("[10:30] [14:20] [17:30] [20:30]");
            System.out.println("\n0 - voltar");

            int selecaoDeHorarios = scan.nextInt();

            if (selecaoDeHorarios == 1) {
                System.out.println("\n1 - [09:00] 2 - [10:30] 3 - [12:40] 4 - [14:00] 5 - [16:30] 6 - [18:00] 7 - [21:30] 0 - Voltar");
                int selecaoDeAssentos = scan.nextInt();

                String[] horariosVipSemana = {"09:00", "10:30", "12:40", "14:00", "16:30", "18:00", "21:30"};

                if (selecaoDeAssentos == 0) {
                    exibirsessoes(scan);
                }
                else if (selecaoDeAssentos >= 1 && selecaoDeAssentos <= 7) {
                    mensagemFinal.tipoSessao = "VIP DUBLADO";
                    mensagemFinal.horario = horariosVipSemana[selecaoDeAssentos - 1];
                    assentosVip.selecaoAssentoVip(scan);
                }
                else {
                    System.out.println("\nOpa! Escolha uma opção válida");
                    exibirsessoes(scan);
                }
            }

            else if(selecaoDeHorarios == 2){
                System.out.println("\n1 - [08:30] 2 - [10:00] 3 - [13:00] 4 - [15:30] 5 - [17:00] 6 - [20:30] 0 - Voltar");
                int selecaoDeAssentos = scan.nextInt();

                String[] horariosDubladoSemana = {"08:30", "10:00", "13:00", "15:30", "17:00", "20:30"};

                if (selecaoDeAssentos == 0) {
                    exibirsessoes(scan);
                }
                else if (selecaoDeAssentos >= 1 && selecaoDeAssentos <= 6) {
                    mensagemFinal.tipoSessao = "DUBLADO";
                    mensagemFinal.horario = horariosDubladoSemana[selecaoDeAssentos - 1];
                    assentos.selecaoAssento(scan);
                }
                else {
                    System.out.println("\nOpa! Escolha uma opção válida");
                    exibirsessoes(scan);
                }
            }

            else if(selecaoDeHorarios == 3){
                System.out.println("\n1 - [09:30] 2 - [11:00] 3 - [12:00] 4 - [14:30] 5 - [16:00] 6 - [19:30] 7 - [21:30] 8 - [23:00] 0 - Voltar");
                int selecaoDeAssentos = scan.nextInt();

                String[] horarios3DSemana = {"09:30", "11:00", "12:00", "14:30", "16:00", "19:30", "21:30", "23:00"};

                if (selecaoDeAssentos == 0) {
                    exibirsessoes(scan);
                }
                else if (selecaoDeAssentos >= 1 && selecaoDeAssentos <= 8) {
                    mensagemFinal.tipoSessao = "3D DUBLADO";
                    mensagemFinal.horario = horarios3DSemana[selecaoDeAssentos - 1];
                    assentos3D.selecaoAssento3D(scan);
                }
                else {
                    System.out.println("\nOpa! Escolha uma opção válida");
                    exibirsessoes(scan);
                }
            }

            else if(selecaoDeHorarios == 4){
                System.out.println("\n1 - [10:30] 2 - [14:20] 3 - [17:30] 4 - [20:30] 0 - Voltar");
                int selecaoDeAssentos = scan.nextInt();

                String[] horariosLegendadoSemana = {"10:30", "14:20", "17:30", "20:30"};

                if (selecaoDeAssentos == 0) {
                    exibirsessoes(scan);
                }
                else if (selecaoDeAssentos >= 1 && selecaoDeAssentos <= 4) {
                    mensagemFinal.tipoSessao = "LEGENDADO";
                    mensagemFinal.horario = horariosLegendadoSemana[selecaoDeAssentos - 1];
                    assentos.selecaoAssento(scan);
                }
                else {
                    System.out.println("\nOpa! Escolha uma opção válida");
                    exibirsessoes(scan);
                }
            }

            else if (selecaoDeHorarios == 0){
                exibirsessoes(scan);
            }

            else {
                System.out.println("\nOpa! Escolha uma opção válida");
                exibirsessoes(scan);
            }
        }
        else if (escolherDia == 0){
            Main.exebirMenu((scan));
            }else {
            System.out.println("\nOpa! Escolha uma opção válida");
            exibirsessoes(scan);
        }
    }
}