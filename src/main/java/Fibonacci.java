import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        List<Integer> fibonacci = fibonacci();
        fibonacci.forEach(numero -> {
            if (numero % 2 == 0)
            System.out.println(numero);
        });
    }
    private static List<Integer> fibonacci () {

        ArrayList<Integer> lista = new ArrayList<>();

        int soma = 1;
        int somaAnterior = 0;

        for (int n = 1; n < 300; n++){
            if (soma + somaAnterior > 300 ){
                break;
            }
            if ( n < 2 ){
                lista.add(n);
            }else {
                soma = soma + somaAnterior;
                somaAnterior = soma - somaAnterior;
                lista.add(soma);
            }
        }
        return lista;
    }
}
