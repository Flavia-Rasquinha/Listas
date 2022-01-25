import java.util.ArrayList;
import java.util.List;

public class Funcao {
    public static void main(String[] args) {
        func();
        System.out.println(func().toString());

    }
    private static List<Double> func() {

        ArrayList<Double> arrayList = new ArrayList<>();

        int i = 1;
        do {

            Double resultadoFunc = (double) (i * 3 + 100 / 2);
            arrayList.add(resultadoFunc);

            if (resultadoFunc >= 500 ){
                break;
            }
            i++;
        }while (i > 0);

        return arrayList;
    }
}
