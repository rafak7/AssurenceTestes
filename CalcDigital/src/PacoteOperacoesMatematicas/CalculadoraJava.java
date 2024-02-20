package PacoteOperacoesMatematicas;

public class CalculadoraJava {
    // atributo de saída
    private int resultado = 0;

    // método somar dois números inteiros, retornando um número inteiro
    public int somar( int n1, int n2 ){

        resultado = n1 + n2;
        return resultado;
    }

    // método subtrair dois números inteiros, retornando um número inteiro
    public int subtrair( int n1, int n2 ){

        resultado = n2 - n1;
        return resultado;
    }        

    // método multiplicar dois números inteiros, retornando um número inteiro
    public int multiplicar( int n1, int n2 ){

        resultado = n1 * n2;
        return resultado;
    }

    // método dividir dois números inteiros, retornando um número inteiro
    public float dividir( int n1, int n2 ){

        resultado = n1 / n2;
        return resultado;
    }
}
