import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Funcao {
    public static void main(String[] args) {
        func();
        System.out.println(func().toString());

    }
    private static List<Double> func() {

        ArrayList<Double> arrayList = new ArrayList<>();

        double i = 1;
        do {

            i = (((i * 3.0) + 100.0) / 2.0);
            if (i < 500){
                arrayList.add(i);
            }

        }while (i < 500);

        return arrayList;
    }
}
