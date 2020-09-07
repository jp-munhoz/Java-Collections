import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas);

        aulas.remove(0);
        System.out.println(aulas);

        //Iterando1
        for (String aula: aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("Primeira aula: " + primeiraAula);

        //Iterando2
        for(int i = 0; i < aulas.size(); i++){
            System.out.println(aulas.get(i));
        }

        System.out.println(aulas.size());

        //Iterando3
        aulas.forEach(aula -> {
            System.out.println("percorrendo: " + aula);
        });

        aulas.add("Aumentando nosso conhecimento");
        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
