import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Joao");
        pessoas.put(24, "Bianca");
        pessoas.put(15, "Juliana");
        pessoas.put(2, "Kafe");

        pessoas.keySet().forEach(integer -> {
            System.out.println(pessoas.get(integer));
        });
    }
}
