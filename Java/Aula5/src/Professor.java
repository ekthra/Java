import java.util.Scanner;

public class Professor extends Pessoa {
    private String disciplina;
    private double salario;
    Scanner sc = new Scanner(System.in);
    Pessoa pessoa = new Pessoa();

    public void aumento_reducao(int escolha){
        if(escolha == 1){
            System.out.print("Quanto você deseja reduzir no salário do(a) professor(a) "+pessoa.getNome()+": ");
            double reducao = sc.nextDouble();
            salario -= reducao;
        } else {
            System.out.print("Quanto você deseja aumentar no salário do(a) professor(a) "+pessoa.getNome()+": ");
            double aumento = sc.nextDouble();
            salario -= aumento;
        }
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
}
