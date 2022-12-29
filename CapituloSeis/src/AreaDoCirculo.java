import java.util.Scanner;

public class AreaDoCirculo {
    static double area (double r){ return Math.PI*2*r;}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Qual o raio do circulo?");
        double raio = scan.nextDouble();
        double resultado = area(raio);
        System.out.printf("A area do circulo de raio %.2f é %.2f", raio, resultado);
    }
}



/*(Área de círculo) Escreva um aplicativo que solicita ao usuário o raio de um círculo e utiliza um método chamado circleArea para
calcular a área do círculo*/