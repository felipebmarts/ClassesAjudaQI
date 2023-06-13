package AJUDAQI;

public class Disciplina {
    private Integer id;
    private String NomeDisciplina;
    private String Curso;
    private Integer Periodo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeDisciplina() {
        return NomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        NomeDisciplina = nomeDisciplina;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public Integer getPeriodo() {
        return Periodo;
    }

    public void setPeriodo(Integer periodo) {
        Periodo = periodo;
    }


}
