public class Aula implements Comparable<Aula>{

    private String titulo;
    private int tempo;

    public Aula(String nome, int tempo) {
        this.titulo = nome;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "titulo='" + this.titulo + '\'' +
                ", tempo=" + this.tempo +
                '}';
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo);
    }
}
