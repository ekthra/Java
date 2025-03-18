import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        int escolha1, escolha2;

        do {
            

            System.out.print("Digite seu nome: ");
            pessoa.setNome(input.next());

            System.out.print("Digite sua idade: ");
            pessoa.setIdade(input.nextInt());

            System.out.print("Digite sua altura em centímetros: ");
            pessoa.setAltura(input.nextDouble());

            pessoa.aniversario();

            System.out.println(pessoa.getNome() + " seu aniversário chegou, parabéns!!!\nSua nova idade é: " + pessoa.getIdade());
            System.out.println("Sua nova idade é de: " + pessoa.getAltura());

        } while (escolha1 != 999);
    }
}