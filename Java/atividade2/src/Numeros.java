public class Numeros {
    double resultado;
    public void soma(double primeiro, double segundo) {
        resultado = primeiro + segundo;
        System.out.println("A soma de "+primeiro+" e "+segundo+" resulta em: "+resultado);
    }
    public void subtracao(double primeiro, double segundo) {
        resultado = primeiro - segundo;
        System.out.println("A subtração de "+primeiro+" e "+segundo+" resulta em: "+resultado);
    }
    public void multi(double primeiro, double segundo) {
        resultado = primeiro * segundo;
        System.out.println("A multiplicação de "+primeiro+" e "+segundo+" resulta em: "+resultado);
    }
    public void divi(double primeiro, double segundo) {
        resultado = primeiro / segundo;
        System.out.println("A divisão de "+primeiro+" por "+segundo+" resulta em: "+resultado);
    }
}