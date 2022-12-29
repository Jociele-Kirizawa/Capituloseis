import java.util.Random;

public class Bingo {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] bingo = new int[5];
        int contador = 0;


        for (int i = 0; i < 5; i++) {
            bingo[i] = aleatorio.nextInt(60);
            System.out.print(bingo[i] + " ");
        }

        System.out.println();

        while (contador<5) {
            int sorteiro;

            int sorteio = aleatorio.nextInt(60);

            for (int i = 0; i < bingo.length; i++) {
                if (sorteio == bingo[i]) {
                    System.out.print(sorteio + "  ");
                    bingo[i]= -1;
                    contador += 1;

                }
            }

        }


    }
}