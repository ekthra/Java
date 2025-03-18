import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int escolha = 0;

        do{
            Scanner input2 = new Scanner(System.in);
            System.out.print("Digite seu nome e sobrenome: ");
            String nome_sobrenome = input2.nextLine();
            System.out.print("Digite sua idade: ");
            int idade = input.nextInt();
            System.out.print("Digite sua altura em metros: ");
            double altura = input.nextDouble();

            System.out.println("\nSeu nome é: "+nome_sobrenome+"\nSua idade é: "+idade+"\nSua altura é: "+altura+"m");

            System.out.print("Para cadastrar mais alguém, digite [0]  ");
            escolha = input.nextInt();
        } while(escolha == 0);
    }
}
