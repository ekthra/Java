import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();


        System.out.print("Digite seu nome: ");
        pessoa.nome = input.next();

        System.out.print("Digite sua idade: ");
        pessoa.idade = input.nextInt();

        System.out.print("Digite sua altura em centímetros: ");
        pessoa.altura = input.nextDouble();

        pessoa.aniversario();

        System.out.println(pessoa.nome + " seu aniversário chegou, parabéns!!!\nSua nova idade é: "+ pessoa.idade);
        System.out.println("Sua nova idade é de: "+ pessoa.altura);
    }
}