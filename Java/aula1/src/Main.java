

public class Main {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 40;
        double num3 = 20;
        double num4 = 40;
        int num5 = -20;
        int num6 = 60;
        int totalsoma;
        int totalsub;
        double totaldiv;
        int totalmulti;



        totalsoma = num1+num2;
        totalsub = num1-num2;
        totaldiv = num3/num4;
        totalmulti = num1*num2;

        System.out.println(totalsoma);
        System.out.println(totalsub);
        System.out.println(totaldiv);
        System.out.println(totalmulti);

        if (totalsoma>num2 && num6==totalsoma) {
            System.out.println("A soma dos dois números é igual ao sexto número");
        } else if (num6==totalsoma && num5 == totaldiv) {
           System.out.println("A soma dos dois primeiros números é igual ao num6 e o num5 é igual a divisão");
        } else System.out.println("A soma dos dois primeiros números é diferente do num6, o num5 é diferente da divisão e a soma não é maior que o num2");
    }
}
