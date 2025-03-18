import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int escolha;
        do {
            System.out.print("Escolha um número [1] [2] [3]: ");
            escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Opção 1 escolhida");
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida");
                    break;
                case 3:
                    System.out.println("Opção 3 escolhida");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.print("Se quiser parar, digite [0]: ");
            escolha = input.nextInt();
        } while (escolha != 0);
    }
}