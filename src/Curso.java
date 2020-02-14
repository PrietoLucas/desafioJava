import java.util.List;
import java.util.Objects;

public class Curso {
    private String nomeCurso;
    private int codCurso;
    private ProfTitulares profTitulares;
    private ProfAdjuntos profAdjuntos;
    private Aluno aluno;
    private List<Aluno> listaAlunos;
    private int quantidadeAlunos = 20;

    public Curso(String nomeCurso, int codCurso, ProfTitulares profTitulares, ProfAdjuntos profAdjuntos, List<Aluno> listaAlunos, int quantidadeAlunos) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
        this.profTitulares = profTitulares;
        this.profAdjuntos = profAdjuntos;
        this.listaAlunos = listaAlunos;
        this.quantidadeAlunos = quantidadeAlunos;
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

    public ProfTitulares getProfTitulares() {
        return profTitulares;
    }

    public void setProfTitulares(ProfTitulares profTitulares) {
        this.profTitulares = profTitulares;
    }

    public ProfAdjuntos getProfAdjuntos() {
        return profAdjuntos;
    }

    public void setProfAdjuntos(ProfAdjuntos profAdjuntos) {
        this.profAdjuntos = profAdjuntos;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return codCurso == curso.codCurso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codCurso);
    }

    public Boolean adicionarUmAluno(Aluno umAluno){
        Aluno.add(umAluno)
    }

    public void excluirAluno(Aluno umAluno){

    }
}

