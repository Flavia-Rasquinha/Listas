import java.util.ArrayList;
import java.util.List;

public class Primos {
    public static void main(String[] args) {
        System.out.println("Números Primos: " + primos());

    }
    private static List<Integer> primos() {
        ArrayList<Integer> primos = new ArrayList<>();

        for (int n1 = 1; n1 <= 500; n1++) {
            int verificadorPrimo = 0;
            for (int n2 = 1; n2 <= n1; n2++) {
                if (n1 % n2 == 0) ++verificadorPrimo;
            }
            if (verificadorPrimo == 2) {
                primos.add(n1);
            }
        }
            return primos;
    }
}



