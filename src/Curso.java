import java.util.Objects;

public class Curso {
    private String nomeCurso;
    private int codCurso;

    public Curso(String nomeCurso, int codCurso) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codCurso == curso.codCurso &&
                Objects.equals(nomeCurso, curso.nomeCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCurso, codCurso);
    }
}
