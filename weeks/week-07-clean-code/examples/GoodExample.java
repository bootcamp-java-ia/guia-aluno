public class GoodExample {

    public static void main(String[] args) {
        int primeiroNumero = 10;
        int segundoNumero = 20;

        int soma = somar(primeiroNumero, segundoNumero);

        System.out.println(soma);
    }

    static int somar(int a, int b) {
        return a + b;
    }
}