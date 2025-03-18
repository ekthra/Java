public class Numeros {
    double primeiro;
    double segundo;

    double resultado;

    public void soma() {
        resultado = primeiro + segundo;
        System.out.println("A soma de "+primeiro+" e "+segundo+" resulta em: "+resultado);
    }
    public void subtracao() {
        resultado = primeiro - segundo;
        System.out.println("A subtração de "+primeiro+" e "+segundo+" resulta em: "+resultado);
    }
    public void multi() {
        resultado = primeiro * segundo;
        System.out.println("A multiplicação de "+primeiro+" e "+segundo+" resulta em: "+resultado);
    }
    public void divi() {
        resultado = primeiro / segundo;
        System.out.println("A divisão de "+primeiro+" por "+segundo+" resulta em: "+resultado);
    }
}

