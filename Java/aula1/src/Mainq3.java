public class Mainq3 {
    public static void main(String[] args){

        double nota1 = 9.6;
        double nota2 = 1.7;
        double nota3 = 9.8;
        double somanotas;
        double media;

        somanotas = nota1+nota2+nota3;
        media = somanotas/3;

        if (media>7) {
            System.out.println("O aluno está aprovado!");
        } else if (media<4) {
            System.out.println("O aluno está reprovado!");
        } else System.out.println("O aluno está na final!");
    }
}
