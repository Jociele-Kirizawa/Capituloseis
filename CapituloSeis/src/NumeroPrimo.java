public class NumeroPrimo {
    static boolean primo(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false; //significa que ele é divisivel por mais numeros além dele e 1
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i < 10000; i++) {

            if (primo(i)==true) {
                System.out.print(i + " ");
                total += 1;
            }

        }
        System.out.println();
        System.out.println();
        System.out.print("O total é: " + total);

    }
}
/*(Números primos) Um número inteiro positivo é primo se for divisível apenas por 1 e por ele mesmo. Por exemplo, 2, 3, 5 e 7 são primos,
mas 4, 6, 8 e 9 não são. O número 1, por definição, não é primo.
a) Escreva um método que determina se um número é primo.
b) Utilize esse método em um aplicativo que determina e exibe todos os números primos menores que 10.000. Quantos números até 10.000
você precisa testar a fim de assegurar que encontrou todos os primos?*/