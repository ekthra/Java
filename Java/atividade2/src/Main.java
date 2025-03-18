import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Numeros numeros = new Numeros();
        int escolha;

        do {
            System.out.print("Digite um número: ");
            double primeiro = input.nextDouble();
            System.out.print("Digite outro número: ");
            double segundo = input.nextDouble();
            System.out.print("Soma          [1]\nSubtração     [2]\nMultiplicação [3]\nDivisão       [4]\nEscolha: ");
            escolha = input.nextInt();

            switch (escolha) {

                case 1:
                    numeros.soma(primeiro, segundo);
                    break;
                case 2:
                    numeros.subtracao(primeiro, segundo);
                    break;
                case 3:
                    numeros.multi(primeiro, segundo);
                    break;
                case 4:
                    numeros.divi(primeiro, segundo);
                    break;
                default:
                    escolha = -9999;
            }

            if (escolha != -9999) {
                System.out.print("Para parar, digite [0]: ");
                escolha = input.nextInt();
            } else {
                System.out.println("Escolha inválida!");
                System.out.print("Para parar, digite [0]: ");
                escolha = input.nextInt();
            }
        } while (escolha != 0);
    }
}