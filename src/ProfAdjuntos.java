public class ProfAdjuntos extends Professores {
    private int horasMo;

    public ProfAdjuntos(String nomeProf, String sobrenomeP, int tempoCasa, int codProfessor, int horasMo) {
        super(nomeProf, sobrenomeP, tempoCasa, codProfessor);
        this.horasMo = horasMo;
    }

    public ProfAdjuntos(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {
        super(nome, sobrenome, codigoProfessor, quantidadeDeHoras);
    }

    public int getHorasMo() {
        return horasMo;
    }

    public void setHorasMo(int horasMo) {
        this.horasMo = horasMo;
    }
}
