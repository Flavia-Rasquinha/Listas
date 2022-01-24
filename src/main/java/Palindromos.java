import java.util.Arrays;
import java.util.List;

public class Palindromos {
    public static void main(String[] args) {
                 List<String> texto = Arrays.asList("BATATA", "ANA", "TIJOLO", "RENNER", "REVIVER", "MARTELO", "A SACADA DA CASA");
            
            texto.forEach(str -> {
                verificaPalidromo(str);
              }
            );
        }

    public static void verificaPalidromo(String texto) {
        String textoSemEspaco = texto.replaceAll(" ", "");
        String invertida = new StringBuffer(textoSemEspaco).reverse().toString();
        if (textoSemEspaco.equals(invertida)) {
            System.out.println(texto);


        }
    }
}

