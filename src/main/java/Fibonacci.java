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

        while (soma + somaAnterior < 300){
            soma = soma + somaAnterior;
            somaAnterior = soma - somaAnterior;
            lista.add(soma);
        }
        return lista;
    }
}
