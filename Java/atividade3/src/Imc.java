public class Imc {

    private String nome;
    private double peso;
    private double altura;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double calculo_imc() {
        double imc = peso / (altura * altura);
        return imc;
    }

}
