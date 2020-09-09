import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosComSet {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Pedro");
        alunos.add("Bianca");
        alunos.add("Juliana");
        alunos.add("Kafe");

        System.out.println(alunos.size());

        //Em um set nao pode adicionar dois objetos iguais.
        boolean adicionou = alunos.add("Bianca");
        System.out.println(adicionou);

        System.out.println(alunos.size());
    }
}
