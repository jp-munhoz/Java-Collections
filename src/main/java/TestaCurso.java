public class TestaCurso {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as Collections", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalgando com collections", 22));
        javaColecoes.adiciona(new Aula("Criando uma aula", 25));
        javaColecoes.adiciona(new Aula("Aula doida", 11));
        
        
        System.out.println(javaColecoes.getAulas());

    }
}
