import java.util.ArrayList;
import java.util.Collections;

public class Testes {

    public static void main(String[] args) {

        String nome1 = "joao";
        String nome2 = "bianca";
        String nome3 = "juliana";

        ArrayList<String> lista = new ArrayList<>();
        lista.add(nome1);
        lista.add(nome2);
        lista.add(nome3);

        System.out.println(lista);

        Collections.sort(lista);
        for (String itensLista : lista) {
            System.out.println(itensLista);
        }
    }
}
