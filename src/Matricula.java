import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    Date dataMa = new Date();

    public Matricula(Aluno aluno, Curso curso, Date dataMa) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataMa = dataMa;
    }
}
