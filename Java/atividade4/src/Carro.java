public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, int portas){
        super(marca);
        this.portas = portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }
}
