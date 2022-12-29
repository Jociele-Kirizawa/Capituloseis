import java.util.Scanner;

public class Hipotenusa2 {
    static double hipotenusa2(double x, double y){ return Math.hypot(x,y);}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual primeiro lado do triangulo?");
        double lado1= scan.nextDouble();
        System.out.println("Qual segundo lado do triangulo?");
        double lado2 = scan.nextDouble();

        double resultado = hipotenusa2(lado1, lado2);
        System.out.printf("O resultado de hipotenusa de um triangula de lados %.2f e %.2f é %.2f ", lado1, lado2, resultado);
    }
}
