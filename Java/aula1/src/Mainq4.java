public class Mainq4 {
    public static void main(String[] args) {

        double salario = 1750.05;
        double desconto1;
        double desconto2;
        double desconto3;

        if (salario < 901) {
            System.out.println("Seu salário é de:"+salario);
        } else if (salario >= 901 && salario <= 1500) {
            desconto1 = salario - (salario * 0.05);
            System.out.println("Seu salario é de:"+desconto1);
        } else if (salario >= 1501 && salario <= 2499) {
            desconto2 = salario - (salario * 0.1);
            System.out.println("Seu salário é de:"+desconto2);
        }   else {
            desconto3 = salario - (salario * 0.2);
            System.out.println("Seu salário é de:"+desconto3);
        }
    }
}
