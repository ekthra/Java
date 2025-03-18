import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();


        System.out.print("Digite seu nome: ");
        pessoa.setNome( input.next());

        System.out.print("Digite sua idade: ");
        pessoa.setIdade(input.nextInt());

        System.out.print("Digite sua altura em centímetros: ");
        pessoa.setAltura(input.nextDouble());

        System.out.print("Digite seu peso em kilogramas: ");
        pessoa.setPeso(input.nextDouble());

        System.out.print("Digite seu cpf com simbolos:");
        pessoa.setCpf(input.next());

        System.out.print("Digite uma das opções para seu gênero:\nMasculino [1]\n Feminino [2]");
        pessoa.setGenero(input.nextInt());

        pessoa.aniversario();

        System.out.println(pessoa.getNome() + " seu aniversário chegou, parabéns!!!\nSua nova idade é: "+ pessoa.getIdade());
        System.out.println("Sua nova altura é de: "+ pessoa.getAltura());
        System.out.println("Seu peso continua: "+pessoa.getPeso()+"\nSeu cpf para sempre será: "+pessoa.getCpf());
        if (pessoa.getGenero() == 1) {
            System.out.println("Seu gênero é: Masculino");
        } else if (pessoa.getGenero() == 2) {
            System.out.println("Seu gênero é: Feminino");
        } else {
            System.out.println("Opção inválida de gênero");
        }

        }

}