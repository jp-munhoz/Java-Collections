import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {

        Aula a1 = new Aula("Revisitando Array", 21);
        Aula a2 = new Aula("Lista de Objetos", 16);
        Aula a3 = new Aula("Relacionamento de listas de objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<Aula>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        Collections.sort(aulas);

        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);


    }
}
