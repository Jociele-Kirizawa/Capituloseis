import java.math.*;
import java.util.Scanner;

public class ArredondandoNumero {

    static double y (double x){ return Math.floor(x + 0.5);}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero ponto decimal");
        double numero = scan.nextDouble();

        System.out.println("Numero original " + numero);
        System.out.println(y(numero));


    }
}

/*(Arredondando números) Math.floor pode ser utilizado para arredondar valores ao número inteiro mais próximo — por exemplo,
y = Math.floor(x + 0.5);
arredondará o número x para o inteiro mais próximo e atribuirá o resultado a y. Escreva um aplicativo que lê valores double e utiliza a
instrução anterior para arredondar cada um dos números para o inteiro mais próximo. Para cada número processado, exiba ambos os números, o original e o arredondado.*/