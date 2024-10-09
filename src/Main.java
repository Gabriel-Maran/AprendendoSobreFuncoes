public class Main {
    public static void main(String[] args) {
        int primeiroN = 5;
        int segundoN = 2;
        int somaViaFuncao = somarValores(primeiroN, segundoN);
        int subtViaFuncao = subtValores(primeiroN, segundoN);
        int multViaFuncao = multValores(primeiroN, segundoN);
        Double divViaFuncao4 = divValores(primeiroN, segundoN);
        System.out.println("Valor soma: " + somaViaFuncao);
        System.out.println("Valor subtração: " + subtViaFuncao);
        System.out.println("Valor multiplicação: " + multViaFuncao);
        System.out.println("Valor divisão: " + divViaFuncao4);
    }

    public static int somarValores(int numA, int numB) {
        return numA + numB;
    }

    public static int subtValores(int numA, int numB) {
        if (numA < 0) {
            numA = numA * -1;
            return numA - numB;
        } else {
            return numA - numB;
        }
    }

    public static int multValores(int numA, int numB) {
        return numA * numB;
    }

    public static Double divValores(double numA, double numB) {
        if (numB == 0) {
            return Double.NaN;
        } else {
            return numA / numB;
        }
    }
}

