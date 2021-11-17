package Revisão.exe2;

public class Aluno {
    private String matricula;
    private String nome;
    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Aluno) {
            Aluno outro = (Aluno) obj;
            return this.matricula.equals(outro.matricula);
        }
        return false;
    }
    @Override
    public int hashCode() {
final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }
    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + "]";
    }
}
