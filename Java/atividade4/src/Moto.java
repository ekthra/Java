public class Moto extends Veiculo{
    private int cilindradas;
    public Moto(){
    }
    public Moto(String marca, int cilindradas){
        super(marca);
        this.cilindradas = cilindradas;

    }
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;

    }
    public int getCilindradas() {
        return cilindradas;
    }
}
