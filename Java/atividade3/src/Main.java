import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Imc imcc = new Imc();
    System.out.print("Qual o seu nome?  ");
    imcc.setNome(input.next());
    System.out.print("Qual sua altura?  ");
    imcc.setAltura(input.nextDouble());
    System.out.print("Qual o seu peso?  ");
    imcc.setPeso(input.nextDouble());

    if (imcc.calculo_imc() < 18.5){
            System.out.println("Olá "+imcc.getNome()+" com a altura de "+imcc.getAltura()+"m e um peso de "+imcc.getPeso()+"kg," +
                    " você está abaixo do" +
                    " peso.");

    } else if (imcc.calculo_imc() >= 25 && imcc.calculo_imc()  <= 29.9){
            System.out.println("Olá "+imcc.getNome()+" com a altura de "+imcc.getAltura()+"m e um peso de "+imcc.getPeso()+"kg, você está acima do" +
                    " peso.");

    }  else if (imcc.calculo_imc() >= 30){
            System.out.println("Olá "+imcc.getNome()+" com a altura de "+imcc.getAltura()+"m e um peso de "+imcc.getPeso()+"kg, você está" +
                    " " +
                "com " +
                    "niveis de obsidade");
    }   else {
            System.out.println("Olá "+imcc.getNome()+" com a altura de "+imcc.getAltura()+"m e um peso de "+imcc.getPeso()+"kg, você está com peso " +
                    "normal");
    }


    }
}