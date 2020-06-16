package app.instrucoes;

public class UltimosRecursosLoop {
    public static void main(String[] args) {

        int[][] temps = {{-1,4,7,8},{10,15,20,17},{30,22,45,19},
                         {20,26,-40,8},{17,26,15,8},{30,22,20,19}};

        loop_dia:
        for (int dia = 0; dia < temps.length; dia++) {
            System.out.println("Validando as temps do dia " + (dia+1));

            int tAnt = temps[dia][0];

            for (int hora = 0; hora < temps[dia].length; hora++) {

                int tAtual = temps[dia][hora];
                int variacao = tAtual - tAnt;

                if (tAtual < -10 || tAtual > 40) {
                    System.out.println("Dia " + (dia + 1) + " ignorado, temperatura errada: " + tAtual);
                    continue loop_dia;
                }

                if (variacao > 10 || variacao < -10) {
                    System.out.println("Alerta vermelho, a temperatura do dia " + (dia + 1) +
                                        " variou de " + tAnt + " para " + tAtual);
                    
                    break loop_dia;
                }

                tAnt = tAtual;

            }

        }

        System.out.println("\nMuito obrigado por usar nosso programa de temp...");
    }
}