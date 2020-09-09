import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();

    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<Integer, Aluno>();

    private Set<Aluno> alunos = new HashSet<Aluno>();

    public Curso(String nome, String instrutor) {
        if (nome == null){
            throw new NullPointerException("Nome nao pode ser nulo");
        }
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public void iterator(){
        aulas.forEach(aula -> {
            System.out.println(aula);
        });
    }

    public int getTempoTotal(){
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "Curso " +
                "nome='" + nome + '\'' +
                ", instrutor='" + instrutor + '\'' +
                ", aulas=" + aulas +
                "tempo das aulas = " + getTempoTotal();
    }

    public void adicionaAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public Set<Aluno> getAlunos(){
        return Collections.unmodifiableSet(alunos);
    }

    boolean estaMatriculado(Aluno aluno){
        return this.alunos.contains(aluno);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(nome, curso.nome) &&
                Objects.equals(instrutor, curso.instrutor) &&
                Objects.equals(aulas, curso.aulas) &&
                Objects.equals(alunos, curso.alunos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, instrutor, aulas, alunos);
    }

    public void matricula(Aluno aluno){
        this.alunos.add(aluno);

        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Aluno buscaMatriculado(int numero){
        return this.matriculaParaAluno.get(numero);
    }
}
