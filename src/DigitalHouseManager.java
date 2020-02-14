import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Curso> listaCurso = new ArrayList<>();
    private List<ProfAdjuntos> listaAdjuntos = new ArrayList<>();
    private List<ProfTitulares> lisaTitulares = new ArrayList<>();

    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaxima){
        Curso curso = new Curso(nome, codigoCurso, quantidadeMaxima);
        listaCurso.add(curso);
        System.out.println(curso);
    }

    public void excluirCurso(Integer codCurso){
        //listaCurso.removeIf(curso -> curso.getCodCurso().equals(codCurso));
        listaCurso.removeIf(curso -> curso.getCodCurso() == codCurso);

    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){
        ProfAdjuntos profAdjuntos = new ProfAdjuntos(nome, sobrenome, codigoProfessor, quantidadeDeHoras);
        listaAdjuntos.add(profAdjuntos);
        System.out.println(profAdjuntos);
    }

    public void registrarProfessorTitular(String nome, String sobrenome,Integer tempoCasa, Integer codigoProfessor, String especialidade){
        ProfTitulares profTitulares = new ProfTitulares(nome,sobrenome,tempoCasa,codigoProfessor,especialidade);
        lisaTitulares.add(profTitulares);
        System.out.println(profTitulares);
    }

    public void excluirProfessor(Integer codigoProfessor){

    }

}
