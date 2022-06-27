import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

public class App {
    public static void main(String[] args) throws Exception {



        ArrayList<Integer> list = new ArrayList<Integer>();
        Integer media = 0;
        Integer mediana = 0;
        
        for (int index = 0; index <= 100; index++) {
           list.add(index);
        }

        if (list.isEmpty() == true) {
            System.out.println("Array vazio!");
        }else {
            Optional<Integer> soma = list.stream().reduce((x, j) -> x + j);       
            media = soma.get() / list.size();
            mediana = (list.get(50) + list.get(51))/2;

            System.out.println(soma.get());
            System.out.println(Collections.max(list));
            System.out.println(Collections.min(list));
            System.out.println(media);
            System.out.println(mediana);
        }
    }
}
