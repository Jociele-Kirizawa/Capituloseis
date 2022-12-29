import java.util.Scanner;

public class TaxaEstacionamento {

    static double TaxaEstacionamento (double x){
        if (x <= 3) {
            return 2.0;
        }else {
            double resultado = (x-3)* 0.5 + 2;
            if (resultado > 10) {
                return 10.0;
            } else {
                return resultado;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas horas voce ficou no estacionamento?");
        double horas = scan.nextDouble();
        double valor = TaxaEstacionamento(horas);
        System.out.printf("Voce ficou por %.2f horas e vai pagar %.2f: ", horas, valor);
    }

}






/*(Taxas de estacionamento) Um estacionamento cobra uma tarifa mínima de R$ 2,00 para estacionar por até três horas. Um adicional
de R$ 0,50 por hora não necessariamente inteira é cobrado após as três primeiras horas. A tarifa máxima para qualquer dado período
de 24 horas é R$ 10,00. Suponha que nenhum carro fique estacionado por mais de 24 horas por vez. Escreva um aplicativo que calcule e
exiba as tarifas de estacionamento para cada cliente que estacionou nessa garagem ontem. Você deve inserir as horas de estacionamento
para cada cliente. O programa deve exibir a cobrança para o cliente atual e calcular e exibir o total dos recibos de ontem. Ele deve utilizar
o método calculateCharges para determinar a tarifa para cada cliente.*/