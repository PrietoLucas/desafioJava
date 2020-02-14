public class ProfTitulares extends Professores {
    private String especialidade;

    public ProfTitulares(String nomeProf, String sobrenomeP, int tempoCasa, int codProfessor, String especialidade) {
        super(nomeProf, sobrenomeP, tempoCasa, codProfessor);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
