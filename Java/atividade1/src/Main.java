import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Numeros numeros = new Numeros();
        int escolha;
        do {
            System.out.print("Digite um número: ");
            numeros.primeiro = input.nextDouble();

            System.out.print("Digite outro número: ");
            numeros.segundo = input.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.print("Soma          [1]\nSubtração     [2]\nMultiplicação [3]\nDivisão       [4]\nEscolha: ");
            escolha = input.nextInt();

            switch (escolha) {

                case 1:
                    numeros.soma();
                    break;
                case 2:
                    numeros.subtracao();
                    break;
                case 3:
                    numeros.multi();
                    break;
                case 4:
                    numeros.divi();
                    break;
                default:
                    escolha = -9999;


            }
            if (escolha != -9999) {
                System.out.print("Para parar, digite [0]: ");
                escolha = input.nextInt();
            }else {
                System.out.println("Escolha inválida!");
            }
        }while (escolha != 0);

    }
}