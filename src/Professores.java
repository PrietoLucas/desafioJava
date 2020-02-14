import java.util.Objects;

public class Professores {
    private String nomeProf;
    private String sobrenomeP;
    private int tempoCasa;
    private int codProfessor;

    public Professores(String nomeProf, String sobrenomeP, int tempoCasa, int codProfessor) {
        this.nomeProf = nomeProf;
        this.sobrenomeP = sobrenomeP;
        this.tempoCasa = tempoCasa;
        this.codProfessor = codProfessor;
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getSobrenomeP() {
        return sobrenomeP;
    }

    public void setSobrenomeP(String sobrenomeP) {
        this.sobrenomeP = sobrenomeP;
    }

    public int getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(int tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    public int getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(int codProfessor) {
        this.codProfessor = codProfessor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professores that = (Professores) o;
        return tempoCasa == that.tempoCasa &&
                codProfessor == that.codProfessor &&
                Objects.equals(nomeProf, that.nomeProf) &&
                Objects.equals(sobrenomeP, that.sobrenomeP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeProf, sobrenomeP, tempoCasa, codProfessor);
    }
}
