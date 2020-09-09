import java.util.Set;

public class TestaAlunosMatriculados {

    public static void main(String[] args) {

       Curso javaCollections = new Curso("Java Collections", "Joao");

       Aluno a1 = new Aluno("Joao", 2323);
       Aluno a2 = new Aluno("Bianca", 3233);
       Aluno a3 = new Aluno("Juliana", 222);
       Aluno a4 = new Aluno("Kafe", 2032);

       javaCollections.adicionaAluno(a1);
       javaCollections.adicionaAluno(a2);
       javaCollections.adicionaAluno(a3);


        System.out.println(a1.hashCode());

       javaCollections.getAlunos().forEach(aluno -> {
           System.out.println(aluno);
       });
    }
}
