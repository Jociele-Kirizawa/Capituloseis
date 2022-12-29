import java.math.*;
import java.util.Scanner;

public class Hipotenusa {
    static double hipotenusa(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual primeiro lado do triangulo?");
        double lado1= scan.nextDouble();
        System.out.println("Qual segundo lado do triangulo?");
        double lado2 = scan.nextDouble();

       double resultado = hipotenusa(lado1, lado2);
        System.out.printf("O resultado de hipotenusa de um triangula de lados %.2f e %.2f é %.2f ", lado1, lado2, resultado);
    }
}
